/*


public class AddLinkedList {
    public static LNode add(LNode h1,LNode h2){
        if (h1==null||h1.next==null)
            return h2;
        if (h2==null||h2.next==null)
            return h1;
        int c=0;
        int sum=0;

        LNode p1=h1.next;
        LNode p2=h2.next;
        LNode tmp=null;
        LNode resultHead=new LNode();
        resultHead.next=null;
        while (p1!=null&&p2!=null){
            tmp=new LNode();
            tmp.next=null;
            sum=p1.data+p2.data+c;
            tmp.data=sum%10;
            c=sum/10;
            p.next=tmp;
            p=tmp;
            p1=p1.next;
            p2=p2.next;
        }
        if (p1==null){
            while (p2!=null){
                tmp=new LNode();
                tmp.next=null;
                sum=p2.data+c;
                tmp.data=sum%10;
                c=sum/10;
                p.next=tmp;
                p=tmp;
                p2=p2.next;
            }
        }

        if (p2==null){
            while (p1!=null){
                tmp=new LNode();
                tmp.next=null;
                sum=p1.data+c;
                tmp.data=sum%10;
                c=sum/10;
                p.next=tmp;
                p=tmp;
                p1=p1.next;
            }

        }
        return resultHead;
    }
    public static void main(String[] args){
        int i=1;
        LNode head1=new LNode();
        head1.next=null;
        LNode head2=new LNode();
        head2.next=null;
        LNode tmp=null;
        LNode cur=head1;
        LNode addResult=null;
        for (;i<7;i++){
            tmp=new LNode();
            tmp.data=i+2;
            tmp.next=null;
            cur.next=tmp;
            cur=tmp;
        }
        System.out.print("Head1:");
        for (cur=head1.next;cur!=null;cur=cur.next)
            System.out.print(cur.data+"");
        System.out.print("\nHead2:");
        for (cur=head2.next;cur!=null;cur=cur.next)
            System.out.print(cur.data+"");
        addResult=add(head1,head2);
        System.out.print("\n相加后:");
        for (cur=addResult.next;cur!=null;cur=cur.next)
            System.out.print(cur.data+"");
    }
}
*/
