package com.goxda.check.encapsulation;

import lombok.Data;

/**
 * 文档
 * M215 文档标识符
 *─M19 文档序号
 *─M216 文档主从声明
 *─M22题名
 *─M217 文档数据
 */
@Data
public class Document {
    private String documentIdentifier;
    private String documentId;
    private String statementOnMainDocumentOrAttached;
    private String title;
    private DocumentData documentData;
}
