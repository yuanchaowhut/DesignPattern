package org.example.factorymethod.export.factory;


import org.example.factorymethod.export.product.ExportFileApi;

/**
 * Created by 48608 on 2018/2/28.
 * 抽象工厂
 */

public abstract class ExportOperator {

    //工厂方法：核心就是产品的实例化延迟到了工厂子类去实现
    public abstract ExportFileApi factoryMethod();


    public boolean export(String data) {
        ExportFileApi api=factoryMethod();
        return api.export(data);
    }
}
