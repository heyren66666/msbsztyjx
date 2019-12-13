public class RemoveDup {

/*    //方法1：顺序删除
    public static void removeDup(LNode head){
        if (head==null||head.next==null)
            return;
        LNode outerCur=head.next;
        LNode innerCur=null;
        LNode innerPre=null;
        for (;outerCur!=null;outerCur=outerCur.next){
            for (innerCur=outerCur.next,innerPre=outerCur;innerCur!=null;){
                if (outerCur.data==innerCur.data){
                    innerPre.next=innerCur.next;
                    innerCur=innerCur.next;
                }else {
                    innerPre=innerCur;
                    innerCur=innerCur.next;
                }
            }
        }
    }

    public static void main(String[] args){
        int i=1;
        LNode head=new LNode();
        head.next=null;
        LNode tmp=null;
        LNode cur=head;
        for (;i<7;i++){
            tmp=new LNode();
            if (i%2==0){
                tmp.data=i+1;
            }else if (i%3==0){
                tmp.data=i-2;
            }else
                tmp.data=i;
            tmp.next=null;
            cur.next=tmp;
            cur=tmp;
        }
        System.out.print("删除重复结点前：");
        for (cur=head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data+"");
        }
        removeDup(head);
        System.out.print("\n删除重复结点后：");
        for (cur=head.next;cur!=null;cur=cur.next)
            System.out.print(cur.data+"");
    }*/

    //方法2：递归删除
    private static LNode removeDupRecursion(LNode head){
        if (head.next==null)
            return head;
        LNode pointer=null;
        LNode cur=head;
        head.next=removeDupRecursion(head.next);
        pointer=head.next;
        while (pointer!=null){
            if (head.data==pointer.data){
                cur.next=pointer.next;
                pointer=cur.next;
            }else {
                pointer=pointer.next;
                cur=cur.next;
            }
        }
        return head;
    }

    public static void removeDup(LNode head){
        if (head==null)
            return;
        head.next=removeDupRecursion(head.next);
    }
}
