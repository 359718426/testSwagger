package com.lvxin.test.common;
import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "返回结果封装")
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -990587448319029499L;
    @ApiModelProperty(value = "接口状态码 200 成功 401 无权限 500内部错误")
    private String code = "200";
    @ApiModelProperty(value="接口结果描述")
    private String message = "ok";
    @ApiModelProperty(value="接口数据对象封装")
    private T dataMap;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDataMap() {
        return dataMap;
    }

    public void setDataMap(T dataMap) {
        this.dataMap = dataMap;
    }
}
