

public class Reverse {
/*    //方法1：就地逆序
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
    }*/


/*    //方法2：递归
    private static LNode RecursiveReverse(LNode head){
        if (head==null||head.next==null)
            return head;
        else {
            LNode newhead=RecursiveReverse(head.next);
            head.next.next=head;
            head.next=null;
            return newhead;
        }
    }

    public static void Reverse(LNode head){
        if (head==null)
            return;
        LNode firstNode=head.next;
        LNode newhead=RecursiveReverse(firstNode);
        head.next=newhead;
    }*/

    //方法3：插入法
    public static void Reverse(LNode head){
        if (head==null||head.next==null)
            return;
        LNode cur=null;
        LNode next=null;
        cur=head.next.next;
        head.next.next=null;
        while (cur!=null){
            next=cur.next;
            cur.next=head.next;
            head.next=cur;
            cur=next;
        }
    }

}
