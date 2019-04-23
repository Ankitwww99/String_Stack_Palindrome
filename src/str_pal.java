import java.util.*;

class Node{
    private String data;
    private Node next;

    public Node() {
        data=null;
        next=null;
    }       // default constructor
    public Node(String data,Node next) {
        this.data=data;
        this.next=next;
    }   // paramerteised constructer

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
} //node class end

class MyStack{
    Node top;
    String temp="";
    public MyStack(){
        top=null;
    }
    public boolean isEmpty(){
        if(top==null)
            return true;
        else
            return false;
    }
    public void push(String val){
        Node n=new Node();
        n.setData(val);
        temp=temp.concat(val);
        n.setNext(top);
        top=n;
    }
    public String pop(){
        String result;
        if(isEmpty()) {
            System.out.println("Stack empty");
            return null;
        }
        else{
            result=top.getData();
            top=top.getNext();
            return result;
        }

    }
    public void display(){
        Node temp=top;
        if(isEmpty()){
            System.out.println("stack empty");
            return;
        }
        else{
            while(temp!=null){
                System.out.println(temp.getData()+" "+temp.getNext());
                temp=temp.getNext();
            }
        }
    }
    public int count(){
        int c=0;
        Node temp=top;
        while(temp!=null){
            c++;
            temp=temp.getNext();
        }
        return c;
    }
    public boolean pal(){
        Node tp=top;
        String cp =tp.getData();
        tp=tp.getNext();
        while(tp!=null){
            cp=cp+tp.getData();
            tp=tp.getNext();
        }
        for(int i=0;i<(cp.length()/2);i++){
            if(cp.charAt(i)!=cp.charAt(cp.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}
class rummer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack obj=new MyStack();
        obj.push("ankit");
        obj.push("nitin");
        obj.push("tikna");
        boolean re=obj.pal();
        System.out.println(re);

    }
}