package cn.com.example.template_method.demo03;

/**
 * Created by yuanchao on 2018/5/16.
 */
public abstract class TestPaper {

    protected void testQuestion1() {
        System.out.println("下面属于中国四大发明之一的是：A.长城，B.三国演义，C.麻将，D.火药");
        System.out.println("答案：" + answer1());
    }


    protected void testQuestion2() {
        System.out.println("中华人民共和国成立时间是哪一年？：A.1945年，B.1947年，C.1949年，D.1951年");
        System.out.println("答案：" + answer2());
    }


    protected void testQuestion3() {
        System.out.println("世界上海拔最高的山峰是哪一个？：A.泰山，B.昆仑山，C.珠穆朗玛峰，D.天山");
        System.out.println("答案：" + answer3());
    }


    protected abstract String answer1() ;

    protected abstract String answer2();

    protected abstract String answer3() ;


    public void submit() {
        testQuestion1();
        testQuestion2();
        testQuestion3();
    }
}
