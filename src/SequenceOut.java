import java.util.Stack;

public class SequenceOut {
    public static boolean isPopSerial(String push,String pop){
        if (push==null||pop==null)
            return false;
        int pushLen=push.length();
        int popLen=pop.length();
        if (pushLen!=popLen)
            return false;
        int pushIndex=0;
        int popIndex=0;
        Stack<Character> stack=new Stack<>();
        while (pushIndex<pushLen){
            stack.push(push.charAt(pushIndex));
            pushIndex++;
            while (!stack.empty()&&stack.peek()==pop.charAt(popIndex)){
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty()&&popIndex==popLen;
    }

    public static void main(String[] args){
        String push="12345";
        String pop="32541";
        if (isPopSerial(push,pop))
            System.out.println(pop+"是"+push+"的一个pop序列");
        else
            System.out.println(pop+"不是"+push+"的一个pop序列");
    }
}
