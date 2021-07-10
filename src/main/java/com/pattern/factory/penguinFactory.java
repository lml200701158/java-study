package com.pattern.factory;

import java.util.HashMap;
import java.util.Map;

public class penguinFactory {
    private static final Map<String, penguin> map = new HashMap<>();
    static {
        map.put("littlePenguin", new littlePenguin());
        map.put("middlePenguin", new middlePenguin());
        map.put("bigPenguin", new bigPenguin());
    }
    // 获取企鹅
    public static penguin getPenguin(String name) {
        return map.get(name);
    }
}

