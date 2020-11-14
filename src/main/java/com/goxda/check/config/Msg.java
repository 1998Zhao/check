package com.goxda.check.config;

/**
 * 检验失败返回错误信息
 * @author zgq
 */
public class Msg {
    public final static String LENGTH_MSG = "数据长度不符合要求";
    public final static String TYPE_MSG = "数据类型、格式不符合要求";
    public final static String RANGE_MSG = "数据值域不符合要求";
    public final static String RATIONALITY_MSG = "数据不在合理范围内";
    public final static String CHAR_MSG = "数据包含特殊字符";
    public final static String ARCHIVAL_CODE_MSG = "档号不符合规范";
    public final static String REPEAT_MSG = "数据在数据库中重复";
    public final static String ELE_CONSISTENCY_MSG = "电子文件内容与电子属性不一致";
    public final static String METADATA_CONSISTENCY_MSG = "电子文件元数据与内容数据不一致";
    public final static String PKG_AUTHENTICITY_MSG = "归档包结构和内容不符合归档要求";
    public final static String PKG_CONSISTENCY_MSG ="归档包前后不一致";
    public final static String ELE_SIZE_MSG = "电子文件数量前后不相符";
    public final static String ELE_LENGTH_MSG = "电子文件字符数前后不相符";
    public final static String METADATA_Lacunarity_MSG = "元数据缺项";
}
