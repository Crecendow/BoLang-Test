package com.bolang.dao.entity;

import lombok.Data;

@Data
public class StudentEntity {
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
     * 班级id
     *
     */
    private Long classId;
}
