package org.example.decorator.demo2;

import org.example.decorator.demo2.base.Decorator;
import org.example.decorator.demo2.base.Person;
import org.example.decorator.demo2.decorate.ArtPattern;
import org.example.decorator.demo2.decorate.SuperPattern;
import org.example.decorator.demo2.decorate.WorkPattern;
import org.example.decorator.demo2.decorate.YongPattern;
import org.example.decorator.demo2.role.Artist;
import org.example.decorator.demo2.role.Student;
import org.example.decorator.demo2.role.Superman;
import org.example.decorator.demo2.role.Worker;
import org.junit.Test;

/**
 * Created by yuanchao on 2018/4/23.
 */
public class Client {

    @Test
    public void testDecorate(){
        //创建需要增强功能的实例.
        Person stu = new Student("小强");
        Person worker = new Worker("旺财");
        Person at = new Artist("周星驰");
        Person sm = new Superman("奥特曼");

        //创建可以增强人物打扮功能装时对象的实例.
        Decorator yp = new YongPattern();
        Decorator wp = new WorkPattern();
        Decorator ap = new ArtPattern();
        Decorator sp = new SuperPattern();

        System.out.println("需求1:颓废风格的学生-------------------------");
        ap.setDecorate(stu);
        ap.decorate();

        System.out.println("需求2:年轻风格的艺术家------------------------");
        yp.setDecorate(at);
        yp.decorate();

        System.out.println("需求3:给学生添加年轻风格的打扮,然后又添加另类的打扮-----------");
        yp.setDecorate(stu);
        sp.setDecorate(yp);
        sp.decorate();

        System.out.println("需求4:给超人先添加颓废风格,然后添加年轻风格,然后添加干练风格-----");
        ap.setDecorate(sm);  //1.用颓废风格装饰超人.
        yp.setDecorate(ap);  //2.用年轻风格装饰已经包装了颓废风格的超人.
        wp.setDecorate(yp);  //3.用干练风格装饰已经包装了颓废风格以及年轻风格的超人.
        wp.decorate();	 //4.执行最终包装效果.
    }


    /*
      注意：最后一个需求，这4行代码的setDecorate()顺序可以变动，但是括号里参数的传递顺序不可变动，否则实际打扮顺序也会变动。
      实际生活中会遇到装饰之间有先后顺序，可能会出现，某种装饰在前之后，后一种装饰就失效了，真正理想中的情况是各种装饰功能之间
      相互不影响。
    */
}
