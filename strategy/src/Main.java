import java.util.Arrays;

/**
 * 策略模式：根据不同的策略比较狗的大小
 * @author yingfeng
 * @date 2020/1/17 15:46:14
 */
public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(1, 3),
                      new Dog(3, 1),
                      new Dog(2, 2)};

        Sorter<Dog> sorter = new Sorter<>();
//        sorter.sort(dogs, new HeightComparator());
        sorter.sort(dogs, new WeightComparator());
        System.out.println(Arrays.toString(dogs));

    }
}
