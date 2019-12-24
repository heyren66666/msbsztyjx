

import java.util.ArrayList;

//方法1：数组实现
/*class MyStack<T>{
    private ArrayList<T> arr;
    private int stackSize;

    public MyStack(){
        stackSize=0;
        arr=new ArrayList<T>();
    }
    boolean isEmpyt(){
        return stackSize==0;
    }

    int size(){
        return stackSize;
    }

    T top(){
        if (isEmpyt()){
            return null;
        }
        return arr.get(stackSize-1);
    }

    T pop(){
        if (stackSize>0){
            return arr.get(--stackSize);
        }
        else {
            System.out.println("栈已经为空");
            return null;
        }
    }
    void push(T item){
        arr.add(item);
        stackSize++;
    }
}*/

//方法2:链表方法
class LNode<T>{
    T data;
    LNode<T> next;
}
class MyStack<T>{
    private LNode<T> pHead;
    public MyStack(){
        pHead=new LNode<T>();
        pHead.data=null;
        pHead.next=null;
    }
    boolean empty(){
        return pHead==null;
    }
    int size(){
        int size=0;
        LNode<T> p=pHead.next;
        while (p!=null){
            p=p.next;
            size++;
        }
        return size;
    }
    void push(T e){
        LNode<T> p=new LNode<T>();
        p.data=e;
        p.next=pHead.next;
        pHead.next=p;
    }
    T pop(){
        LNode<T> tmp=pHead.next;
        if (tmp!=null){
            pHead.next=tmp.next;
            return tmp.data;
        }
        System.out.println("栈已经为空");
        return null;
    }
    T top(){
        if (pHead.next!=null){
            return pHead.next.data;
        }
        System.out.println("栈已经为空");
        return null;
    }
}
public class ImplementStack {
    public static void main(String[] args){
        MyStack<Integer> stack=new MyStack<>();
        stack.push(1);
        System.out.println("栈顶元素为："+stack.top());
        System.out.println("栈大小为："+stack.size());
        stack.pop();
        System.out.println("弹栈成功");
        stack.pop();
    }
}
