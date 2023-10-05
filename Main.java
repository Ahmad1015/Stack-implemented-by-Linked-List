public class Main{
    public static void main(String[] args){
        List stack = new StackLL();
        stack.push(5);
        stack.push(15);
        stack.push(25);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
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
abstract class List{
    abstract boolean push(int element);
    abstract Node pop();
    abstract boolean isEmpty();
    public String toString(){return "";};
}
class StackLL extends List{      // For Constant time , we will add and remove from the start of the linked list
    Node top;
    int size;

    public StackLL(){
        this.top = null;
    }
    public StackLL(int size){
        this.top = null;
        this.size = size; 
    }
    
    public boolean push(int element){
        try{
            Node newNode = new Node(element);
            newNode.next = top;
            top = newNode;
            size++;
            return true;
        }
        catch(OutOfMemoryError e){
            System.out.println("Cannot Push - Memory Full ");
            return false;
        }
    }
    public Node pop(){
        if(top!=null){
        Node temp = top;
        top = top.next;
        size--;
        return temp;
        }
        else{
            return null;
        }
    }

    public boolean isEmpty(){
        return (top == null);
    }

    @Override
    public String toString(){
        Node curr = top;
        String str = "";
        while(curr!=null){
            str = str+ curr.data+"-> ";
            curr = curr.next;
        }
        str+="null";
        return str;
    }


}