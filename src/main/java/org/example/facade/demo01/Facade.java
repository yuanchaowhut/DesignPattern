package org.example.facade.demo01;

/**
 * Created by yuanchao on 2018/5/23.
 */
public class Facade {
    private SubSystemOne st1;
    private SubSystemTwo st2;
    private SubSystemThree st3;
    private SubSystemFour st4;

    public Facade() {
        this.st1 = new SubSystemOne();
        this.st2 = new SubSystemTwo();
        this.st3 = new SubSystemThree();
        this.st4 = new SubSystemFour();
    }

    //方法组合一:
    public void methodA() {
        st1.methodOne();
        st3.methodThree();
    }

    //方法组合二:
    public void methodB() {
        st2.methodTwo();
        st4.methodFour();
    }
}
