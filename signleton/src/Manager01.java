/**
 * 饿汉式
 * 简单，只有一个实例，线程安全
 * 缺点：无论什么情况，类加载的时候都要完成实例化
 * 最简单粗暴
 * @author yingfeng
 * @date 2020/1/7 9:03:57
 */
public class Manager01 {
    /**
     * 静态final来new一个对象
     */
    private static final Manager01 INSTANCE = new Manager01();

    /**
    * 构造方法要为private
    */
    private Manager01(){};

    /**
     * return 静态的get方法
     */
    public static Manager01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Manager01 manager01 = Manager01.getInstance();
        Manager01 manager02 = Manager01.getInstance();

        System.out.println(manager01 == manager02);
    }

}
