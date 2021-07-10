package com.pattern.facade;

public class ModuleB {
    /**
     * 提供给子系统外部使用的方法
     */
    public void b1(){
        System.out.println("调用ModuleB中的b1方法");
    }
    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void b2(){};
    private void b3(){};
}
