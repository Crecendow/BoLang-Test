package com.bolang.dto;

import lombok.Data;

@Data
public class StudentDTO {

    /**
     * id
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 性别 （男或女）
     */
    private String sex;

    /**
     * 岁数
     */
    private Integer age;

    /**
     * 班级名称
     */
    private String className;


}
