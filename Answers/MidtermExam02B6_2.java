package assignmentMidterm02;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

import java.util.LinkedList;

public class MidtermExam02B6_2 {

    public static void main(String[] args) {

        LinkedList<String> listA = new LinkedList<>();
        listA.add("A");
        listA.add("B");
        listA.add("C");
        listA.add("D");
        listA.add("E");
        listA.add("F");

        LinkedList<String> listB = new LinkedList<>();
        listB.add("F");
        listB.add("E");
        listB.add("D");
        listB.add("C");
        listB.add("B");
        listB.add("A");

        int size = listA.size();
        for (int i = 0; i < size; i++) {
            if (listA.removeFirst().compareTo(listB.removeLast()) != 0) {
                System.out.println("listA is NOT the reverse of listB");
                return;
            }
        }
        System.out.println("listA is the reverse of listB");
    }
}
