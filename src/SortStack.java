import java.util.Stack;

public class SortStack {
    private static void move_botton_to_top(Stack<Integer> s){
        if (s.empty())
            return;
        int top1=s.peek();
        s.pop();
        if (!s.empty()){
            move_botton_to_top(s);
            int top2=s.peek();
            if (top1>top2){
                s.pop();
                s.push(top1);
                s.push(top2);
                return;
            }
        }
        s.push(top1);
    }

    public static void sort_stack(Stack<Integer> s){
        if (s.empty())
            return;
        move_botton_to_top(s);
        int top=s.peek();
        s.pop();
        sort_stack(s);
        System.out.print("排序后出栈顺序为：");
        while (!s.empty()){
            System.out.print(s.peek()+"");
            s.pop();
        }
    }
}
