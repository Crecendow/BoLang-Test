package com.bolang.controller;

import com.bolang.config.BaseResponse;
import com.bolang.dto.StudentDTO;
import com.bolang.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("get-student-info")
    public BaseResponse getStudentInfo(@RequestParam("studentId") Long studentId) {
        StudentDTO studentInfo = new StudentDTO();
        try {
            studentInfo = studentService.getStudentInfo(studentId);
        } catch (Exception exception) {
            log.error("程序内部发生错乱", exception);
        }
        return BaseResponse.of().setCode(0).setMsg("success").setData(studentInfo);
    }

}
