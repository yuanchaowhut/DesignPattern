package cn.com.example.decorator.demo1;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class Superman {
    private String name;
    public Superman(String name){
        this.name = name;
    }

    public void decorate(){
        System.out.println(name+"----->"+"另类"); //假设这是超人的核心功能
        System.out.println(name+"----->"+"红披风,蓝色紧身服,内裤外穿");
    }
}
