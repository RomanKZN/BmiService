public class BmiService {
    public int calculate(int weight, double height) {
        double bodyMassIndex= weight /height/height;


        return (int) bodyMassIndex;
    }
}
