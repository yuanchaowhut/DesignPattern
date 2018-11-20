package cn.com.example.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanchao on 2018/11/20.
 * 使用容器实现单例模式(可以管理多种类型的单例实例)
 */
public class SingletonManager {
    private static Map<String, Object> instanceMap = new HashMap<>();

    private SingletonManager() {
    }

    public static void registerInstance(String key, Object instance) {
        if (!instanceMap.containsKey(key)) {
            instanceMap.put(key, instance);
        }
    }

    public static Object getInstance(String key) {
        return instanceMap.get(key);
    }
}
