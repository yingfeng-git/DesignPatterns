package abstractfactory.po;

import po.Trim;

/**
 * @author yingfeng
 * @date 2020/2/16 20:14:01
 */
public class RichTrim extends Trim {
    @Override
    public void type() {
        System.out.println("this trim is so Rich");
    }
}
