package cn.falsehero.demospringboot.basic.enums;

/**
 * @Author: fenghao
 * @Date: 2021/01/04 22:47
 * @Description: 返回状态
 */
public enum ResultStatusEnum {

    /**
     * 成功
     */
    SUCCESS("0", "Success");

    private String code;

    private String msg;

    ResultStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
