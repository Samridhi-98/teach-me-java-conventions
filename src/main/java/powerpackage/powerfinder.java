package powerpackage;

public class powerfinder {
    public static int OF(int base, int exponent) {
        int power = 1;
        for (int idx = 0; idx<exponent; idx++) {
            power *= base;
        }
        return power;
    }
}
