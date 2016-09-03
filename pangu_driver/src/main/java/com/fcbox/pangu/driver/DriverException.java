package com.fcbox.pangu.driver;

/**
 * 驱动异常.
 */
public class DriverException extends Exception {

    /** 错误码. */
    private ErrorCode mErrorCode;
    /** 错误描述. */
    private String mErrorMessage;

    public DriverException(ErrorCode errorCode, String errorMessage) {
        super(errorMessage);
        mErrorCode = errorCode;
        mErrorMessage = errorMessage;
    }

    public ErrorCode getErrorCode() {
        return mErrorCode;
    }

    public void setErrorCode(ErrorCode mErrorCode) {
        this.mErrorCode = mErrorCode;
    }

    public String getErrorMessage() {
        return mErrorMessage;
    }

    public void setErrorMessage(String mErrorMessage) {
        this.mErrorMessage = mErrorMessage;
    }
}
