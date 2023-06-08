package LinkedList;

import java.util.Iterator;


public class MyLinkedList<E> implements Iterable<E>{
    private MyNode head = null;
    private int counter;
    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", counter=" + counter +
                '}';
    }
    public MyLinkedList() {
        counter = 0;
    }
    public int size(){
        return counter;
    }
    public void add(int elem){
        MyNode new_node = new MyNode(elem);
        if (head == null){
            head = new_node;
            return;
        }
        MyNode current = head;
        while (true){
            if (current.next != null){
                current = current.next;
            } else {
                current.next = new_node;
                counter++;
                break;
            }
        }
    }
    @Override
    public Iterator iterator() {
        return new Iterator<Integer>() {
            private MyNode current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Integer next() {
                Integer result = current.data;
                current = current.next;
                return result;
            }
        };
    }
}
