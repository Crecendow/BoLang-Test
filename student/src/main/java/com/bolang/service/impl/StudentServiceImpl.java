package com.bolang.service.impl;


import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bolang.core.api.SchoolApi;
import com.bolang.dao.StudentDao;
import com.bolang.dao.entity.StudentEntity;
import com.bolang.dto.StudentDTO;
import com.bolang.feign.StudentClient;
import com.bolang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private StudentClient studentClient;

    @Autowired
    private SchoolApi schoolApi;


    /**
     * 实现功能：根据学生id获取学生信息，其中班级名称从另一个服务获得
     * @param studentId 学生id
     * @return
     */
    @Override
    public StudentDTO getStudentInfo(Long studentId) {
        StudentEntity studentEntity = studentDao.selectOne(new QueryWrapper<StudentEntity>().eq("id", studentId));
        if(studentEntity == null) {
            return null;
        }
        Long classId = studentEntity.getClassId();
        String className = schoolApi.getClassNameById(classId);
        StudentDTO studentDTO = BeanUtil.copyProperties(studentEntity, StudentDTO.class);
        studentDTO.setClassName(className);
        return studentDTO;
    }
}
