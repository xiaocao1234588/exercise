package com.jerrycao.exercise.book;

/**
 * Created by JerryCao on 2017/2/19.
 * 打印全排列
 */
public class E6_1 {
    public static void permute(String str){
        char[] chars = str.toCharArray();
        permute(chars,str.length()-1,0);
    }

    private static void permute(char[] chars,int high,int low){
        if (high == low){
            String result ="";
            for (int i = 0; i <= high; i++) {
                result += chars[i];
            }
            System.out.println(result);
        }else {
            for (int i = low; i <= high; i++) {
                swap(chars,low,i);
                permute(chars,high,low+1);
                swap(chars,low,i);
            }
        }
    }

    private static void swap(char[] chars,int i,int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String str ="abc";
        permute(str);
    }
}
