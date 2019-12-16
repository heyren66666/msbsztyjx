public class DeleteNode {
    public static void printList(LNode head){
        for (LNode cur=head.next;cur!=null;cur=cur.next)
        {
            System.out.print(cur.data+"");
        }
    }

    public static boolean RemoveNode(LNode p){
        if (p==null||p.next==null)
            return false;
        p.data=p.next.data;
        LNode tmp=p.next;
        p.next=tmp.next;
        return true;
    }

    public static void main(String[] args){
        int i=1;
        LNode head=new LNode();
        head.next=null;
        LNode tmp=null;
        LNode cur=head;
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
        System.out.print("删除结点："+p.data+"前链表：");
        printList(head);
        boolean result=RemoveNode(p);
        if (result){
            System.out.print("\n删除该结点后链表：");
            printList(head);
        }
    }
}
