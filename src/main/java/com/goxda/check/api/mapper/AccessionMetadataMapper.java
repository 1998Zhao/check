package com.goxda.check.api.mapper;

import com.goxda.check.api.entity.AccessionMetadata;
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
public interface AccessionMetadataMapper extends BaseMapper<AccessionMetadata> {
    /**
     * 获取 收文元数据
     * @param entryId 对应条目
     * @return
     */
    List<AccessionMetadata> getMetadata(String entryId);
}
