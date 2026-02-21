package ru.javamentor;


public class Main {
    public static long fibIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibIterative(10));
    }
}
