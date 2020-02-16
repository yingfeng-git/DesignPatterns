package abstractfactory.po;

import po.Engine;

/**
 * @author yingfeng
 * @date 2020/2/16 20:25:25
 */
public class WankelEngine extends Engine {
    @Override
    public void model() {
        System.out.println("this is WankelEngine");
    }
}
