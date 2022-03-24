package com.bolang.config;

import lombok.Data;
import lombok.experimental.Accessors;

@Data(staticConstructor = "of")
@Accessors(chain = true)
public class BaseResponse {

    private String msg;

    private Integer code;

    private Object data;

}
