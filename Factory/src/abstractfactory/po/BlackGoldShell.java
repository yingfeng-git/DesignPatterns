package abstractfactory.po;

import po.Shell;

/**
 * @author yingfeng
 * @date 2020/2/16 20:26:23
 */
public class BlackGoldShell extends Shell {
    @Override
    public void color() {
        System.out.println("this is blackgold");
    }
}
