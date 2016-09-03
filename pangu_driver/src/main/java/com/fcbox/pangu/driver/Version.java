package com.fcbox.pangu.driver;

/**
 * 版本信息.
 */
public class Version {

    /** 版本号. */
    private int mVerCode;
    /** 版本名. */
    private String mVerName;

    public Version(int verCode, String verName) {
        this.mVerCode = verCode;
        this.mVerName = verName;
    }

    /**
     * 获取版本号.
     *
     * @return 当前版本号
     */
    public int getVerCode() {
        return mVerCode;
    }

    /**
     * 获取版本名.
     *
     * @return 当前版本名
     */
    public String getVerName() {
        return mVerName;
    }
}
