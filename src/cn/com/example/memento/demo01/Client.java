package cn.com.example.memento.demo01;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/7/10.
 */
public class Client {

    @Test
    public void testGameState(){
        GameRole gameRole = new GameRole();

        //初始化状态
        gameRole.initGameState();

        //显示
        gameRole.showGameState();

        //备忘录
        RoleCareTaker taker = new RoleCareTaker();
        taker.memento = gameRole.saveGameState();

        //打Boss
        gameRole.fightBoss();

        //显示
        gameRole.showGameState();

        //通过备忘录恢复
        gameRole.recoverGameState(taker.memento);

        //显示
        gameRole.showGameState();
    }
}
