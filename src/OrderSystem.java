import java.util.LinkedList;
import java.util.Queue;


    class User{
        private int id;
        private String name;
        private int seq;
        public User(int id,String name){
            this.id=id;
            this.name=name;
            this.seq=0;
        }
        String getName(){return name;}
        void setName(String name){this.name=name;}
        int getSeq(){return seq;}
        void setSeq(int seq){this.seq=seq;}
        int getId(){return id;}
        public boolean equals(Object arg0){
            User o=(User)arg0;
            return this.id==o.getId();
        }

        @Override
        public String toString() {
            return "id:"+id+" name:" +name+" seq:"+seq;
        }
    }
    class MyQueue1{
        private Queue<User> q=new LinkedList<User>();
        public void enQueue(User u){
            u.setSeq(q.size()+1);
            q.add(u);
        }
        public void deQueue(){
            q.poll();
            updateSeq();
        }
        void deQueue(User u){
            q.remove(u);
            updateSeq();
        }
        void updateSeq(){
            int i=1;
            for (User u:q)
                u.setSeq(i++);
        }
        void printList(){
            for (User u:q)
                System.out.println(u);
        }
    }
public class OrderSystem {
        public static void main(String[] args){
            User u1=new User(1,"user1");
            User u2=new User(2,"user2");
            User u3=new User(3,"user3");
            User u4=new User(4,"user4");
            MyQueue1 queue=new MyQueue1();
            queue.enQueue(u1);
            queue.enQueue(u2);
            queue.enQueue(u3);
            queue.enQueue(u4);
            queue.deQueue();
            queue.deQueue(u3);
            queue.printList();
        }
}
