package com.pattern.facade;

public class ModuleC {
    /**
     * 提供给子系统外部使用的方法
     */
    public void c1(){
        System.out.println("调用ModuleC中的c1方法");
    };
    /**
     * 子系统内部模块之间相互调用时使用的方法
     */
    private void c2(){};
    private void c3(){};
}
