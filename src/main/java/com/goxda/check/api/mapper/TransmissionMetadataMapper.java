package com.goxda.check.api.mapper;

import com.goxda.check.api.entity.TransmissionMetadata;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ah
 * @since 2020-11-09
 */
@Repository
@Mapper
public interface TransmissionMetadataMapper extends BaseMapper<TransmissionMetadata> {
    /**
     * 获取发文元数据
     * @param entryId id
     * @return 元数据信息
     */
    List<TransmissionMetadata> getMetadata(String entryId);
}
