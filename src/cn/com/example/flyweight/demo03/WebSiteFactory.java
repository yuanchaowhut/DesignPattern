package cn.com.example.flyweight.demo03;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanchao on 2019/1/7.
 */
public class WebSiteFactory {
    private Map<String, WebSite> flyweights = new HashMap<>();

    //获取网站分类
    public WebSite getWebSiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    //获取网站分类总数
    public int getWebSiteCount() {
        return flyweights.size();
    }
}
