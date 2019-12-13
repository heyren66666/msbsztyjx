

public class Reverse {


    public static void Reverse(LNode head){
        if(head==null||head.next==null)
            return;
        LNode next=null;
        LNode pre=null;
        LNode cur=null;
        cur=head.next;
        next=cur.next;
        cur.next=null;
        pre=cur;
        cur=next;
        while (cur.next!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=cur.next;
            cur=next;
        }
        cur.next=pre;
        head.next=cur;
    }

    public static void main(String[] args){
        LNode head=new LNode();
        head.next=null;
        LNode tmp=null;
        LNode cur=head;
        for (int i=1;i<8;i++){
            tmp=new LNode();
            tmp.data=i;
            tmp.next=null;
            cur.next=tmp;
            cur=tmp;
        }
        System.out.println("逆序前：");
        for (cur=head.next;cur!=null;cur=cur.next)
            System.out.print(cur.data+"");
        System.out.println("\n逆序后：");
        Reverse(head);
        for (cur=head.next;cur!=null;cur=cur.next)
            System.out.print(cur.data+"");
    }
}
