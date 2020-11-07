package com.goxda.check.api.service;

import com.goxda.check.api.entity.Metadata;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ah
 * @since 2020-11-06
 */
public interface IMetadataService extends IService<Metadata> {
    /**
     * 检测重复性
     * @param c 列名
     * @param v 值
     * @return 重复 true
     */
    boolean checkRepeat(String c, String v);
}
