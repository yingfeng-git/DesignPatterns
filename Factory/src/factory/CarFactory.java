package factory;

import po.Car;

/**
 * 工厂方法，实际上就是将简单工厂拆开，提高扩展性
 * @author yingfeng
 * @date 2020/2/16 18:48:40
 */
public class CarFactory {
    public Car create(){
        System.out.println("Create by CarFactory");
        return new Car();
    }
}
