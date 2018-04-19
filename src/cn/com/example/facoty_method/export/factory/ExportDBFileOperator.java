package cn.com.example.facoty_method.export.factory;

import cn.com.example.facoty_method.export.product.ExportDBFile;
import cn.com.example.facoty_method.export.product.ExportFileApi;

/**
 * Created by 48608 on 2018/2/28.
 */

public class ExportDBFileOperator extends ExportOperator{
    @Override
    public ExportFileApi factoryMethod() {
        return new ExportDBFile();
    }
}
