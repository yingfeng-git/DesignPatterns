package abstractfactory;

import abstractfactory.po.RichTrim;
import abstractfactory.po.V8Engine;
import abstractfactory.po.WhileShell;
import po.Engine;
import po.Shell;
import po.Trim;

/**
 * @author yingfeng
 * @date 2020/2/16 20:05:24
 */
public class BmwFactory extends AbstractFactory {
    @Override
    public Engine createEngine() {
        return new V8Engine();
    }

    @Override
    public Shell createShell() {
        return new WhileShell();
    }

    @Override
    public Trim createTrim() {
        return new RichTrim();
    }
}
