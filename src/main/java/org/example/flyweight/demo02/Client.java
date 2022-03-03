package org.example.flyweight.demo02;

/**
 * Created by yuanchao on 2019/1/7.
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite fx = factory.getWebSiteCategory("产品展示");
        fx.use();

        WebSite fy = factory.getWebSiteCategory("产品展示");
        fy.use();

        WebSite fz = factory.getWebSiteCategory("产品展示");
        fz.use();

        WebSite fl = factory.getWebSiteCategory("博客");
        fl.use();

        WebSite fm = factory.getWebSiteCategory("博客");
        fm.use();

        WebSite fn = factory.getWebSiteCategory("博客");
        fn.use();

        System.out.println("网站分类总数:" + factory.getWebSiteCount());
    }
}
