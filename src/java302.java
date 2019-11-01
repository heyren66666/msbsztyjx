
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
    }

