package com.memory.gof.bridge;

/**
 * @author MemoRyAxis
 * @todo
 * @date 2014/8/10 23:30
 */
public class Developer {
    public static void main(String[] args) {

        OS os = new MACOSX();
        IDE ide = new IntelliJ();
        os.setIde(ide);
        os.useIDE();

        os = new Windows();
        ide = new Eclipse();
        os.setIde(ide);
        os.useIDE();
    }
}
