package com.goxda.check.encapsulation;

import lombok.Data;

import java.util.List;

/**
 * @author zgq
 */
@Data
public class DocumentData {
    private String documentId;
    private List<Encoding> encodings;
}
