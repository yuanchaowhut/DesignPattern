package cn.com.example.strategy.demo2;

import java.util.ResourceBundle;

public class Utils {

    public static String get(String key) {
        ResourceBundle rb = ResourceBundle.getBundle("config/promotion");
        String value = rb.getString(key);
        return value;
    }
}
