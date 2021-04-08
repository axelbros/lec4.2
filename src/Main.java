public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bodymassindex1 = service.calculate(100, 193);
        System.out.println(bodymassindex1);

        float bodymassindex2 = service.calculate(66, 191);
        System.out.println(bodymassindex2);
        float bodymassindex3 = service.calculate(87, 177);
        System.out.println(bodymassindex3);
        float bodymassindex4 = service.calculate(57, 156);
        System.out.println(bodymassindex4);
        float bodymassinde5x = service.calculate(145, 193);
        System.out.println(bodymassinde5x);
    }
}