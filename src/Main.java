public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 67;
        double height = 1.68;
        int index = service.calculate(weight,height);
        System.out.println(index);
        System.out.println("Index");
    }
}