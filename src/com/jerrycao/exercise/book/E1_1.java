package com.jerrycao.exercise.book;

/**
 * Created by JerryCao on 2017/2/14.
 */
public class E1_1 {
    private static int[] getMax(int[] array,int k){
        int[] result = new int[k];
        for (int i = 0; i < array.length; i++) {
            if(i<k){
                result[i] = array[i];
            }
        }
        bubbleShort(result);
        if(k>array.length){
            return null;
        }else if(k==array.length){
            return result;
        }else {
            return exchange(result,array);
        }
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

    private static int[] exchange(int[] array_1,int[] array_2){
        int max = array_1[array_1.length-1];
        for (int i = 0; i < array_2.length; i++) {
            if(max<array_2[i]){
                for(int j = array_1.length;j>0;j--){
                    array_1[j-1] = array_1[j];
                    array_1[array_1.length] = array_2[i];
                }
            }
        }
        return array_1;
    }
    public static void main(String[] args) {
        int[] a = {5,9,6,8,7,2,1};
        int k = 3;
        int[] result = getMax(a,k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(i);
        }
    }
}
