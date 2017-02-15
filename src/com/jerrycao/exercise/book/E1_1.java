package com.jerrycao.exercise.book;

/**
 * Created by JerryCao on 2017/2/14.
 */
public class E1_1 {
    private static int[] getMax(int[] array,int k){
        int[] result = new int[k];
        bubbleShort(array);
        int j =0;
        for (int i=array.length-1;i>=0;i--){
            if(k>j){
                result[j] = array[i];
            }
            j++;
        }

        return result;
    }

    private static void bubbleShort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5,9,6,8,7,2,1};
        int k = 3;
        int[] result = getMax(a,k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
