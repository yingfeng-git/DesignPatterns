import abstractfactory.AbstractFactory;
import abstractfactory.BmwFactory;
import abstractfactory.MazdaFactory;
import factory.CarFactory;
import po.Engine;
import po.Shell;
import po.Trim;
import po.Vehicle;

/**
 * 简单工厂(BigFactory.java）
 * 工厂方法(Car/PlaneFactory.java)
 * 抽象工厂(AbstractFactory)
 * @author yingfeng
 * @date 2020/2/16 18:48:02
 */
public class Main {
    public static void main(String[] args) {
//        Vehicle c = new CarFactory().create();
//        c.go();

        AbstractFactory carFactory = new MazdaFactory();

        Engine e = carFactory.createEngine();
        Shell s = carFactory.createShell();
        Trim t = carFactory.createTrim();

        e.model();
        s.color();
        t.type();

    }
}
