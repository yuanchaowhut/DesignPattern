package cn.com.example.builder.demo1;

/**
 * Created by yuanchao on 2018/3/31.
 */
public class MediaBuilder implements Builder {
    Fridge fridge = new Fridge();

    @Override
    public void buildDoor() {
        fridge.setDoor("美式对开门");
        System.out.println("创建美式对开门门体");
    }

    @Override
    public void buildBox() {
        fridge.setBox("512L");
        System.out.println("创建512L箱体");
    }

    @Override
    public void buildCompressor() {
        fridge.setCompressor("日本制造压缩机");
        System.out.println("创建日本制造压缩机");
    }

    @Override
    public Fridge build() {
        return fridge;
    }
}
