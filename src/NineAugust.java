import java.util.Arrays;

public class NineAugust {
    public static double[] convertTemperature(double celsius) {
        double[] answer = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;
        answer[0] = kelvin;
        answer[1] = fahrenheit;
        return answer;
        // System.out.println(kelvin, fahranheit);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertTemperature(24)));
    }
}
