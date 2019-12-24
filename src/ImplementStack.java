import java.util.ArrayList;

class MyStack<T>{
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
