package org.example.templatemethod.demo03;

/**
 * Created by yuanchao on 2018/5/16.
 */
public class TestPaperB extends TestPaper {

    @Override
    protected String answer1() {
        return "C";
    }

    @Override
    protected String answer2() {
        return "C";
    }

    @Override
    protected String answer3() {
        return "A";
    }
}
