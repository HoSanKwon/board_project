package com.hosan.board_back.common;

public class ResponseMessage {
    // HTTP Status 200
    public static final String SUCCESS = "Success.";

    // HTTP Status 400
    public static final String VALIDATION_FAIL = "Validation Fail.";
    public static final String DUPLICATE_EMAIL = "Duplicate Email.";
    public static final String DUPLICATE_NICKNAME = "Duplicate Nickname.";
    public static final String DUPLICATE_TEL_NUMBER = "Duplicate Tel Number.";
    public static final String NOT_EXISTED_USER = "This user does not exist.";
    public static final String NOT_EXISTED_BOARD = "This board does not exist.";

    // HTTP Status 401
    public static final String SIGN_IN_FAIL = "Login information mismatch.";
    public static final String AUTHENTICATION_FAIL = "Authentication Fail.";

    // HTTP Status 403
    public static final String NO_PERMISSION = "Do not have permission.";

    // HTTP Status 500
    public static final String DATABASE_ERROR = "Database Error.";
}
