package factory;

import po.Car;
import po.Plane;

/**
 * 简单工厂模式
 * @author yingfeng
 * @date 2020/2/16 18:52:53
 */
public class BigFactory {
    public Car createCar(){
        System.out.println("create Car by BigFactory");
        return new Car();
    }

    public Plane createPlane(){
        System.out.println("create Plane by BigFactory");
        return new Plane();
    }
}
