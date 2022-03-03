package org.example.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        //静态代理
        TuHao th = new TuHao(1.8f);
        Girl tc = new TeacherCang();
        Tony tony = new Tony();
        tony.setGirl(tc);
        th.dating(tony);

        //jdk动态代理
        Girl proxy = (Girl) TonyCompanyJdk.proxy(tc);
        th.dating(proxy);

        //cglib动态代理---接口代理对象
        proxy = (Girl) TonyCompanyCglib.proxyInterface(tc);
        th.dating(proxy);

        //cglib动态代理---类代理对象
        proxy = (Girl) TonyCompanyCglib.proxyClass(tc);
        th.setLength(1.6f);
        th.dating(proxy);
    }
}
