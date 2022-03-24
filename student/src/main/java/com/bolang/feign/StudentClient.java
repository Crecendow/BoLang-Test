package com.bolang.feign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("student-service")
public interface StudentClient {


}
