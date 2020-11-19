package com.goxda.check.util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;


import com.alibaba.druid.util.Base64;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/**
 * @author admin
 */
@Slf4j
public class Base64ReadUtil extends DefaultHandler{
    //元数据名称
    private String qName="";
    //文件名称
    private String filename="";
    //文件指针位置
    private int pos=0;
    private final FileWriter xmlFile =null;
    private StringBuilder outstr=null;
    private String filepath = "";
    //存放非电子文件内容
    private StringBuilder base64Str = null;
    //存放电子文件内容
    private StringBuilder base64File = null;
    /**
     * base64分块大小
     */
    private final static int BLOCKSIZE =256;
    FileOutputStream out = null;

    private String eepfile=null;
    public Base64ReadUtil(String eepfile )
    {
        this.eepfile=eepfile;

    }
    public Base64ReadUtil(String eepfile, String path )
    {
        this.eepfile=eepfile;
        this.filepath = path;
    }

    @Override
    public void startDocument() throws SAXException {
        log.info("文档打开...");
        pos = 0;
        base64File  =new StringBuilder("");
        try {
            //xmlFile = new FileWriter(this.eepfile,false);
            outstr=new StringBuilder("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
            base64File=new StringBuilder("");
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }


    @Override
    public void endDocument() throws SAXException {
        log.info("文档结束....");
        try {
            Document document = DocumentHelper.parseText(outstr.toString().trim());
            OutputFormat xmlFormat = OutputFormat.createPrettyPrint();
            xmlFormat.setEncoding("UTF-8");
            xmlFormat.setIndent("    ");

            XMLWriter output = new XMLWriter( new FileOutputStream(new File(eepfile)),xmlFormat);
            output.write( document );
            output.close();

        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String content="";
        if(this.qName.trim().equalsIgnoreCase("计算机文件名"))
        {
            content=new String(ch,start,length);
            if(content.trim().length()>0){
                if( filename.lastIndexOf(".")==-1) {
                    if("".equalsIgnoreCase(filename.trim())) {
                        filename=((filepath.endsWith("/")||this.filepath.endsWith("\\"))?filepath:(filepath + "/"))+ content;
                    } else {
                        filename=filename+content;
                    }
                } else {
                    filename=((filepath.endsWith("/")||this.filepath.endsWith("\\"))?filepath:(filepath + "/"))+ content;
                }
                outstr.append(content.replace("&", "&").replace("<", "<").replace(">", ">"));
            }
        }
        else if("编码数据".equalsIgnoreCase(this.qName.trim()))
        {
            content=new String(ch,start,length);
            if(content.trim().length()>0){
                log.info("元数据值:"+content);
                base64Str.append(content);
                base64File.append(content);
                byte[] base64byte=null;
                try {
                    //通过4位整数获取  start
                    int total=base64File.length();
                    int i =total/BLOCKSIZE ;
                    if(total>BLOCKSIZE )
                    {
                        for(int k=0;k<i;k++)
                        {
                            base64byte= Base64.base64ToByteArray(base64File.toString().substring(k*BLOCKSIZE , (k+1)*BLOCKSIZE ));
                            downfile(base64byte,filename,pos,base64byte.length);
                            pos+=base64byte.length;
                        }
                        if( this.base64File.length()>0 ) {
                            base64File.delete(0, BLOCKSIZE *i);
                        }
                    }
                    // 通过4位整数获取  end

                    base64Str = new StringBuilder();
                    if(!"".equalsIgnoreCase(base64Str.toString())) {
                        out.write(Base64.base64ToByteArray(base64Str.toString()));
                    }
                } catch (Exception e) {
                    // TODO 自动生成 catch 块
                    log.error(e.getMessage());
                }

            }

        }
        else
        {
            content=new String(ch,start,length);
            outstr.append(content.replace("&", "&").replace("<", "<").replace(">", ">"));
        }
    }
    @Override
    public void startElement(String url, String LocalName, String qName, Attributes attr) throws SAXException {

        if(qName.trim().equalsIgnoreCase("电子文件封装包"))
        {
            //处理头节点 start
//			  outstr.append(" <电子文件封装包 xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"  xsi:schemaLocation=\"http://www.saac.gov.cn/standards/ERM/encapsulation eep.css\" ");
//			  outstr.append("  xmlns=\"http://www.saac.gov.cn/standards/ERM/encapsulation\"> ");
            //处理头节点 end
            outstr.append(" <电子文件封装包>");
        }
        else
        {
            if(this.qName.trim().equalsIgnoreCase("编码数据"))
            {
                //清除base64文件内容
                if( this.base64File.length()>0 ) {
                    this.base64File.delete(0, this.base64File.length());
                }
                //换文件时复位文件指针
                this.pos=0;
            }
            log.info("开始元素:"+qName);
            outstr.append("<"+qName);
            this.qName=qName;
            for(int i=0;i<attr.getLength();i++){
                //log.info("属性"+attr.getQName(i)+"值是:"+attr.getValue(i));
                outstr.append(" ").append(attr.getQName(i)).append("=\"").append(attr.getValue(i)).append("\"");
            }
            outstr.append(">");
        }
        base64Str = new StringBuilder();
    }
    @Override
    public void endElement(String url, String LocalName, String qName) throws SAXException {
        log.info("结束元素:"+qName);
        if(this.qName.trim().equalsIgnoreCase("编码数据"))
        {
            //将剩下base64流写入到文件中
            if(this.base64File.length()!=0)
            {
                byte[] base64byte;
                try {
                    base64byte = Base64.base64ToByteArray(this.base64File.toString());
                    downfile(base64byte,filename,pos,base64byte.length);
                    //清除base64文件内容
                    if( this.base64File.length()>0 ) {
                        this.base64File.delete(0, this.base64File.length());
                    }
                } catch (Exception e) {
                    //清除base64文件内容
                    if( this.base64File.length()>0 ) {
                        this.base64File.delete(0, this.base64File.length());
                    }
                    log.error(e.getMessage());
                }

            }
            //换文件时复位文件指针
            this.pos=0;
        }
        outstr.append("</"+qName+">");
    }


    /**
     * method  分段下载文件流
     * @param 　buffer 上传文件流字节流
     * @param 　downpath 文件path
     * @param   filename  文件名
     * @param    pos 写入文件开始位置
     * @param     writeSize 一次写入文件大小
     * @return 返回无
     * @throws Exception
     */
    private  void downfile( byte[]  buffer ,String filename,int pos,int writeSize) {
        RandomAccessFile myRAFile = null;
        File  f =null;
        try
        {
            f =new File(filename);
            myRAFile = new RandomAccessFile(f, "rw");
            myRAFile.seek(pos);
            //log.info( "每片指针位置:"+pos );
            //log.info( "每片文件大小:"+writeSize );
            int total=pos+writeSize;
            log.info( "总大小:"+total );
            myRAFile.write(buffer,0,writeSize);
            f =null;
            buffer=null;
            myRAFile.close();
            myRAFile=null;
        }
        catch (Exception e) {
            log.error("下载电子文件不成功");
            try {
                f =null;
                buffer=null;
                myRAFile.close();
                myRAFile=null;
            } catch (IOException e1) {
                f =null;
                buffer=null;
                myRAFile=null;
            }
        }
    }

}
