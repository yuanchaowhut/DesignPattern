package cn.com.example.template_method.demo02;

/**
 * Created by yuanchao on 2018/5/16.
 */
public class TestPaperB extends TestPaper{

    @Override
    public void testQuestion1(){
        super.testQuestion1();
        System.out.println("答案：C");
    }

    @Override
    public void testQuestion2(){
        super.testQuestion1();
        System.out.println("答案：C");
    }

    @Override
    public void testQuestion3(){
        super.testQuestion1();
        System.out.println("答案：A");
    }
}
