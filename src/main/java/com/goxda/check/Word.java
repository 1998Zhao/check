package com.goxda.check;

import com.goxda.check.api.entity.Metadata;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Word {
    public static List<Metadata> read(){
        String path = "C:\\Users\\admin\\Desktop\\22.docx";
        FileInputStream inputStream;
        XWPFDocument xwpfDocument;
        Metadata metadata ;
        Field[] fields;
        String v = null;
        List<Metadata> datas = new ArrayList<>();
        try {
            inputStream = new FileInputStream(path);
            xwpfDocument = new XWPFDocument(inputStream);
            List<XWPFTable> list = xwpfDocument.getTables();
            for (XWPFTable xwpfTable : list) {
                metadata = new Metadata();
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

    public static void main(String[] args) {
        read();
    }
}

