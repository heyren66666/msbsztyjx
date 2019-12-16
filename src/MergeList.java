public class MergeList {
    public static LNode ConstructList(int start){
        int i=start;
        LNode head=new LNode();
        head.next=null;
        LNode tmp=null;
        LNode cur=head;
        for (;i<7;i+=2){
            tmp=new LNode();
            tmp.data=i;
            tmp.next=null;
            cur.next=tmp;
            cur=tmp;
        }
        return head;
    }

    public static void PrintList(LNode head){
        for (LNode cur=head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data+"");
        }
    }

    public static LNode Merge(LNode head1,LNode head2){
        if (head1==null||head1.next==null)
            return head1;
        if (head2==null||head2.next==null)
            return head2;
        LNode cur1=head1.next;
        LNode cur2=head2.next;
        LNode head=null;
        LNode cur=null;
        if (cur1.data>cur2.data){
            head=head2;
            cur=cur2;
            cur2=cur2.next;
        }
        else {
            head=head1;
            cur=cur1;
            cur1=cur1.next;
        }
        while (cur1!=null&&cur2!=null){
            if (cur1.data<cur2.data){
                cur.next=cur1;
                cur=cur1;
                cur1=cur.next;
            }
            else {
                cur.next=cur2;
                cur=cur2;
                cur2=cur2.next;
            }
        }
        if (cur1!=null){
            cur.next=cur1;
        }
        if (cur2!=null){
            cur.next=cur2;
        }
        return head;
    }

    public static void main(String[] args){
        LNode head1=ConstructList(1);
        LNode head2=ConstructList(2);
        System.out.print("head1:");
        PrintList(head1);
        System.out.print("\nhead2:");
        PrintList(head2);
        System.out.print("\n合并后的链表：");
        LNode head=Merge(head1,head2);
        PrintList(head);
    }
}
