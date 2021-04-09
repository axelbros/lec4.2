public class BmiService {
    public float calculate(float weight, float height) {
        float HeightSquare = height * height;
        float Bmi = (weight / HeightSquare) * 10000;
        return Bmi;
    }
}
