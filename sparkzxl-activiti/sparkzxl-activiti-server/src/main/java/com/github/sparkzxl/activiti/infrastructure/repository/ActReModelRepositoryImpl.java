package com.github.sparkzxl.activiti.infrastructure.repository;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.github.pagehelper.PageInfo;
import com.github.sparkzxl.activiti.domain.repository.IActReModelRepository;
import com.github.sparkzxl.activiti.infrastructure.entity.ActReModel;
import com.github.sparkzxl.activiti.infrastructure.mapper.ActReModelMapper;
import com.github.sparkzxl.database.utils.PageInfoUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * description: 模型 仓储实现类
 *
 * @author: zhouxinlei
 * @date: 2020-07-25 11:17:47
 */
@Repository
public class ActReModelRepositoryImpl implements IActReModelRepository {

    @Autowired
    private ActReModelMapper actReModelMapper;

    @Override
    public PageInfo<ActReModel> actReModelList(String key, String name) {
        LambdaQueryWrapper<ActReModel> modelQueryWrapper = new LambdaQueryWrapper<>();
        if (StringUtils.isNotBlank(key)){
            modelQueryWrapper.eq(ActReModel::getKey,key);
        }
        if (StringUtils.isNotBlank(name)){
            modelQueryWrapper.eq(ActReModel::getName,name);
        }
        return PageInfoUtils.pageInfo(actReModelMapper.selectList(modelQueryWrapper));
    }
}
