package cn.com.example.mediator.demo02;

/**
 * Created by yuanchao on 2019/1/2.
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }

    protected abstract void declare(String message);

    protected abstract void getMessage(String message);
}
