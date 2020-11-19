package com.goxda.check.encapsulation;

import lombok.Data;

import java.util.List;

@Data
public class DocumentData {
    private String documentId;
    private List<Encoding> encodings;
}
