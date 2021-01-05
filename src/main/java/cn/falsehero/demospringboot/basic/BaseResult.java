package cn.falsehero.demospringboot.basic;

import cn.falsehero.demospringboot.basic.enums.ResultStatusEnum;

import java.io.Serializable;

/**
 * @Author: fenghao
 * @Date: 2021/01/04 22:44
 * @Description:
 */
public abstract class BaseResult implements Serializable {

    private String status;

    private String message;

    private Long timestamp = DateUtils.nowTimestamp();

    public Boolean isSuccess() {
        return ResultStatusEnum.SUCCESS.getCode().equals(this.getStatus());
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
