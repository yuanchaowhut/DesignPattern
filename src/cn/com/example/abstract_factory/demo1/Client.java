package cn.com.example.abstract_factory.demo1;

import cn.com.example.abstract_factory.demo1.bean.User;
import cn.com.example.abstract_factory.demo1.service.factory.FactoryMysql;
import cn.com.example.abstract_factory.demo1.service.factory.FactoryXML;
import cn.com.example.abstract_factory.demo1.service.factory.IFactory;
import cn.com.example.abstract_factory.demo1.service.user.IUserService;
import org.junit.Test;

/**
 * Created by yuanchao on 2018/3/29.
 */
public class Client {

    @Test
    public void testXMLDB() {
        User u = new User(); //实体类
        IFactory factory = new FactoryXML();  //工厂类,用接口接收.
        IUserService userService = factory.createUserService();
        userService.addUser(u);
        userService.getUserByName("张三");

        //同理对Department. 代码省略.
    }

    @Test
    public void testMysqlDB() {
        //切换Mysql数据库，只需要该一行代码，把 new FactoryXML()  换成   new FactoryMysql()  即可.
        User u = new User(); //实体类
        IFactory factory = new FactoryMysql();  //工厂类,用接口接收.
        IUserService userService = factory.createUserService();
        userService.addUser(u);
        userService.getUserByName("张三");

        //同理对Department. 代码省略.
    }

}
