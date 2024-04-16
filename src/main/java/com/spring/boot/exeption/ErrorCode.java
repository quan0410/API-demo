package com.spring.boot.exeption;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Exception"),
    INVALID_KEY(1000, "Invalid message Key"),
    USER_EXITED_ERROR_CODE(1001, "User exited"),
    USERNAME_INVALID(1002, "username must be at least 3 characters"),
    USERNAME_REQUIRED(1003, "Required username"),
    PASSWORD_INVALID(1004, "Minimum password needs 8 characters"),
    USER_NOT_EXITED(1005, "User Not found"),
    UNAUTHENTICATED(1005, "unauthenticated"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
