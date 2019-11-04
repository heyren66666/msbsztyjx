//利用newSingleThreadExecutor创建单线程的线程池
/*
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getId()+"run");
    }
}

public class java326 {
    public static void main(String[] args){
        ExecutorService pool= Executors.newSingleThreadExecutor();
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
    }
}
*/



//newFixedThreadPool创建一个定长线程池，可控制线程的最大并发数
/*
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//newFixedThreadPool创建定长线程池，可控制最大并发数
class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getId()+"run");
    }
}

public class java326{
    public static void main(String[] args){
        ExecutorService pool=Executors.newFixedThreadPool(2);
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
        pool.execute(new MyThread());
    }
}*/




/*
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//newCatchedThreadPool：创建一个可缓存线程池，可灵活回收空闲线程
class MyThred extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getId()+"run");
    }
}

public class java326{
    public static void main(String[] args){
        ExecutorService pool= Executors.newCachedThreadPool();
        pool.execute(new MyThred());
        pool.execute(new MyThred());
        pool.execute(new MyThred());
        pool.execute(new MyThred());
    }
}*/


//newScheduledThread创建一个定长线程池，支持定时和周期性执行任务


import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getId()+"timestamp"+System.currentTimeMillis());
    }
}

public class java326{
    public static void main(String[] args){
        ScheduledThreadPoolExecutor exec=new ScheduledThreadPoolExecutor(2);
        exec.scheduleAtFixedRate(new MyThread(),0,3000, TimeUnit.MILLISECONDS);
        exec.scheduleAtFixedRate(new MyThread(),0,2000,TimeUnit.MILLISECONDS);
    }
}