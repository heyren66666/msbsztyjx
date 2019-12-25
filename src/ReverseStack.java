import java.util.Stack;

public class ReverseStack {
    private static void move_bottom_to_top(Stack<Integer> s){
        if (s.empty())
            return;
        int top1=s.peek();
        s.pop();
        if (!s.empty()){
            move_bottom_to_top(s);
            int top2=s.peek();
            s.pop();
            s.push(top1);
            s.push(top2);
        }
        else {
            s.push(top1);
        }
    }
    public static void reverse_stack(Stack<Integer> s){
        if (s.empty())
            return;
        move_bottom_to_top(s);
        int top=s.peek();
        s.pop();
        reverse_stack(s);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        reverse_stack(s);
        System.out.println("翻转后出栈顺序为：");
        while (!s.empty()){
            System.out.println(s.peek()+"");
            s.pop();
        }
    }
}
