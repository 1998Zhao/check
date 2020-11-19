package com.goxda.check.api.mapper;

import com.goxda.check.api.entity.Encodings;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ah
 * @since 2020-11-19
 */
@Mapper
@Repository
public interface EncodingsMapper extends BaseMapper<Encodings> {

}
