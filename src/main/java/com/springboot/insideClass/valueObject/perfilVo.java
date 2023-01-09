package com.springboot.insideClass.valueObject;

public enum  perfilVo {
    USER("User"),
    ADMIN("Admin");

    private final String value;

    private perfilVo(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
