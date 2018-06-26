package cn.com.example.state.states;

import cn.com.example.state.Work;

/**
 * Created by yuanchao on 2018/6/27.
 */
public class NoonState implements State {
    @Override
    public void workSate(Work work) {
        int hour = work.getHour();
        if (work.getHour() < 14) {
            System.out.println("时间：" + hour + "---------->吃完饭,困乏,效率低下!");
        } else {
            work.setState(new AfterNoonState());
            work.getWorkState();
        }
    }
}
