

import java.util.ArrayList;

//方法1:数组方法实现队列
/*    class MyQueue<T>{
        private ArrayList<T> arr=new ArrayList<T>();
        private int front;
        private int rear;
        public MyQueue(){
            front=0;
            rear=0;
        }
        public boolean isEmpyt(){
            return front==rear;
        }
        public int size(){
            return rear-front;
        }
        public T getFront(){
            if (isEmpyt()){
                return null;
            }
            return arr.get(front);
        }
        public T getBack(){
            if (isEmpyt()){
                return null;
            }
            return arr.get(rear-1);
        }
        public void deQueue(){
            if (rear>front){
                front++;
            }
            else {
                System.out.println("队列已经为空");
            }
        }
        public void enQueue(T item){
            arr.add(item);
            rear++;
        }
    }*/

//方法2：链表方法实现数组
class LNode<T>{
    T data;
    LNode<T> next;
}
class MyQueue<T>{
    private LNode<T> pHead;
    private LNode<T> pEnd;
    public MyQueue(){
        pEnd=pHead=null;
    }
    boolean empty(){
        if (pHead==null){
            return true;
        }
        else {
            return false;
        }
    }
    int size(){
        int size=0;
        LNode<T> p=pHead;
        while (p!=null){
            p=p.next;
            size++;
        }
        return size;
    }
    void enQueue(T e){
        LNode<T> p=new LNode<T>();
        p.data=e;
        p.next=null;
        if (pHead==null){
            pHead=pEnd=p;
        }
        else {
            pEnd.next=p;
            pEnd=p;
        }
    }
    void deQueue(){
        if (pHead==null)
            System.out.println("出队列失败，队列已经为空");
        pHead=pHead.next;
        if (pHead==null)
            pEnd=null;
    }
    T getFront(){
        if (pHead==null){
            System.out.println("获取队列首元素是比埃，队列已经为空");
            return null;
        }
        return pHead.data;
    }
    T getBack(){
        if (pEnd==null){
            System.out.println("获取队尾元素失败，队列已经为空");
            return null;
        }
        return pEnd.data;
    }
}

public class ImplementQueue {
        public static void main(String[] args){
            MyQueue<Integer> queue=new MyQueue<Integer>();
            queue.enQueue(1);
            queue.enQueue(2);
            System.out.println("队列头元素为："+queue.getFront());
            System.out.println("队列的尾元素为："+queue.getBack());
            System.out.println("队列大小为："+queue.size());
        }
}

