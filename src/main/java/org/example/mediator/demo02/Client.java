package org.example.mediator.demo02;

import org.junit.Test;

/**
 * Created by yuanchao on 2019/1/2.
 */
public class Client {
    @Test
    public void testCountry(){
        UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();
        Country usa = new USA(unsc);
        Country iraq = new Iraq(unsc);
        unsc.setUsa(usa);
        unsc.setIraq(iraq);

        usa.declare("不准研制生化武器，否则要发动战争！");
        iraq.declare("我们没有生化武器，也不怕侵略！");
    }
}
