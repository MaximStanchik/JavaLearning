package org.Stanchik;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CHMInterner<T>{
    private final Map<T, T> map;

    public CHMInterner() {
        map = new ConcurrentHashMap<>();
    }
    public T intern(T t) {
        T exist = map.putIfAbsent(t, t);
        return (exist == null) ? t : exist;
    }
    public int internSize() {
        return map.size();
    }
}
