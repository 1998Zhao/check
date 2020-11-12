package com.goxda.check.api.service;

import com.goxda.check.api.entity.TransmissionMetadata;
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
public interface ITransmissionMetadataService extends IService<TransmissionMetadata> {
    /**
     * 获取发文元数据
     * @param entryId id
     * @return 元数据信息
     */
    List<TransmissionMetadata> getMetadata(String entryId);
}
