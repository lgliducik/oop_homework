package LinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList myList = new MyLinkedList();
        myList.add(1);
        myList.add(2);
        for (Object list1 : myList) {
            System.out.println(list1);
        }
    }
}
