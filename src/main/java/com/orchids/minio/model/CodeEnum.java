package com.orchids.minio.model;

import lombok.Getter;

@Getter
public enum CodeEnum {

    SUCCESS(200, "成功"),
    FAIL(201, "失败");

    private final Integer code;

    private final String message;

    CodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}