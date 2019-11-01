//1.实现接口runnable，实现run（）方法2.创建Thread对象，用实现Runnable接口的对象作为参数实例化Thread对象3.调用Thread的start()方法
/*
    class MyThread implements Runnable{
        public void run(){
            System.out.println("Thread body");
        }
    }
    public class java302{
        public static void main(String[] args){
            MyThread thread=new MyThread();
            Thread t=new Thread(thread);
            t.start();
        }
    }*/

//继承Thread类，重写run方法
/*
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread body");
    }
}

public class java302{
    public static void main(String[] args){
        MyThread thread=new MyThread();
        thread.start();
    }
}*/

import java.util.concurrent.*;

//实现Callable接口，重写call()方法
public class java302{
    public static class CallabelTest implements Callable<String>{
        @Override
        public String call() throws Exception {
            return "Hello world";
        }
    }
    public static void main(String[] args){
        ExecutorService threadPool= Executors.newSingleThreadExecutor();
        Future<String> future=threadPool.submit(new CallabelTest());
        try {
            System.out.println("waiting thread to finish");
            System.out.println(future.get());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

