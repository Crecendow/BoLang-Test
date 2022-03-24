package com.bolang.feign;


import com.bolang.core.api.SchoolApi;
import com.bolang.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("school-service")
public class SchoolClient implements SchoolApi {

    @Autowired
    private SchoolService schoolService;

    @Override
    public String getClassNameById(Long classId) {
        return schoolService.getClassName(classId);
    }
}
