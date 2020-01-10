import java.util.Stack;

class MyStack2<T>{
    private Stack<T> A=new Stack<>();
    private Stack<T> B=new Stack<>();
    public void push(T data){
        A.push(data);
    }

    public T pop(){
        if (B.empty())
        {
            while (!A.empty()){
                B.push(A.peek());
                A.pop();
            }
        }
        T first=B.peek();
        B.pop();
        return first;
    }
}

public class TwoStackSimulationQueue {
    public static void main(String[] args){
        MyStack2<Integer> stack=new MyStack2<Integer>();
        stack.push(1);
        stack.push(2);
        System.out.println("队列首元素为："+stack.pop());
        System.out.println("队列首元素为："+stack.pop());
    }
}
