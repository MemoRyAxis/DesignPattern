package com.memory.gof.bridge;

/**
 * @author MemoRyAxis
 * @todo Abstraction
 * @date 2014/8/10 23:15
 */
public abstract class OS {

    protected IDE ide;

    protected OS() {
    }

    public IDE getIde() {
        return ide;
    }

    public void setIde(IDE ide) {
        this.ide = ide;
    }

    public void useIDE() {
        // 调用
        this.ide.useIDE();
    }
}
