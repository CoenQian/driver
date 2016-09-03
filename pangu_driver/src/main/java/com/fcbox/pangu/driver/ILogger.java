package com.fcbox.pangu.driver;

/**
 * 日志接口，丰巢实现该接口.
 */
public interface ILogger {

    /**
     * 打印调试日志.
     *
     * @param message 日志内容
     */
    void d(String message);

    /**
     * 打印普通日志.
     *
     * @param message 日志内容
     */
    void i(String message);

    /**
     * 打印异常日志.
     *
     * @param message 日志内容
     */
    void e(String message);
}
