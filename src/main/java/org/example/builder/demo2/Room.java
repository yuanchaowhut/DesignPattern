package org.example.builder.demo2;

/**
 * Created by yuanchao on 2018/3/31.
 * 产品：房子
 * 特性：创建步骤稳定，但每个步骤细节可以很复杂。
 * 门：欧式风格，中式风格，美式风格。。。
 * 地板：水泥地板，瓷砖地板，实木地板。。。
 * 窗户：平门窗、推拉窗、折叠窗四、百叶窗。。。
 */
public class Room {
    private String door;
    private String floor;
    private String window;

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "Room{" +
                "door='" + door + '\'' +
                ", floor='" + floor + '\'' +
                ", window='" + window + '\'' +
                '}';
    }
}
