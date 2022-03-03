package org.example.proxy.dynamic;

public class TeacherCang implements Girl {
    @Override
    public boolean dating(float length) {
        if (length >= 1.7F) {
            System.out.println("身高符合要求，同意约会!");
            return true;
        } else {
            System.out.println("身高不符合要求，不同意约会!");
            return false;
        }
    }
}
