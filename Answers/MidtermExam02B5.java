package assignmentMidterm02;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MidtermExam02B5 {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        int prev = q.peek();
        int next;
        boolean ascending = true;
        boolean descending = true;

        for (Iterator<Integer> it = q.iterator(); it.hasNext();) {
            next = it.next();
            if (prev > next) {
                ascending = false;
            } else if (prev < next) {
                descending = false;
            }
            prev = next;
        }

        if (!ascending && !descending) {
            System.out.println("Not Sorted");
        } else if (ascending) {
            System.out.println("Sorted in Ascending Order");
        } else if (descending) {
            System.out.println("Sorted in Descending Order");
        }
    }
}
