package cn.com.example.state.states;

import cn.com.example.state.Work;

/**
 * Created by yuanchao on 2018/6/26.
 * 不同状态下的工作效率、精神面貌都不一样，抽取一个接口。
 */
public interface State {
    void workSate(Work work);
}
