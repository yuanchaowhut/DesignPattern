package org.example.responsibilitychain.demo02;

import java.util.List;

/**
 * Created by yuanchao on 2018/5/15.
 */
public class Response {
    private int code;
    private String content;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code='" + code + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
