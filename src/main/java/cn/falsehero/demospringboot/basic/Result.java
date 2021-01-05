package cn.falsehero.demospringboot.basic;

import cn.falsehero.demospringboot.basic.enums.ResultStatusEnum;

/**
 * @Author: fenghao
 * @Date: 2021/01/04 22:43
 * @Description:
 */
public class Result<T> extends BaseResult {

    private T object;

    private Result() {

    }

    public static <T> Result<T> newInstance() {
        Result<T> result = new Result<>();
        result.setStatus(ResultStatusEnum.SUCCESS.getCode());
        result.setMessage(ResultStatusEnum.SUCCESS.getMsg());
        return result;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
