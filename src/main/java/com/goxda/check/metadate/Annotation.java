package com.goxda.check.metadate;

/**
 *
 * @author zgq
 * createtime 2020-10-28
 */
public class Annotation implements IMetadata{
    private String annotation;

    public Annotation(String annotation) {
        this.annotation = annotation;
    }

    public Annotation() {
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
}
