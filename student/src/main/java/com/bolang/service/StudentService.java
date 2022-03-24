package com.bolang.service;


import com.bolang.dto.StudentDTO;

public interface StudentService {

    /**
     * 获取学生信息
     * @param studentId 学生id
     * @return 学生信息
     */
    StudentDTO getStudentInfo(Long studentId);

}
