package abstractfactory.po;

import po.Engine;

/**
 * @author yingfeng
 * @date 2020/2/16 20:12:57
 */
public class V8Engine extends Engine {
    @Override
    public void model() {
        System.out.println("this is v8");
    }
}
