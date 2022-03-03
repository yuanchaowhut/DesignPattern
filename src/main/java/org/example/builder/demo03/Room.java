package org.example.builder.demo03;

/**
 * Created by yuanchao on 2018/5/16.
 */
public class Room {
    private String door;
    private String floor;
    private String window;

    public Room() {
    }

    public Room(Builder builder) {
        this.door = builder.door;
        this.floor = builder.floor;
        this.window = builder.window;
    }


    /**
     * 1.需要建造的对象有什么属性，它的内部类Builder就有什么属性，这是最简化版的建造者模式。
     * 2.它的使用也很多，OKHttp里的OKHttpClient就是如此.
     */

    public static class Builder {
        private String door;
        private String floor;
        private String window;

        public Builder() {
        }

        public Builder door(String door) {
            this.door = door;
            return this;
        }

        public Builder floor(String floor) {
            this.floor = floor;
            return this;
        }

        public Builder window(String window) {
            this.window = window;
            return this;
        }


        //下面两种build方法都可以，前者使用Room的有参构造函数，后者使用无参构造。
        public Room build() {
            return new Room(this);
        }

        public Room build2() {
            Room room = new Room();
            room.door = this.door;
            room.floor = this.floor;
            room.window = this.window;
            return room;
        }
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
