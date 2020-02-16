package abstractfactory.po;

import po.Shell;

/**
 * @author yingfeng
 * @date 2020/2/16 20:13:34
 */
public class WhileShell extends Shell {
    @Override
    public void color() {
        System.out.println("this is while");
    }
}
