import com.sun.scenario.effect.Merge;

/*public class ExpandLinkedList {
    private class Node{
        int data;
        Node right,down;
        Node(int data){
            this.data=data;
            this.right=null;
            this.down=null;
        }
    }
    private Node head;
    private Node merge(Node a,Node b){
        if (a==null)
            return b;
        if (b==null)
            return a;
        Node result;
        if (a.data<b.data){
            result=a;
            result.down=merge(a.down,b);
        }
        else {
            result=b;
            result.down=merge(a,b.down);
        }
        return result;
    }
    public Node flatten(Node root){
        if (root==null||root.right==null)
            return root;
        root.right=flatten(root.right);
        root=merge(root,root.right);
        return root;
    }

    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"");
            temp=temp.down;
        }
        System.out.println();
    }
    public static void main(String args[]){
        MergeList L=new MergeList();
        L.head=L.insert(L.head,31);
    }
}*/
