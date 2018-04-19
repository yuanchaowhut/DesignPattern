package cn.com.example.prototype.demo1;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/4/2.
 */
public class Client {
    @Test
    public void testCopy() {
        Resume r = new Resume("张三", "男", 28, "武汉理工", "本科", "海尔集团");

        Resume r2 = r;
        Resume r3 = r;

        System.out.println("简历r-------------------- \r\n"+r.toString());
        System.out.println("简历r2-------------------- \r\n"+r2.toString());
        System.out.println("简历r3-------------------- \r\n"+r3.toString());
    }
}
