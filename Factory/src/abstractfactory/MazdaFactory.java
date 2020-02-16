package abstractfactory;

import abstractfactory.po.BlackGoldShell;
import abstractfactory.po.RaceTrim;
import abstractfactory.po.WankelEngine;
import po.Engine;
import po.Shell;
import po.Trim;

/**
 * @author yingfeng
 * @date 2020/2/16 20:24:47
 */
public class MazdaFactory extends AbstractFactory {
    @Override
    public Engine createEngine() {
        return new WankelEngine();
    }

    @Override
    public Shell createShell() {
        return new BlackGoldShell();
    }

    @Override
    public Trim createTrim() {
        return new RaceTrim();
    }
}
