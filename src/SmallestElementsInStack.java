import java.util.Stack;

 class MyStack {
    private Stack<Integer> elemStack=new Stack<>();
    private Stack<Integer> minStack=new Stack<>();
    public void push(int data){
        elemStack.push(data);
        if (minStack.empty())
            minStack.push(data);
        else {
            if (data<minStack.peek())
                minStack.push(data);
        }
    }
    public int pop(){
        int topData=elemStack.peek();
        elemStack.pop();
        if (topData==min())
            minStack.pop();
        return topData;
    }

    public int min(){
        if (minStack.empty())
            return Integer.MAX_VALUE;
        else
            return minStack.peek();
    }

}
public class SmallestElementsInStack{
    public static void main(String[] args){
        MyStack stack=new MyStack();
        stack.push(5);
        System.out.println("栈中最小值为："+ stack.min());
        stack.push(6);
        System.out.println("栈中最小值为："+stack.min());
        stack.push(2);
        System.out.println("栈中最小值为："+stack.min());
        stack.pop();
        System.out.println("栈中最小值为："+stack.min());
    }
}


