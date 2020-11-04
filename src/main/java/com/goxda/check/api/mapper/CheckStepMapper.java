package com.goxda.check.api.mapper;

import com.goxda.check.api.entity.CheckStep;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ah
 * @since 2020-11-04
 */
@Mapper
@Repository
public interface CheckStepMapper extends BaseMapper<CheckStep> {

}
