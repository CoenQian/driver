package com.fcbox.pangu.driver;

/**
 * Console工厂, 供应商需要实现该接口.
 */
public interface IConsoleFactory {

    /**
     * 创建IConsole实例.
     *
     * @param logger 日志接口
     * @return IConsole实例
     */
    IConsole create(ILogger logger);
}
