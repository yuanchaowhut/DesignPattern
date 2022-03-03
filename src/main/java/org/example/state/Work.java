package org.example.state;


import org.example.state.states.ForeNoonState;
import org.example.state.states.State;

/**
 * Created by yuanchao on 2018/6/26.
 */
public class Work {
    private State state;
    private int hour;
    private boolean isFinish;

    public Work() {
        state = new ForeNoonState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public void getWorkState() {
        state.workSate(this);
    }
}
