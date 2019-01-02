package cn.com.example.mediator.demo02;

/**
 * Created by yuanchao on 2019/1/2.
 * 联合国安全理事会
 */
public class UnitedNationsSecurityCouncil extends UnitedNations {
    private Country usa;
    private Country iraq;

    public void setUsa(Country usa) {
        this.usa = usa;
    }

    public void setIraq(Country iraq) {
        this.iraq = iraq;
    }

    @Override
    protected void declare(String message, Country country) {
        if (country == usa) {
            iraq.getMessage(message);
        } else {
            usa.getMessage(message);
        }
    }
}
