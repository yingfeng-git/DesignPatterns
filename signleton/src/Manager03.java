/**
 * class
 *
 * @author yingfeng
 * @date 2020/1/7 10:36:02
 */
public enum  Manager03 {
    // 单例使用
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                System.out.println(Manager03.INSTANCE.hashCode());
            }).start();
        }
    }
}
