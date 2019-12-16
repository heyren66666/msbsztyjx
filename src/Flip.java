public class Flip {
    public static void  reverse2(LNode head){
        if (head==null||head.next==null)
            return;
        LNode cur=head.next;
        LNode pre=head;
        LNode next=null;
        while (cur!=null&&cur.next!=null){
            next=cur.next.next;
            pre.next=cur.next;
            cur.next.next=cur;
            cur.next=next;
            pre=cur;
            cur=next;
        }
    }
    public static void main(String[] args){
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
        System.out.print("顺序输出：");
        for (cur=head.next;cur!=null;cur=cur.next)
            System.out.print(cur.data+"");
        reverse2(head);
        System.out.print("\n逆序输出：");
        for (cur=head.next;cur!=null;cur=cur.next)
            System.out.print(cur.data+"");
        for (cur=head.next;cur!=null;){
            cur=cur.next;
        }
    }
}
