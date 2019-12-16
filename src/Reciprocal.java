import java.awt.*;

public class Reciprocal {

    public static LNode ConstructList(){
        int i=1;
        LNode head=new LNode();
        head.next=null;
        LNode tmp=null;
        LNode cur=head;
        for (;i<8;i++){
            tmp=new LNode();
            tmp.data=i;
            tmp.next=null;
            cur.next=tmp;
            cur=tmp;
        }
        return head;
    }

    public static void PrintList(LNode head){
        for (LNode cur=head.next;cur!=null;cur=cur.next)
            System.out.print(cur.data+"");
    }

    public static LNode FindLastK(LNode head,int k){
        if (head==null||head.next==null)
            return head;
        LNode slow,fast;
        slow=fast=head.next;
        int i;
        for (i=0;i<k&&fast!=null;++i){
            fast=fast.next;
        }
        if (i<k)
            return null;
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }

    public static void main(String[] args){
        LNode head=ConstructList();
        LNode result=null;
        System.out.print("链表：");
        PrintList(head);
        result=FindLastK(head,3);
        if (result!=null)
            System.out.print("\n链表倒数第三个元素为："+result.data);
    }
}
