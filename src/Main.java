public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float Bmi1 = service.calculate(100, 193);
        System.out.println(Bmi1);
        float Bmi2 = service.calculate(66, 191);
        System.out.println(Bmi2);
        float Bmi3 = service.calculate(87, 177);
        System.out.println(Bmi3);
        float Bmi4 = service.calculate(57, 156);
        System.out.println(Bmi4);
        float Bmi5 = service.calculate(145, 193);
        System.out.println(Bmi5);
    }
}