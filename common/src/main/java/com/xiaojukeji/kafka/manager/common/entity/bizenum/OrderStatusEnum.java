package com.xiaojukeji.kafka.manager.common.entity.bizenum;

public enum OrderStatusEnum {
    WAIT_DEAL(0, "待处理"),

    PASSED(1, "通过"),

    REFUSED(2, "拒绝"),

    CANCELLED(3, "取消");

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
