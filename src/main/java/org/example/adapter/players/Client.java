package org.example.adapter.players;

import org.junit.Test;

/**
 * Created by yuanchao on 2018/6/27.
 */
public class Client {

    @Test
    public void testPlay(){
        Player maidi = new Forwards("麦迪");
        maidi.attack();
        maidi.defense();

        Player badier = new Guards("巴蒂尔");
        badier.attack();
        badier.defense();

        ForeignCenter yaoming = new ForeignCenter("姚明");
        Player translator = new Translator(yaoming);
        translator.attack();
        translator.defense();
    }
}
