package assignmentMidterm02;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Duc Ta PLUS
 */
public class MidtermExam02B6_4 {

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

        Stack<String> stackA = new Stack();
        while (!listA.isEmpty()) {
            stackA.push(listA.remove());
        }

        while (!listB.isEmpty()) {
            if (stackA.pop().compareTo(listB.remove()) != 0) {
                System.out.println("listA is NOT the reverse of listB");
                return;
            }
        }
        System.out.println("listA is the reverse of listB");
    }
}
