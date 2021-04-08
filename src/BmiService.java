public class BmiService {
    public float calculate(float weight, float height) {

        float h2 = height * height;
        float bodymassindex = (weight/h2)*10000;
        return bodymassindex;
    }
}
