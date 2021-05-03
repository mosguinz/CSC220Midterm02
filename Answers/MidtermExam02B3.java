package assignmentMidterm02;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

import java.util.PriorityQueue;

public class MidtermExam02B3 {

    public static void pollPq(PriorityQueue<String> pq) {
        int originalSize = pq.size();
        for (int i = 0; i < originalSize; i++) {
            System.out.print(pq.poll() + " ");
        }
    }

    public static void main(String args[]) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.offer("C");
        pq.add("O");
        pq.offer("M");
        pq.add("P");
        // pollPq(pq); return; // C M O P 

        pq.offer(String.valueOf(pq.remove(pq.peek())));
        // pollPq(pq); // M O P true

        pq.add(String.valueOf(pq.contains("X")));
        // pollPq(pq); // M O P false true

        pq.add(String.valueOf(pq.contains(pq.remove())));
        // pollPq(pq); // O P false false true 

        pq.offer(pq.remove());
        // pollPq(pq); // O P false false true

        pq.add(pq.peek());
        // pollPq(pq); // O O P false false true
    }
}
/* ANSWER 
C M O P 
M O P true
M O P false true
O P false false true 
O P false false true
O O P false false true
 */
