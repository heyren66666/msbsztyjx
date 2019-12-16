public class Cross {
    public static LNode IsIntersect(LNode head1,LNode head2){
        if (head1==null||head1.next==null||head2==null||head2.next==null||head1==head2)
            return null;
        LNode temp1=head1.next;
        LNode temp2=head2.next;
        int n1=0,n2=0;
        while (temp1.next!=null){
            temp1=temp1.next;
            ++n1;
        }
        while (temp2.next!=null){
            temp2=temp2.next;
            ++n2;
        }
        if (temp1==temp2){
            if (n1>n2)
                while (n1-n2>0){
                head1=head1.next;
                --n1;
                }
            if (n2>n1)
                while (n2-n1>0){
                    head2=head2.next;
                    --n2;
                }
            while (head1!=head2){
                    head1=head1.next;
                    head2=head2.next;
            }
            return head1;
        }
        else
            return null;
    }

    public static void main(String[] args){
        int i=1;
        LNode head1=new LNode();
        head1.next=null;
        LNode head2=new LNode();
        head2.next=null;
        LNode tmp=null;
        LNode cur=head1;
        LNode p=null;
        for (;i<8;i++){
            tmp=new LNode();
            tmp.data=i;
            tmp.next=null;
            cur.next=tmp;
            cur=tmp;
            if (i==5)
                p=tmp;
        }
        cur=head2;
        for (i=1;i<5;i++){
            tmp=new LNode();
            tmp.data=i;
            tmp.next=null;
            cur.next=tmp;
            cur=tmp;
        }
        cur.next=p;
        LNode interNode=IsIntersect(head1,head2);
        if (interNode==null){
            System.out.print("这两个链表不相交：");
        }else {
            System.out.print("这两个链表相交点位："+interNode.data);
        }
    }
}
