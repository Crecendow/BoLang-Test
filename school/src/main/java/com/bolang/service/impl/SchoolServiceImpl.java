package com.bolang.service.impl;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bolang.dao.SchoolDao;
import com.bolang.dao.entity.SchoolEntity;
import com.bolang.dto.SchoolDTO;
import com.bolang.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolDao schoolDao;

    @Override
    public List<SchoolDTO> getClassList() {
        QueryWrapper<SchoolEntity> queryWrapper = new QueryWrapper<>();
        List<SchoolEntity> schoolEntities = schoolDao.selectList(queryWrapper);
        if(schoolEntities == null) {
            return new ArrayList<>(16);
        }
        return schoolEntities.stream().map(o -> BeanUtil.copyProperties(o, SchoolDTO.class)).collect(Collectors.toList());
    }

    @Override
    public String getClassName(Long classId) {
        QueryWrapper<SchoolEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", classId);
        SchoolEntity schoolEntity = schoolDao.selectOne(queryWrapper);
        return schoolEntity == null ? null : schoolEntity.getClassName();
    }
}
