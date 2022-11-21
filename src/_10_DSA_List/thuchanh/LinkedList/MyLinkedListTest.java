package _10_DSA_List.thuchanh.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 93);
        ll.printList();
    }
}
