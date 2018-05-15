package cn.com.example.responsibility_chain.demo01;

/**
 * Created by yuanchao on 2018/5/15.
 */
public abstract class Manager {
    protected String name;
    /**继承者*/
    protected Manager superior;

    public Manager(String name){
        this.name = name;
    }

    /**
     * 设置明确继任者
     * @param superior
     */
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }


    public abstract void executeRequest(Request request);
}
