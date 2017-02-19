package com.jerrycao.exercise.book;

/**
 * Created by JerryCao on 2017/2/19.
 */
public class E3_1 {
    private static void printDigit(int i){
        System.out.print(i);
    }

    private static void printOut(int n){
        if(n>=10){
            printOut(n/10);
        }
        printDigit(n%10);
    }

    private static void printDouble(double f){
        if(f<0){
            System.out.printf("-");
            f=-f;
        }
        String value = String.valueOf(f);
        int intPart= 0,dotPart =0;
        int index = value.indexOf(".");
        if(index<0){
            printOut(Integer.valueOf(value));
        }else if(index==0){
            intPart = 0;
            dotPart = Integer.valueOf(value.substring(index+1));
            printOut(intPart);
            System.out.printf(".");
            printOut(dotPart);
        }else{
            intPart = Integer.valueOf(value.substring(0,index));
            dotPart = Integer.valueOf(value.substring(index+1));
            printOut(intPart);
            System.out.printf(".");
            printOut(dotPart);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printDouble(10.234);
        printDouble(-10000.2);
        printDouble(1000);
        printDouble(10001.0);
        printDouble(10001.1456);
    }
}
