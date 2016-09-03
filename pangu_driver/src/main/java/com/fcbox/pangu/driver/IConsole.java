package com.fcbox.pangu.driver;

import rx.Observable;

/**
 * 控制台接口, 供应商需要实现该接口.
 */
public interface IConsole {

    /**
     * 获取版本信息.
     *
     * @return 版本信息
     */
    Observable<Version> getVersion();

    /**
     * 读取单柜编码.
     *
     * @return 单柜编码列表
     */
    Observable<String[]> readPortionCodes();

    /**
     * 打开格口.
     *
     * @param cellCodes 格口编码列表
     * @return 格口状态列表
     */
    Observable<boolean[]> openCells(String[] cellCodes);

    /**
     * 读取格口状态.
     *
     * @param cellCodes 格口编码列表
     * @return 格口状态列表
     */
    Observable<boolean[]> readCellsStatus(String[] cellCodes);

    /**
     * 开启RFID的识别.
     *
     * @param duration 持续时间
     * @return 识别到的数据
     */
    Observable<String> startRfid(long duration);

    /**
     * 开启扫描仪的识别功能.
     *
     * @param duration 持续时间
     * @return 扫描到的数据
     */
    Observable<String> startScanner(long duration);

    /**
     * 控制灯箱开关.
     *
     * @param io 开/关
     */
    Observable<Void> light(IO io);
}
