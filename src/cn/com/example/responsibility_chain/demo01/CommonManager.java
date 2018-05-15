package cn.com.example.responsibility_chain.demo01;

/**
 * Created by yuanchao on 2018/5/15.
 * 普通经理
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void executeRequest(Request request) {
        String requestType = request.getRequestType();
        int num = request.getNum();
        if ("请假".equals(requestType) && num < 2) {
            System.out.println(request.getName() + "," + request.getRequestType() + "," + request.getNum() + "," + "批准!" + "--->" + "批准人:" + this.name);
        } else {
            if (superior != null) {
                superior.executeRequest(request);
            }
        }
    }
}
