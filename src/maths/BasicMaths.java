package maths;

public class BasicMaths{
    public static void main(String[] args) {
        countDigits(846213);
    }

    public static void countDigits(int n){
        int counter = 0;
        while(n > 0){
            int rem = n%10;
            counter++;
            n = n/10;
        }
        System.out.println("Number of digits are "+counter);
    }


}
