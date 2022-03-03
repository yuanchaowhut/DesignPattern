package org.example.decorator.demo2.base;

/**
 * Created by yuanchao on 2018/4/23.
 */
public abstract class Decorator implements IDecorate {
    private IDecorate decorate;

    public void setDecorate(IDecorate decorate) {
        this.decorate = decorate;
    }

    @Override
    public void decorate() {
        if (decorate != null) {
            decorate.decorate();   //功能
            addDecorate();         //增强功能
        }
    }

    public abstract void addDecorate();
}
