import java.util.Comparator;

/**
 * @author yingfeng
 * @date 2020/1/17 15:46:21
 */
public class Sorter<T> {
    public void sort(T[] x, Comparator comparator) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (comparator.compare(x[i], x[j]) > 0) {
                    swap(x, i, j);
                }
            }
        }
    }

    public void swap(T[] a, int i, int j){
        T flag = a[i];
        a[i] = a[j];
        a[j] = flag;
    }

}
