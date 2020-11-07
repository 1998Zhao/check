package com.goxda.check.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.goxda.check.api.entity.Metadata;
import com.goxda.check.api.mapper.MetadataMapper;
import com.goxda.check.api.service.IMetadataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ah
 * @since 2020-11-06
 */
@Service
public class MetadataServiceImpl extends ServiceImpl<MetadataMapper, Metadata> implements IMetadataService {
    /**
     * 检测重复性
     * @param c 列名
     * @param v 值
     * @return 重复 true
     */
    @Override
    public boolean checkRepeat(String c,String v){
        QueryWrapper<Metadata> wrapper = new QueryWrapper<>();
        wrapper.eq(c,v);
        int count = baseMapper.selectCount(wrapper);
        return count > 1;
    }
}
