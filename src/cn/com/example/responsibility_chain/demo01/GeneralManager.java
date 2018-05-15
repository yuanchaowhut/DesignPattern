package cn.com.example.responsibility_chain.demo01;

/**
 * Created by yuanchao on 2018/5/15.
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void executeRequest(Request request) {
        String requestType = request.getRequestType();
        int num = request.getNum();
        if(("请假").equals(requestType)){
            if(num<=10){
                System.out.println(request.getName() + "," + request.getRequestType() + "," + request.getNum() + "," + "批准!" + "--->" + "批准人:" + this.name);
            }else{
                System.out.println(request.getName()+","+request.getRequestType()+","+request.getNum()+","+"不符合公司规定,不能批准!"+"--->"+"最终决策人:"+this.name);
            }
        }else if(("加薪").equals(requestType)){
            if(num<=500){
                System.out.println(request.getName()+","+request.getRequestType()+","+request.getNum()+","+"批准!"+"--->"+"批准人:"+this.name);
            }else{
                System.out.println(request.getName()+","+request.getRequestType()+","+request.getNum()+","+"不符合公司规定,不能批准!"+"--->"+"最终决策人:"+this.name);
            }
        }
    }
}
