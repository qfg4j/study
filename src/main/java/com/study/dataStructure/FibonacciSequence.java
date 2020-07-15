package com.study.dataStructure;

/**
 * @Desc 斐波那契数列
 * @Author Black
 * @Date 2020/7/15 22:22
 */
public class FibonacciSequence {

    public static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }

    public static int fib1(int n){
        int a = 1;
        int b = 1;
        int temp = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = a + b;
//            temp = b;
            a = b;
            b = sum;
        }
        return sum;
    }

    /**
     * 1 1 2 3 5 8.....n
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(fib1(5));
    }
}
