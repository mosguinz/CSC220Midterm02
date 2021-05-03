package assignmentMidterm02;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

import java.util.LinkedList;
import java.util.Queue;

public class MidtermExam02B1 {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 3; i <= 8; i++) {
            q.add(i);                                  
        } // System.out.println(q);
        
        q.remove(q.size() - 1);    System.out.println(q); // 1 
        q.offer(q.element() + 3);  System.out.println(q); // 2
        System.out.println(q.contains(9));                // 3
        q.add(q.remove());         System.out.println(q); // 4
        q.offer(q.peek());         System.out.println(q); // 5
    }
}
/* OUTPUT 
[3, 4, 6, 7, 8]
[3, 4, 6, 7, 8, 6]
false
[4, 6, 7, 8, 6, 3]
[4, 6, 7, 8, 6, 3, 4]
*/