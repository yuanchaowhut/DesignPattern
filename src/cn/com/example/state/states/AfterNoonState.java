package cn.com.example.state.states;

import cn.com.example.state.Work;

/**
 * Created by yuanchao on 2018/6/27.
 */
public class AfterNoonState implements State {
    @Override
    public void workSate(Work work) {
        int hour = work.getHour();
        if (work.getHour() < 17) {
            System.out.println("时间：" + hour + "---------->神状态恢复,效率保持正常!");
        } else {
            work.setState(new EveningState());
            work.getWorkState();
        }
    }
}
