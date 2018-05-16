package cn.com.example.template_method.demo01;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/5/16.
 */
public class Client {

    @Test
    public void testPaper(){
        System.out.println("===========学生A的试卷==========");
        TestPaperA ta = new TestPaperA();
        ta.testQuestion1();
        ta.testQuestion2();
        ta.testQuestion3();

        System.out.println("===========学生B的试卷==========");
        TestPaperB tb = new TestPaperB();
        tb.testQuestion1();
        tb.testQuestion2();
        tb.testQuestion3();
    }
}
