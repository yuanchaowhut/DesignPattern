package org.example.state.states;

import org.example.state.Work;

/**
 * Created by yuanchao on 2018/6/27.
 */
public class NightState implements State {
    @Override
    public void workSate(Work work) {
        int hour = work.getHour();
        if (hour < 22) {
            if (work.isFinish()) {
                System.out.println("时间：" + hour + "---------->工作完成,终于可以下班!");
            } else {
                System.out.println("时间：" + hour + "---------->工作没完成,又累又饿,继续加班!");
            }
        } else {
            work.setState(new SleepState());
            work.getWorkState();
        }
    }
}
