package com.goxda.check.metadate;

/**
 * 文件或档案数字化的一组关键特征描述
 * 数字化属性
 * 子元素 数字化对象形态（M53）扫描分辨率（M54）扫描色彩模式（M55）图像压缩方案（M56）
 * @author zgq
 */
public class DigitizationAttributes implements IMetadata{
    private String digitizationAttributes;
    /**
     * 数字化对象形态
     * 被数字化文件或档案的载体类型、物理尺寸等信息的描述
     */
    private String physicalRecordCharacteristics;
    /**
     * 扫描分辨率
     * 文件或档案被数字化时，相关数字化设备所采用的取样分辨率，即单位长度内的取样点数，一般用每英寸点数(dpi)表示
     */
    private String scanningResolution;
    /**
     * 扫描色彩模式
     * 文件或档案被数字化时，相关数字化设备所采用的扫描色彩模式
     */
    private String scanningColorModel;
    /**
     * 图像压缩方案
     * 文件或档案数字化生成数字图像时所采用的压缩方案
     */
    private String imageCompressionScheme;

    public String getDigitizationAttributes() {
        return digitizationAttributes;
    }

    public void setDigitizationAttributes(String digitizationAttributes) {
        this.digitizationAttributes = digitizationAttributes;
    }

    public String getPhysicalRecordCharacteristics() {
        return physicalRecordCharacteristics;
    }

    public void setPhysicalRecordCharacteristics(String physicalRecordCharacteristics) {
        this.physicalRecordCharacteristics = physicalRecordCharacteristics;
    }

    public String getScanningResolution() {
        return scanningResolution;
    }

    public void setScanningResolution(String scanningResolution) {
        this.scanningResolution = scanningResolution;
    }

    public String getScanningColorModel() {
        return scanningColorModel;
    }

    public void setScanningColorModel(String scanningColorModel) {
        this.scanningColorModel = scanningColorModel;
    }

    public String getImageCompressionScheme() {
        return imageCompressionScheme;
    }

    public void setImageCompressionScheme(String imageCompressionScheme) {
        this.imageCompressionScheme = imageCompressionScheme;
    }
}
