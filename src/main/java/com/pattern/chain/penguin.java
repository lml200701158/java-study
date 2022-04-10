package com.pattern.chain;

public abstract class penguin {
    protected int level; // 责任链等级
    protected penguin nextPenguin; // 责任链中的下一个元素

    public void process(int level, String message) {
        if (level >= this.level) {
            // 如果输入的级别大于对象本身的级别，输出数据
            print(message);
        }
        if (this.nextPenguin != null) {
            // 如果存在下一个元素，就继续往下执行
            nextPenguin.process(level,message);
        }
    }

    public abstract void print(String message);
}
