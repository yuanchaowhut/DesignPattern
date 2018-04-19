package cn.com.example.facoty_method.export.factory;

import cn.com.example.facoty_method.export.product.ExportFileApi;
import cn.com.example.facoty_method.export.product.ExportTextFile;

/**
 * Created by 48608 on 2018/2/28.
 */

public class ExportTextFileOperator extends ExportOperator{
    @Override
    public ExportFileApi factoryMethod() {
        return new ExportTextFile();
    }
}
