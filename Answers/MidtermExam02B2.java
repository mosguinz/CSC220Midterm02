package assignmentMidterm02;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

import java.util.Deque;
import java.util.LinkedList;

public class MidtermExam02B2 {

    public static void main(String[] args) {
        Deque d = new LinkedList<>();
        d.add("H");           
        d.addFirst("O");     
        d.addLast(d.contains("P"));             System.out.println(d);
        d.offer(d.element());                   System.out.println(d);
        d.offerLast(d.remove());                System.out.println(d);
        d.offerFirst(d.remove(d.element()));    System.out.println(d);
        d.push(d.remove("E"));                  System.out.println(d);
    }
}
/* OUTPUT 
[O, H, false]
[O, H, false, O]
[H, false, O, O]
[true, false, O, O]
[false, true, false, O, O]
*/