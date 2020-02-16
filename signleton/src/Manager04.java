/**
 * 静态内部类
 * @author yingfeng
 * @date 2020/1/7 10:38:37
 */
public class Manager04 {
    private Manager04(){}

    private static class Manager04Holder{
        private final static Manager04 INSTANCE = new Manager04();
    }

    public static Manager04 getInstance(){
        return Manager04Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                System.out.println(Manager04.getInstance().hashCode());
            }).start();
        }
    }
}
