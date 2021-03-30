import java.util.Random;
import java.lang.Math;

public class ComputeMethods5026201125 {
    public static double fToC(double degreesF){
        double Celc = (degreesF - 32) * ((float)5/9);
        return Celc;
    }
    public static double hypotenuse(int a, int b){
        double C = Math.sqrt(((Math.pow(a,2))+(Math.pow(b,2))));
        return C;
    }
    public int roll() {
        Random random = new Random();
        int rand1 = random.nextInt(6) + 1;
        int rand2 = random.nextInt(6) + 1;
        return rand1 + rand2;
    }
}