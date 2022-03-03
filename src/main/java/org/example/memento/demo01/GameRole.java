package org.example.memento.demo01;

/**
 * Created by yuanchao on 2018/7/10.
 */
public class GameRole {
    private int lifeValue;
    private int fightValue;
    private int defenseValue;

    public GameRole() {
    }

    public GameRole(int lifeValue, int fightValue, int defenseValue) {
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

    @Override
    public String toString() {
        return super.toString();
    }


    public void initGameState() {
        this.lifeValue = 100;
        this.fightValue = 100;
        this.defenseValue = 100;
    }

    public void fightBoss() {
        this.lifeValue = 0;
        this.fightValue = 0;
        this.defenseValue = 0;
    }

    public void showGameState() {
        String state = String.format("当前游戏状态------生命值：%d, 武力值：%d, 防御值：%d", this.lifeValue, this.fightValue, this.defenseValue);
        System.out.println(state);
    }


    public RoleMemento saveGameState() {
        return new RoleMemento(lifeValue, fightValue, defenseValue);
    }

    public void recoverGameState(RoleMemento memento) {
        this.lifeValue = memento.getLifeValue();
        this.fightValue = memento.getFightValue();
        this.defenseValue = memento.getDefenseValue();
    }
}
