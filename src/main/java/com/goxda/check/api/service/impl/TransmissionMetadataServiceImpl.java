package com.goxda.check.api.service.impl;

import com.goxda.check.api.entity.TransmissionMetadata;
import com.goxda.check.api.mapper.TransmissionMetadataMapper;
import com.goxda.check.api.service.ITransmissionMetadataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ah
 * @since 2020-11-09
 */
@Transactional(rollbackFor = {Exception.class})
@Service
public class TransmissionMetadataServiceImpl extends ServiceImpl<TransmissionMetadataMapper, TransmissionMetadata> implements ITransmissionMetadataService {
    @Autowired
    private TransmissionMetadataMapper mapper;
    /**
     * 获取发文元数据
     * @param entryId id
     * @return 元数据信息
     */
    @Override
    public List<TransmissionMetadata> getMetadata(String entryId) {
        return mapper.getMetadata(entryId);
    }
}
