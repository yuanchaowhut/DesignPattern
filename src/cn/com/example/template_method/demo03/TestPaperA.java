package cn.com.example.template_method.demo03;

/**
 * Created by yuanchao on 2018/5/16.
 */
public class TestPaperA extends TestPaper {


    @Override
    protected String answer1() {
        return "D";
    }

    @Override
    protected String answer2() {
        return "C";
    }

    @Override
    protected String answer3() {
        return "C";
    }
}
