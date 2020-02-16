import java.util.Comparator;

/**
 * @author yingfeng
 * @date 2020/2/16 18:18:54
 */
public class WeightComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.weight, o2.weight);
    }

}
