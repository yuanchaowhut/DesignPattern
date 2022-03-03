package org.example.strategy.demo2;

import java.util.HashMap;
import java.util.Map;

public class Utils {
    private static Map<String, String > map = new HashMap<>();
    static {
        map.put("discount", "0.8");
        map.put("total", "300");
        map.put("cut", "100");
        map.put("num", "8");
        map.put("price", "250");
    }

    public static String get(String key) {
//        ResourceBundle rb = ResourceBundle.getBundle("config/promotion");
//        String value = rb.getString(key);
        String value = map.get(key);
        return value;
    }
}
