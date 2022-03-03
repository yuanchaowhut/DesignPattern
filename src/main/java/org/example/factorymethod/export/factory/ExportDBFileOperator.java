package org.example.factorymethod.export.factory;

import org.example.factorymethod.export.product.ExportDBFile;
import org.example.factorymethod.export.product.ExportFileApi;

/**
 * Created by 48608 on 2018/2/28.
 */

public class ExportDBFileOperator extends ExportOperator{
    @Override
    public ExportFileApi factoryMethod() {
        return new ExportDBFile();
    }
}
