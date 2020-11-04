package com.goxda.check.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.goxda.check.api.entity.CheckStep;
import com.goxda.check.api.mapper.CheckStepMapper;
import com.goxda.check.api.service.ICheckStepService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ah
 * @since 2020-11-04
 */
@Service
public class CheckStepServiceImpl extends ServiceImpl<CheckStepMapper, CheckStep> implements ICheckStepService {

    /**
     * 根据 环节名字查询环节详情
     * @param name 环节名字
     * @return 环节详情
     */
    @Override
    public List<CheckStep> getCheckStepByName(String name) {
        QueryWrapper<CheckStep> wrapper = new QueryWrapper<>();
        wrapper.eq("name",name);
        return baseMapper.selectList(wrapper);
    }

    /**
     * 根据父节点id查询子节点id详情
     * @param id 父节点id
     * @return 子节点详情
     */
    @Override
    public List<CheckStep> getCheckStepsByParentId(String id) {
        QueryWrapper<CheckStep> wrapper = new QueryWrapper<>();
        wrapper.eq("parent_step_id",id);
        return baseMapper.selectList(wrapper);
    }
}
