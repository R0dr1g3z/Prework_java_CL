import java.util.Locale;

public class Tables07 {
    public static void main(String[] args) {
        double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
        double avg = 0;
        for (int i = 0; i < temps.length; i++) {
            temps[i] = temps[i] * 1.8 + 32;
            avg += temps[i];
        }
        avg /= temps.length - 1;
        for (int i = 0; i < temps.length; i++) {
            System.out.println(String.format("%.2f", temps[i]));
        }
        System.out.println("ŚREDNIA: " + String.format("%.2f", avg));
    }
}
