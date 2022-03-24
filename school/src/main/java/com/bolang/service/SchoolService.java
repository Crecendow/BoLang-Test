package com.bolang.service;

import com.bolang.dto.SchoolDTO;

import java.util.List;

public interface SchoolService {

    /**
     * 获取班级集合
     * @return 班级集合
     */
    List<SchoolDTO> getClassList();

    /**
     * 获取班级名称
     * @param classId 班级id
     * @return 班级名称
     */
    String getClassName(Long classId);

}
