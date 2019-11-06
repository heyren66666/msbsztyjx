class ShareObject1{}
class ShareObject2{}
class Thread1 extends Thread{
    public void run(){
        synchronized (ShareObject1.class){
            System.out.println("线程1获取到ShareObject1锁");
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (ShareObject2.class){
                System.out.println("线程1获取到ShareObject2锁");
            }
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        synchronized (ShareObject2.class){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("线程2获取到ShareObject2锁");
            synchronized (ShareObject1.class){
                System.out.println("线程2获取到ShareObject1锁");
            }
        }
    }
}

public class java327 {
    public static void main(String[] args){
        new Thread1().start();
        new Thread2().start();
    }
}
