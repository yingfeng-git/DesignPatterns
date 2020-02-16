package abstractfactory.po;

import po.Trim;

/**
 * @author yingfeng
 * @date 2020/2/16 20:27:31
 */
public class RaceTrim extends Trim {
    @Override
    public void type() {
        System.out.println("this trim is Racing!");
    }
}
