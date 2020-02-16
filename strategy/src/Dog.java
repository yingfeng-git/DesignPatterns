/**
 * @author yingfeng
 * @date 2020/1/17 15:42:53
 */
public class Dog {
    int height;
    int weight;
    public Dog(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"height\":")
                .append(height);
        sb.append(",\"weight\":")
                .append(weight);
        sb.append('}');
        return sb.toString();
    }
}
