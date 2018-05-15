package cn.com.example.responsibility_chain.demo02;

import cn.com.example.responsibility_chain.demo02.interceptor.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuanchao on 2018/5/15.
 */
public class Client {

    @Test
    public void testReq() {
        //创建一系列拦截器并添加进集合.
        Interceptor interceptor1 = new RetryInterceptor("重试与重定向拦截器");
        Interceptor interceptor2 = new BridgeInterceptor("组装请求头拦截器");
        Interceptor interceptor3 = new CacheInterceptor("缓存策略拦截器");
        Interceptor interceptor4 = new ConnectInterceptor("连接服务器拦截器");
        Interceptor interceptor5 = new CallServerInterceptor("执行IO操作拦截器");

        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(interceptor1);
        interceptors.add(interceptor2);
        interceptors.add(interceptor3);
        interceptors.add(interceptor4);
        interceptors.add(interceptor5);

        //创建请求
        Request request = new Request();
        request.setName("联网获取用户信息的请求");
        request.setType("get");
        request.setUrl("http://223.71.137.154:8080/eUrbanMIS/login?name=tom&password=123456");

        //执行请求
        InterceptorChain chain = new InterceptorChain(0, request, interceptors);
        Response response = chain.proceed(request);

        System.out.println(response.toString());
    }
}
