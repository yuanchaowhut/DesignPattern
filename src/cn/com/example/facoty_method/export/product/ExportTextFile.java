package cn.com.example.facoty_method.export.product;

/**
 * Created by 48608 on 2018/2/28.
 */

public class ExportTextFile implements ExportFileApi{
    @Override
    public boolean export(String data) {
        System.out.println("数据："+data);
        System.out.println("导出生成了文本文件");
        return true;
    }
}
