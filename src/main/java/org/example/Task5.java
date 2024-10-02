package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Task5 implements Task{
     private boolean work;
     private Queue<Object> queue = new LinkedList<>();
     @Override
     public void start(){
         work=true;
         while (work) {
             Object o = queue.poll();
             if(o != null)
                 System.out.println("Read element:" + o.toString());
             try {
                 Thread.sleep(10000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
     }

     @Override
     public void stop(){
          work = false;
         System.out.println("Stop!");
     }

     public void addInQuery(Object o){
         queue.add(o);
     }
}
