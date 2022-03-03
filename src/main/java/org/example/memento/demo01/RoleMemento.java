package org.example.memento.demo01;

/**
 * Created by yuanchao on 2018/7/10.
 */
public class RoleMemento {
    private int lifeValue;
    private int fightValue;
    private int defenseValue;

    public RoleMemento(int lifeValue, int fightValue, int defenseValue) {
        this.lifeValue = lifeValue;
        this.fightValue = fightValue;
        this.defenseValue = defenseValue;
    }


    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        this.lifeValue = lifeValue;
    }

    public int getFightValue() {
        return fightValue;
    }

    public void setFightValue(int fightValue) {
        this.fightValue = fightValue;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }
}
