package com.bolang.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bolang.dao.entity.StudentEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao extends BaseMapper<StudentEntity> {
}
