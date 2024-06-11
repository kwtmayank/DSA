package maths;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasicMaths {
    public static void main(String[] args) {
//        countDigits(846213);
//        countDigitsUsingLog(846213);
//        evenlyDivide(22074);
//        reverseNumber(1534236469);
//        checkPalindrome(1331);
//        checkPalindromeUsingString(12);
//        checkArmstrongNumber(1634); //371,
//        printAllDivisors(16);
//        checkPrimeNumber(36);
        checkForGCDOrHCF(52, 10);
    }

    private static void checkForGCDOrHCF(int n, int m) {
        long startTime = new Date().getTime();


        //Brute force
        int min = Math.min(n, m);
        for (int i = min; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                System.out.println("GCD is " + i);

                break;
            }
        }
        long endTime = new Date().getTime();

        //Using equilateral algorithm
//        while (n > 0 && m > 0) {
//            if (n > m) {
//                n = n % m;
//            } else {
//                m = m % n;
//            }
//        }
//
//        long endTime = new Date().getTime();
//        if (n == 0) {
//            System.out.println("HCF is " + m);
//        } else {
//            System.out.println("HCF is " + n);
//        }
        System.out.println("Time taken in millis " + (endTime - startTime));
    }

    private static boolean checkPrimeNumber(int n) {
        long startTime = new Date().getTime();
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if ((n % i == 0)) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }

            if (count > 2) {
                long endTime = new Date().getTime();
                System.out.println("Number is not prime inside");
                System.out.println("Time taken in millis " + (endTime - startTime));
                return false;
            }
        }

        long endTime = new Date().getTime();
        if (count == 2) {
            System.out.println("Number is prime");
            System.out.println("Time taken in millis " + (endTime - startTime));
            return true;
        } else {
            System.out.println("Number is not prime");
            System.out.println("Time taken in millis " + (endTime - startTime));
            return false;
        }
    }

    private static void printAllDivisors(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            if ((n % i == 0)) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }

        list.sort(Integer::compareTo);

        list.iterator().forEachRemaining(System.out::println);

    }

    private static boolean checkArmstrongNumber(int x) {
        int sum = 0;
        int dup = x;

        while (x > 0) {
            int rem = x % 10;
            sum = sum + (int) Math.pow(rem, 3);
            x /= 10;
        }

        if (sum == dup) {
            System.out.println("Number is armstrong");
            return true;
        }

        System.out.println("Number is not armstrong");
        return false;
    }

    private static boolean checkPalindromeUsingString(int x) {

        String num = String.valueOf(x);

        int length = num.length();

        for (int i = 0; i < length / 2; i++) {
            if (num.charAt(i) != num.charAt(length - i - 1)) {
                return false;
            }
        }

        System.out.println("Number is palindrome");
        return true;
    }

    private static boolean checkPalindrome(int x) {
        int dup = x;
        boolean isPalindrom = false;
        long revN = 0;


        while (x > 0) {
            int rem = x % 10;
            revN = (revN * 10) + rem;
            x /= 10;
        }

        if (revN > Integer.MAX_VALUE || revN < Integer.MIN_VALUE) {
            return false;
        }

        if (dup == revN) {
            isPalindrom = true;
        }

        return isPalindrom;
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
