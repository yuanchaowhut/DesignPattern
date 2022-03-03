package org.example.builder.demo1;

/**
 * Created by yuanchao on 2018/3/31.
 * 产品：冰箱
 * 特性：创建步骤稳定，但每个步骤细节可以很复杂。
 * 门体：两门，三门，对开门。。。
 * 箱体：100L，200L，500L。。。
 * 压缩机：日本制造，德国制造，中国制造。。。
 */
public class Fridge {
    private String door;         //门体
    private String box;          //箱体
    private String compressor;   //压缩机

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getCompressor() {
        return compressor;
    }

    public void setCompressor(String compressor) {
        this.compressor = compressor;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "door='" + door + '\'' +
                ", box='" + box + '\'' +
                ", compressor='" + compressor + '\'' +
                '}';
    }
}
