package org.example.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread t :" + Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable
{

    @Override
    public void run() {
        System.out.println("MyRunnable t :" + Thread.currentThread().getName());
        System.out.println("Support multiple inheritance");
    }
}

class MyCallable implements Callable<String>
{

    @Override
    public String call() throws Exception {
        System.out.println("MyCallable t :" + Thread.currentThread().getName());
        System.out.println("Support multiple inheritance");
        System.out.println("can have return statement");
        System.out.println("Handles checked exceptions");
        return "Completed";
    }
}
public class DemoThreads {
    static void main(String[] args) {
        System.out.println("DemoThread main()--started");
        System.out.println("DemoThread main()--before MyThread start");
        MyThread t = new MyThread();
        t.start();
        System.out.println("DemoThread main()--after MyThread start");

        System.out.println();
        System.out.println("DemoThread main()--before MyRunnable start");
        Thread t1 =new Thread(new MyRunnable());
        t1.start();
        System.out.println("DemoThread main()--after MyRunnable start");


        System.out.println();
        System.out.println("DemoThread main()--before MyCallable start");
        FutureTask<String> ft= new FutureTask<>(new MyCallable());
        Thread t3= new Thread(ft);
        t3.start();

        try
        {
            String results = ft.get();//Blocking call
            System.out.println(results);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }




        System.out.println("DemoThread main()--after MyCallable start");



        System.out.println("DemoThread main()--completed");




    }
}
