package abstractfactory;

import po.Engine;
import po.Shell;
import po.Trim;

/**
 * 抽象工厂
 * 制造一辆汽车需要引擎，外壳，内饰
 * 定义产品的一族
 * @author yingfeng
 * @date 2020/2/16 19:56:38
 */
public abstract class AbstractFactory {
    public abstract Engine createEngine();
    public abstract Shell createShell();
    public abstract Trim createTrim();
}
