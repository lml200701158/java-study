package com.java.parallel.book.test1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PublishingVehicleTracker {
    private final Map<String, SafePoint> m_location;
    private final Map<String, SafePoint> m_unmodifiableMap;

    public PublishingVehicleTracker(Map<String, SafePoint> points) {
        m_location = new ConcurrentHashMap<String, SafePoint>(points);
        m_unmodifiableMap = Collections.unmodifiableMap(m_location);
    }
    public Map<String, SafePoint> getOldLocations() {
        return m_unmodifiableMap;
    }
    public Map<String, SafePoint> getNewLocations() {
        return Collections.unmodifiableMap(new HashMap<String, SafePoint>(m_location));
    }
    public SafePoint getLocation(String id) {return m_location.get(id);}
    public void setLocation(String id, int x, int y) {
        if (!m_location.containsKey(id)) {
            throw new IllegalArgumentException("invalid vehicle name:" + id);
        }
        // 仅这里进行了修改，之前是直接将数据set到m_location中，现在是将数据set到m_location中的SafePoint中
        // 因为之前的Point，set数据不是线程安全，现在的SafePoint，setshu数据是线程安全的
        m_location.get(id).set(x,y);
    }
}
