package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public void SelectionSort(ArrayList<Double> l){
        for(int i =0;i<l.size();i++){
            double min = l.get(i);
            int mini = i;
            for(int j = i+1;j<l.size();j++){
                if(l.get(j)< min){
                    min = l.get(j);
                    mini = j;
                }
            }
            double t = l.get(i);
            l.set(i,min);
            l.set(mini,t);
        }
    }

    public ArrayList<Double> initArrayList(int size){
        ArrayList<Double> list = new ArrayList<>();
        Random rand = new Random(size);
        for (int i=0;i<size;i++)
            list.add(rand.nextDouble());
        return list;
    }
}
