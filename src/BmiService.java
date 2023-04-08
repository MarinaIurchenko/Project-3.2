public class BmiService {
    public int calculate(int weight) {
        double height = 1.68;
        int result = (int) (weight / (height * height));
        return result;
    }
}
