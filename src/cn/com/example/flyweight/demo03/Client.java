package cn.com.example.flyweight.demo03;

/**
 * Created by yuanchao on 2019/1/7.
 */
public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite fx = factory.getWebSiteCategory("产品展示");
        fx.use(new User("张三"));

        WebSite fy = factory.getWebSiteCategory("产品展示");
        fy.use(new User("李四"));

        WebSite fz = factory.getWebSiteCategory("产品展示");
        fz.use(new User("王五"));

        WebSite fl = factory.getWebSiteCategory("博客");
        fl.use(new User("小明"));

        WebSite fm = factory.getWebSiteCategory("博客");
        fm.use(new User("小红"));

        WebSite fn = factory.getWebSiteCategory("博客");
        fn.use(new User("小华"));

        System.out.println("网站分类总数:" + factory.getWebSiteCount());
    }
}
