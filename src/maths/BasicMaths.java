package maths;

public class BasicMaths {
    public static void main(String[] args) {
//        countDigits(846213);
//        countDigitsUsingLog(846213);
//        evenlyDivide(22074);
        reverseNumber(1534236469);
    }

    private static void reverseNumber(int N) {
        long revN = 0;

        boolean isNeg = false;
        if (N < 0) {
            N = -N;
            isNeg = true;
        }
        while (N > 0) {
            int rem = N % 10;
            revN = (revN * 10) + rem;
            N /= 10;
        }

        if (revN > Integer.MAX_VALUE || revN < Integer.MIN_VALUE)
            System.out.println(0);

        if (isNeg) {
            revN = -revN;
        }
        System.out.println("Reverse is " + (int) revN);
    }

    private static void countDigitsUsingLog(int i) {
        int counter = (int) Math.log10(i) + 1;
        System.out.println("Number of digits are " + counter);
    }

    private static void evenlyDivide(int N) {
        int counter = 0;
        int originalValue = N;
        while (N > 0) {
            int rem = N % 10;
            if (rem != 0 && originalValue % rem == 0) {
                counter++;
            }
            System.out.println(N);
            N = N / 10;

        }
        System.out.println("Number of digits are " + counter);
    }

    public static void countDigits(int n) {
        int counter = 0;
        while (n > 0) {
            int rem = n % 10;
            counter++;
            n = n / 10;
        }
        System.out.println("Number of digits are " + counter);
    }


}
