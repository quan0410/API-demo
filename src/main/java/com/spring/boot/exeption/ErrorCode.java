package com.spring.boot.exeption;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized Exception", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1000, "Invalid message Key", HttpStatus.BAD_REQUEST),
    USER_EXITED_ERROR_CODE(1001, "User exited", HttpStatus.SERVICE_UNAVAILABLE),
    USERNAME_INVALID(1002, "username must be at least 3 characters", HttpStatus.BAD_REQUEST),
    USERNAME_REQUIRED(1003, "Required username", HttpStatus.BAD_REQUEST),
    PASSWORD_INVALID(1004, "Minimum password needs 8 characters", HttpStatus.BAD_REQUEST),
    USER_NOT_EXITED(1005, "User Not found", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1006, "unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1007, "You do not have permission", HttpStatus.FORBIDDEN),
    INVALID_DOB(1008, "Invalid message Date of birth", HttpStatus.BAD_REQUEST),
    ;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    int code;
    String message;
    HttpStatusCode statusCode;
}
