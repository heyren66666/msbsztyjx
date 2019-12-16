public class GroupFlip {
    public static LNode Reverse(LNode head){
        if (head==null||head.next==null)
            return head;
        LNode pre=head;
        LNode cur=head.next;
        LNode next=cur.next;
        pre.next=null;

        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=cur.next;
            cur=next;
        }
        return pre;
    }

    public static void ReverseK(LNode head,int k){
        if (head==null||head.next==null||k<2)
            return;
        int i=1;
        LNode pre=head;
        LNode begin=head.next;
        LNode end=null;
        LNode pNext=null;
        while (begin!=null){
            end=begin;
            for (;i<k;i++){
                if (end.next!=null)
                    end=end.next;
                else
                    return;
            }
            pNext=end.next;
            end.next=null;
            pre.next=Reverse(begin);
            begin.next=pNext;
            pre=begin;
            begin=pNext;
            i=1;
        }
    }
    public static void main(String[] args){
        int i=1;
        LNode head=new LNode();
        LNode tmp=null;
        LNode cur=head;
        for (;i<8;i++){
            tmp=new LNode();
            tmp.data=i;
            tmp.next=null;
            cur.next=tmp;
            cur=tmp;
        }
        System.out.println("顺序输出：");
        for (cur=head.next;cur!=null;cur=cur.next)
            System.out.print(cur.data+"");
        ReverseK(head,3);
        System.out.print("\n逆序输出：");
        for (cur=head.next;cur!=null;cur=cur.next)
            System.out.print(cur.data+"");
        for (cur=head.next;cur!=null;)
            cur=cur.next;
    }
}
