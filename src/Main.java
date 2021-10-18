public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.82;
        int weight= 90;
        int bodyMassIndex = service.calculate(weight,height);
        System.out.println(bodyMassIndex);

    }
}