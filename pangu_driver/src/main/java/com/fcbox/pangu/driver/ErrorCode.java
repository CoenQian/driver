package com.fcbox.pangu.driver;

/**
 * 错误码.
 */
public enum ErrorCode {


// 通用 [0, 1000)
// --------------------------------------------------------------------------------

    /** 错误，在其他错误码无法准确表达意义时使用. */
    ERROR(0),
    /** 缺失参数. */
    PARAM_MISSING(1),
    /** 无效参数. */
    PARAM_INVALID(2),
    /** 硬件设备无响应. */
    HARDWARE_NO_RESPONSE(3),
    /** 超时无响应，例如RFID没有收到数据.*/
    TIMEOUT(4);

// 软件模块 [1000, 2000)
// --------------------------------------------------------------------------------


// 柜机信息模块 [2000, 3000)
// --------------------------------------------------------------------------------


// 格口模块 [3000, 4000)
// --------------------------------------------------------------------------------


// RFID模块 [4000, 5000)
// --------------------------------------------------------------------------------


//  扫描仪模块 [5000, 6000)
// --------------------------------------------------------------------------------


//  灯箱模块 [6000, 7000)
// --------------------------------------------------------------------------------


//  打印机模块 [7000, 8000)
// --------------------------------------------------------------------------------

    private int mValue;

    ErrorCode(int value) {
        mValue = value;
    }

    public static ErrorCode parse(int value) {
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (errorCode.getValue() == value) {
                return errorCode;
            }
        }
        throw new IllegalArgumentException("unsupported value: " + value);
    }

    public int getValue() {
        return mValue;
    }
}