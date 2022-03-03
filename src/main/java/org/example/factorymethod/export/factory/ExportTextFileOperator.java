package org.example.factorymethod.export.factory;


import org.example.factorymethod.export.product.ExportFileApi;
import org.example.factorymethod.export.product.ExportTextFile;

/**
 * Created by 48608 on 2018/2/28.
 */

public class ExportTextFileOperator extends ExportOperator{
    @Override
    public ExportFileApi factoryMethod() {
        return new ExportTextFile();
    }
}
