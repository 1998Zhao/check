package com.goxda.check.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ah
 * @since 2020-11-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Encodings implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 对应的封装包id
     */
    private Integer pkgId;

    /**
     * 格式信息 格式名称：XXXX，格式版本：XXX，MIME媒体类型：XXXX；格式注册系统名称：XXXX，注册ID：XXX
     */
    private String formatInformation;

    /**
     * 计算机文件名
     */
    private String computerFileName;

    /**
     * 计算机文件大小
     */
    private String computerFileSize;

    /**
     * 文档创建程序
     */
    private String documentCreatingApplication;

    /**
     * 信息系统描述
     */
    private String informationSystemDescription;

    /**
     * 数字化对象形态
     */
    private String physicalRecordCharacteristics;

    /**
     * 扫描分辨率
     */
    private String scanningResolution;

    /**
     * 扫描色彩模式
     */
    private String scanningColorModel;

    /**
     * 图像压缩方案
     */
    private String imageCompressionScheme;

    /**
     * 编码描述
     */
    private String encodingDescription;

    /**
     * 反编码关键字
     */
    private String renderingKeyword;

    /**
     * 编码数据
     */
    private transient byte[] encodingData;


}
