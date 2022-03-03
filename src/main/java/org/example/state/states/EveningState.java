package org.example.state.states;

import org.example.state.Work;

/**
 * Created by yuanchao on 2018/6/27.
 */
public class EveningState implements State {
    @Override
    public void workSate(Work work) {
        int hour = work.getHour();
        if (hour < 20) {
            if (work.isFinish()) {
                System.out.println("时间：" + hour + "---------->工作完成,高高兴兴下班!");
            } else {
                System.out.println("时间：" + hour + "---------->工作没完成,继续努力,加油!");
            }
        } else {
            work.setState(new NightState());
            work.getWorkState();
        }
    }
}
