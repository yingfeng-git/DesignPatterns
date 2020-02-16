package po;

/**
 * @author yingfeng
 * @date 2020/2/16 18:49:17
 */
public class Car implements Vehicle{

    @Override
    public void go(){
        System.out.println("Car is running...");
    }
}
