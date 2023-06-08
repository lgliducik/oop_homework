package LinkedList;

public class MyNode {
    int data;
    MyNode next = null;
    @Override
    public String toString() {
        return "MyNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
    MyNode(int d) { data = d; }
}
