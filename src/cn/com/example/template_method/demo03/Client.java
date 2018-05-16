package cn.com.example.template_method.demo03;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/5/16.
 */
public class Client {

    @Test
    public void testPaper() {
        System.out.println("===========学生A的试卷==========");
        TestPaper ta = new TestPaperA();
        ta.submit();

        System.out.println("===========学生B的试卷==========");
        TestPaper tb = new TestPaperB();
        tb.submit();
    }
}
