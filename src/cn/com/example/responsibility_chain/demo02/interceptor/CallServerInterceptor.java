package cn.com.example.responsibility_chain.demo02.interceptor;

import cn.com.example.responsibility_chain.demo02.InterceptorChain;
import cn.com.example.responsibility_chain.demo02.Request;
import cn.com.example.responsibility_chain.demo02.Response;

/**
 * Created by yuanchao on 2018/5/15.
 */
public class CallServerInterceptor extends Interceptor {

    public CallServerInterceptor(String name) {
        super(name);
    }

    @Override
    public Response intercept(InterceptorChain chain) {
        Request request = chain.getRequest();

        System.out.println(String.format("%s开始处理请求-------------进行http请求,执行流操作----------请求名：%s，请求类型：%s，url：%s", this.name, request.getName(), request.getType(), request.getUrl()));

        Response response = new Response();
        response.setCode(200);
        response.setContent("返回结果：用户名：tom, 年龄：28，身高：172cm，爱好：编程");
//        Response response = chain.proceed(request);  不需要往下走了。

        return response;
    }
}
