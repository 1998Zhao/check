package com.goxda.check.api.service;

import com.goxda.check.api.entity.AccessionMetadata;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ah
 * @since 2020-11-09
 */
public interface IAccessionMetadataService extends IService<AccessionMetadata> {
    /**
     * 获取 收文元数据
     * @param entryId 对应条目ID
     * @return 对应元数据表
     */
    List<AccessionMetadata> getMetadata(String entryId);
}
