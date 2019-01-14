package com.company;

public class InPlace {
    public static void insertionSort(int[]arr){
        int x,y;
        for (int n=1;n<arr.length;n++){
            x=arr[n];
            y=n-1;
            while (y>=0&&arr[y]>x){
                arr[y+1]=arr[y];
                y--;
            }
            arr[y+1]=x;
        }
    }
    public static void bubbleSort(int[] arr){
        int n=1;
        while(n>0){
            n=0;
            for(int x=0;x<arr.length-1;x++){
                if(arr[x]>arr[x+1]){
                    SortingUtil.swap(arr,arr[x],arr[x+1]);
                    n++;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        int m;
        for (int n=0;n<arr.length;n++){
            m=n;
            for (int i=n+1;i<arr.length;i++){
                if(arr[i]<arr[m]){
                    m=i;
                }
            }
            SortingUtil.swap(arr,m,n);
        }
    }

}
