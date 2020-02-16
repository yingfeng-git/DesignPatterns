/**
 * 懒汉式
 * 简单，只有调用的时候才实例化，
 * 缺点：线程不安全
 * @author yingfeng
 * @date 2020/1/7 9:33:01
 */
public class Manager02 {
    /**
     * 如果没有加volatile，JIT会对代码进行语句重排，在没有初始化的时候返回INSTANCE
     * 如果有优化JIT
     */
    private static volatile Manager02 INSTANCE;

    /**
     * 构造方法要为private
     */
    private Manager02(){};

    /**
     * return 在get方法中new
     * 使用双检锁
     */
     public static Manager02 getInstance(){
        if (INSTANCE == null){
            synchronized(Manager02.class) {
                if(INSTANCE == null) {
                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Manager02();
                }
            }
        }
        return INSTANCE;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                System.out.println(Manager02.getInstance().hashCode());
            }).start();
        }
    }
}
