package cn.com.example.prototype.demo2;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/4/2.
 */
public class Client {

    @Test
    public void testClone() {
        Resume r = new Resume("张三", "男", 28, "武汉理工", "本科", "海尔集团");

        Resume r2 = (Resume) r.clone();
        Resume r3 = (Resume) r.clone();

        System.out.println("简历r-------------------- \r\n" + r.toString());
        System.out.println("简历r2-------------------- \r\n" + r2.toString());
        System.out.println("简历r3-------------------- \r\n" + r3.toString());
    }


    @Test
    public void testCloneDeep() {
        Resume r = new Resume("张三", "男", 28, "武汉理工", "本科", "海尔集团");

        Resume r2 = (Resume) r.cloneDeep();
        r2.setName("李四");
        Resume r3 = (Resume) r.cloneDeep();
        r3.setName("王五");

        System.out.println("简历r-------------------- \r\n" + r.toString());
        System.out.println("简历r2-------------------- \r\n" + r2.toString());
        System.out.println("简历r3-------------------- \r\n" + r3.toString());
    }

}
