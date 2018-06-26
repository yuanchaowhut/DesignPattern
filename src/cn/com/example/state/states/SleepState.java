package cn.com.example.state.states;

import cn.com.example.state.Work;

/**
 * Created by yuanchao on 2018/6/27.
 */
public class SleepState implements State {
    @Override
    public void workSate(Work work) {
        int hour = work.getHour();
        boolean isFinish = work.isFinish();
        String finishStr = isFinish?"完成了":"没完成";
        System.out.println("时间：" + hour + "，工作：" + finishStr + ",---------->太累了,回家睡觉!");
    }
}
