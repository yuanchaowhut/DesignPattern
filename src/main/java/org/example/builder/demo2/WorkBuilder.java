package org.example.builder.demo2;

/**
 * Created by yuanchao on 2018/3/31.
 * 改进版（Android版建造者模式）：
 * 1.定义了一个内部类RoomAttrs，它的属性完全copy Room类的属性。RoomAttrs有一个apply方法，
 *   它接收一个空的Room,然后将自身的已赋值的属性设置给空Room，最后返回成品。
 * 2.WorkBuilder不再真正负责创建，它只负责记录Client传递过来的属性，最终交给RoomAttrs去真正创建，好处是最后创建前，
 *   用户可以随时修改房子的属性，并且WorkBuilder采用了链式结构，方便调用。
 * 3.舍弃了Director类（也有叫Designer类），Client需要直接面向具体的WorkBuilder，并且建造部位、顺序完全交给客户端决定。
 */
public class WorkBuilder {
    private RoomAttrs attrs;

    public WorkBuilder() {
        attrs = new RoomAttrs();
    }

    public WorkBuilder buildDoor(String door) {
        attrs.door = door;
        return this;
    }

    public WorkBuilder buildFloor(String floor) {
        attrs.floor = floor;
        return this;
    }

    public WorkBuilder buildWindow(String window) {
        attrs.window = window;
        return this;
    }

    public Room build() {
        Room room = new Room();
        return attrs.apply(room);
    }


    class RoomAttrs {
        String door;
        String floor;
        String window;

        public Room apply(Room room) {
            if (door != null) {
                room.setDoor(door);
                System.out.println("创建了"+door);
            }
            if (floor != null) {
                room.setFloor(floor);
                System.out.println("创建了"+floor);
            }
            if (window != null) {
                room.setWindow(window);
                System.out.println("创建了"+window);
            }

            return room;
        }
    }
}
