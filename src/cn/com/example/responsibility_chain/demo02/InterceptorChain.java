package cn.com.example.responsibility_chain.demo02;

import cn.com.example.responsibility_chain.demo02.interceptor.Interceptor;

import java.util.List;

/**
 * Created by yuanchao on 2018/5/15.
 */
public class InterceptorChain {
    private int index;
    private Request request;
    private List<Interceptor> interceptors;

    public InterceptorChain() {
    }

    public InterceptorChain(int index, Request request, List<Interceptor> interceptors) {
        this.index = index;
        this.request = request;
        this.interceptors = interceptors;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public List<Interceptor> getInterceptors() {
        return interceptors;
    }

    public void setInterceptors(List<Interceptor> interceptors) {
        this.interceptors = interceptors;
    }

    public Response proceed(Request request) {
        if (index >= interceptors.size()) {
            return null;
        }

        InterceptorChain next = new InterceptorChain(index + 1, request, interceptors);
        Interceptor interceptor = interceptors.get(index);
        Response response = interceptor.intercept(next);

        return response;
    }
}
