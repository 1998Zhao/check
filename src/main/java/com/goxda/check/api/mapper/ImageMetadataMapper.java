package com.goxda.check.api.mapper;

import com.goxda.check.api.entity.ImageMetadata;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ah
 * @since 2020-11-11
 */
@Repository
@Mapper
public interface ImageMetadataMapper extends BaseMapper<ImageMetadata> {

}
