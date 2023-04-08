public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 67;
        int index = service.calculate(weight);
        System.out.println(index);
        System.out.println("Index");
    }
}