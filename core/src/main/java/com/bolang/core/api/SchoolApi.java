package com.bolang.core.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface SchoolApi {

    @GetMapping("school/class-info")
    public String getClassNameById(@RequestParam("classId") Long classId);

}
