package com.pattern.singleton;

public class penguin {
    private static penguin m_penguin = new penguin();
    private void penguin() {}
    public static penguin getInstance() {
        return m_penguin;
    }
}

//public class penguin {
//    private static volatile penguin m_penguin = null;
//    // 避免通过new初始化对象
//    private void penguin() {}
//    public void beating() {
//        System.out.println("打豆豆");
//    };
//    public static penguin getInstance() {
//        if (null == m_penguin) {
//            synchronized(penguin.class) {
//                if (null == m_penguin) {
//                    m_penguin = new penguin();
//                }
//            }
//        }
//        return m_penguin;
//    }
//}
