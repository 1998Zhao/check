package com.goxda.check.api.service;

import com.goxda.check.api.entity.CheckStep;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ah
 * @since 2020-11-04
 */
public interface ICheckStepService extends IService<CheckStep> {
    /**
     * 根据 环节名字查询环节详情
     * @param name 环节名字
     * @return 环节详情
     */
    List<CheckStep> getCheckStepByName(String name);

    /**
     * 根据父节点id查询子节点id详情
     * @param id 父节点id
     * @return 子节点详情
     */
    List<CheckStep> getCheckStepsByParentId(String id);
}
