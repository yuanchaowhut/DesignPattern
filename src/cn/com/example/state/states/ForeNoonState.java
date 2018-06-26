package cn.com.example.state.states;

import cn.com.example.state.Work;

/**
 * Created by yuanchao on 2018/6/26.
 */
public class ForeNoonState implements State {
    @Override
    public void workSate(Work work) {
        int hour = work.getHour();
        if (work.getHour() < 12) {
            System.out.println("时间：" + hour + "---------->精神饱满,工作效率高!");
        } else {
            work.setState(new NoonState());
            work.getWorkState();
        }
    }
}
