package org.example.factorymethod.export;

import org.example.factorymethod.export.factory.ExportDBFileOperator;
import org.example.factorymethod.export.factory.ExportOperator;
import org.junit.Test;

/**
 * Created by 48608 on 2018/2/28.
 */

public class Client {
    @Test
    public void test(){
        //导出文本文件
        ExportOperator operator=new ExportDBFileOperator();
        operator.export("今天的财务报表");
    }
}
