package com.orchids.minio.model.result;

import lombok.Getter;

@Getter
public enum ResultCode {

    SUCCESS(200, "成功"),
    FAIL(201, "失败");

    private final Integer code;

    private final String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}