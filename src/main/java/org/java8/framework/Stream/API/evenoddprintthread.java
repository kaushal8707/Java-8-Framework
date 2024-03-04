package org.example.programs;

public class evenoddprintthread implements Runnable{
    public static int i=1;
     Object obj;
    evenoddprintthread(Object obj){
        this.obj=obj;
    }
    public void run(){
        while(i<=10){
            if(i%2==0 && Thread.currentThread().getName().equals("even")){
                synchronized (obj){
                    System.out.println(i+" - "+"even");
                }
                i++;
            }
            if(i%2!=0 && Thread.currentThread().getName().equals("odd")){
                synchronized (obj){
                    System.out.println(i+" - "+"odd");
                }
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Object o=new Object();
       new Thread(new evenoddprintthread(o),"even").start();
       new Thread(new evenoddprintthread(o),"odd").start();

    }
}
