package assignmentMidterm02;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

import java.util.Collections;
import java.util.LinkedList;

public class MidtermExam02B4 {

    public static void main(String args[]) {
        LinkedList li = new LinkedList();

        for (int i = 3; i <= 8; i++) {
            li.add(i);
        }
        li.remove(li.get(2));
        li.set(4,li.peekLast());
        li.add(li.size()+1);                   System.out.println(li);
        li.addFirst(li.get(li.size()-2));      System.out.println(li);
        Collections.sort(li);                  System.out.println(li);
        li.add(li.indexOf(3));                 System.out.println(li);
        li.addFirst(li.peekFirst());           System.out.println(li);

    }
}
/* OUTPUT 
[3, 4, 6, 7, 8, 6]
[8, 3, 4, 6, 7, 8, 6]
[3, 4, 6, 6, 7, 8, 8]
[3, 4, 6, 6, 7, 8, 8, 0]
[3, 3, 4, 6, 6, 7, 8, 8, 0]
*/