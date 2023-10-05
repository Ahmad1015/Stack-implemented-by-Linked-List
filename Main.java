public class Main{
    public static void main(String[] args){

    }
}
class Node{
    int data;
    Node next;
    public Node(){
        this.data=0;
        this.next = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class StackLL{
    Node top;
    int size;

    public StackLL(){
        this.top = null;

    }
    public StackLL(int size){
        this.top = null;
        this.size = size; 
    }
    

}