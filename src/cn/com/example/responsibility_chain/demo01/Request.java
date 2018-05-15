package cn.com.example.responsibility_chain.demo01;

/**
 * Created by yuanchao on 2018/5/15.
 */
public class Request {
    private String name;            //请求人姓名.
    private String requestType;        //请求类型.
    private int num;                //请求的数量

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", requestType='" + requestType + '\'' +
                ", num=" + num +
                '}';
    }
}
