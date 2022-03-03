package org.example.state;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/6/26.
 */
public class Clent {

    @Test
    public void testGetWorkState() {
        Work work = new Work();
        work.setHour(10);
        work.getWorkState();

        work.setHour(13);
        work.getWorkState();

        work.setHour(16);
        work.getWorkState();

        work.setHour(19);
        work.getWorkState();

        work.setHour(21);
        work.getWorkState();

        work.setHour(23);
        work.setFinish(true);
        work.getWorkState();
    }
}
