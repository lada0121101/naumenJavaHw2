package org.example;

import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Task1 t1 = new Task1();
        int[] array = t1.genArray(n);
        for (int i=0;i<n;i++)
            System.out.print(Integer.toString(array[i])+" ");
        System.out.println("");
        System.out.println(t1.findLastPosValue(array));
        n = scan.nextInt();
        Task2 t2 = new Task2();
        ArrayList<Double> l = t2.initArrayList(n);
        l.stream().forEach(x ->System.out.print(x+" "));
        System.out.println("");
        t2.SelectionSort(l);
        l.stream().forEach(x ->System.out.print(x+" "));
        System.out.println("");
        Task3 t3 = new Task3();
        ArrayList<Task3.Employee> list = t3.genEmployees();
        Stream<String> stream = t3.transform(list);
        stream.forEach(System.out::println);
        Task4 t4 = new Task4();
        String headers = t4.makeRequest("https://httpbin.org/anything");
        t4.getAccept(headers);
    }
}
