package org.example;
import java.util.Random;



public class Task1 {
    public int findLastPosValue(int [] arr){
        for(int i= arr.length-1;i>=0;i--){
            if(arr[i]>0)
                return arr[i];
        }
        return -1;
    }

    public int[] genArray(int len){
        Random rand = new Random(len);
        int[] a = new int[len];
        for (int i=0;i<len;i++){
            a[i]= rand.nextInt();
        }
        return a;
    }
}
