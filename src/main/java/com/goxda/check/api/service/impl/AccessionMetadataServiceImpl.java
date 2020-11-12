package com.goxda.check.api.service.impl;

import com.goxda.check.api.entity.AccessionMetadata;
import com.goxda.check.api.mapper.AccessionMetadataMapper;
import com.goxda.check.api.service.IAccessionMetadataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ah
 * @since 2020-11-09
 */
@Service
public class AccessionMetadataServiceImpl extends ServiceImpl<AccessionMetadataMapper, AccessionMetadata> implements IAccessionMetadataService {
    @Autowired
    private AccessionMetadataMapper metadataMapper;
    /**
     * 获取 收文元数据
     *
     * @return
     */
    @Override
    public List<AccessionMetadata> getMetadata(String entryId) {
        return metadataMapper.getMetadata(entryId);
    }
}
