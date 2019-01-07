package cn.com.example.flyweight.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanchao on 2019/1/7.
 */
public class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight());
        }
        return flyweights.get(key);
    }
}
