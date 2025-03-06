package Recursion;

public class SumOfNumbers {
    public static int sumOfNumbers(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNumbers(n - 1);
    }

    public static int sumOfNumbersv2(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumOfNumbersv2(n));
    }
}
