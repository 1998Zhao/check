package com.goxda.check;

import com.goxda.check.api.entity.MetadataRule;
import com.goxda.check.api.entity.MetadataRuleImage;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Word {
    public static List<MetadataRule> read(){
        String path = "C:\\Users\\admin\\Desktop\\22.docx";
        FileInputStream inputStream;
        XWPFDocument xwpfDocument;
        MetadataRule metadata ;
        Field[] fields;
        String v = null;
        List<MetadataRule> datas = new ArrayList<>();
        try {
            inputStream = new FileInputStream(path);
            xwpfDocument = new XWPFDocument(inputStream);
            List<XWPFTable> list = xwpfDocument.getTables();
            for (XWPFTable xwpfTable : list) {
                metadata = new MetadataRule();
                List<XWPFTableRow> rowList = xwpfTable.getRows();
                for (int i = 0; i < rowList.size(); i++) {
                    v = rowList.get(i).getCell(1).getText();
                    fields = metadata.getClass().getDeclaredFields();
                    fields[i+2].setAccessible(true);
                    fields[i+2].set(metadata,v);
                }
                datas.add(metadata);
            }
        } catch (IOException | IllegalAccessException e) {
            log.error(e.getMessage());
        }
        return datas;
    }
    public static List<MetadataRuleImage> readPicT(){
        String path = "D:\\44.docx";
        FileInputStream inputStream = null;
        XWPFDocument xwpfDocument;
        try{

            List<MetadataRuleImage> rules = new ArrayList<>();
            inputStream = new FileInputStream(path);
            xwpfDocument = new XWPFDocument(inputStream);
            List<XWPFTable> list = xwpfDocument.getTables();
            for (XWPFTable table : list) {
                List<String> values = new ArrayList<>();
                List<XWPFTableRow> rowList = table.getRows();
                MetadataRuleImage rule = new MetadataRuleImage();
                for (int i = 0; i < rowList.size(); i++) {
                    XWPFTableRow row = rowList.get(i);
                    StringBuilder v = new StringBuilder();
                    List<String> strings = readLine(row);
                    if (strings.size()==3){
                        List<List<String>> list1 = new ArrayList<>();
                        while (true){
                            XWPFTableRow row1 = rowList.get(i+1);
                            List<String> strings1 = readLine(row1);
                            if (strings1.size()==2){
                                break;
                            }
                            i++;
                            list1.add(strings1);
                        }
                        for (int i1 = 0; i1 < list1.size(); i1++) {
                            List<String> stringList = list1.get(i1);
                            v.append(strings.get(1)).append(":").append(stringList.get(1)).append(" ").append(strings.get(2)).append(":").append(stringList.get(2));
                            if (i1!=list1.size()-1){
                                v.append(",");
                            }
                        }
                    }
                    else {
                        v = new StringBuilder(strings.get(1));
                    }

                    values.add(v.toString());
                }
                Field[] fields = rule.getClass().getDeclaredFields();
                for (int i = 0; i < values.size(); i++) {
                    fields[i+2].setAccessible(true);
                    fields[i+2].set(rule,values.get(i));
                }
                rule.setType("1");
                rules.add(rule);
            }
            for (MetadataRuleImage rule : rules) {
                System.out.println(rule);

            }
            return rules;
        } catch (IOException | IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;

    }
    public static List<String> readLine(XWPFTableRow row){
        List<String > res = new ArrayList<>();
        List<XWPFTableCell> cells = row.getTableCells();
        for (XWPFTableCell cell : cells) {
            res.add(cell.getText());
        }
        return res;
    }
    public static void main(String[] args) {
        readPicT();
    }
}

