package com.java.parallel.book.test2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DelegatingVehicleTracker {
    private final ConcurrentHashMap<String, Point> m_location;
    private final Map<String, Point> m_unmodifiableMap;

    public DelegatingVehicleTracker(Map<String, Point> points) {
        // 线程安全
        m_location = new ConcurrentHashMap<String, Point>(points);
        // 将m_location数据copyd到m_unmodifiableMap，用于对外返回，避免外部对数据进行修改
        m_unmodifiableMap = Collections.unmodifiableMap(m_location);
    }
    // 获取所有车的位置（如果后续位置有更新，返回的就是旧的位置）
    public Map<String, Point> getOldLocations() {
        return m_unmodifiableMap;
    }
    // 获取所有车的位置（永远返回最新位置）
    public Map<String, Point> getNewLocations() {
        return Collections.unmodifiableMap(new HashMap<String, Point>(m_location));
    }
    // 获取车的当前位置
    public Point getLocation(String id) {return m_location.get(id);}
    // 更新车的当前位置
    public void setLocation(String id, int x, int y) {
        if (m_location.replace(id,new Point(x,y)) == null) {
            throw new IllegalArgumentException("invalid vehicle name:" + id);
        }
    }
}
