package assignmentMidterm02;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class MidtermExam02B6_1 {

    public static void main(String[] args) {

        List<String> listA = new LinkedList<>();
        listA.add("a");
        listA.add("b");
        listA.add("c");
        listA.add("A");
        listA.add("B");
        listA.add("C");
        listA.add("D");
        listA.add("E");
        listA.add("F");

        List<String> listB = new LinkedList<>();
        listB.add("F");
        listB.add("E");
        listB.add("D");
        listB.add("C");
        listB.add("B");
        listB.add("A");

        Iterator<String> it = listA.iterator();
        ListIterator<String> li = listB.listIterator(listB.size());

        int gap = listA.size() - listB.size();
        int i = 0;
        while (it.hasNext()) {
            i++;
            it.next();
            if (i == gap) {
                while (it.hasNext() && li.hasPrevious()) {
                    if (it.next().compareTo(li.previous()) != 0) {
                        System.out.println("The tail of listA is NOT the reverse of listB");
                        return;
                    }
                }
            }
        }
        System.out.println("The tail of listA is the reverse of listB");
    }
}
