package com.company;

public class SortingUtil {
    public static void swap(int[] arr, int i,int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static int[] randIntArr(int c){
        int arr[]=new int[c];
        for (int n=0;n<c;n++){
            arr[n]=(int)(Math.random()*10001);
        }
        return arr;
    }
    public static boolean isSorted(int[] arr){
        int n=1;
        while(n>0){
            n=0;
            for(int x=0;x<arr.length-1;x++){
                if(arr[x]>arr[x+1]){
                    n++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkSum(int[]before,int[]after){
        int arr1=0;
        int arr2=0;
        if(before.length==after.length){
            return true;
        }else{
            return false;
        }
    }
}