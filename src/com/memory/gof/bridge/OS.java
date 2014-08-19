package com.memory.gof.bridge;

/**
 * @author MemoRyAxis
 * @todo Abstraction
 * @date 2014/8/10 23:15
 */
public abstract class OS {

    protected String osNm;

    protected IDE ide;

    protected OS() {
    }

    public IDE getIde() {
        return ide;
    }

    public void setIde(IDE ide) {
        this.ide = ide;
    }

    public String getOsNm() {
        return osNm;
    }

    public void setOsNm(String osNm) {
        this.osNm = osNm;
    }

    public void useIDE() {
        // 调用
        System.out.println("OS : " + this.getClass().getSimpleName());
        this.ide.useIDE();
    }
}
