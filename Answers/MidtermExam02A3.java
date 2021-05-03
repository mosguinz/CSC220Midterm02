package assignmentMidterm02;

// Please see README.txt
// We will go over the answers in class.
// Thank you.

public class MidtermExam02A3 {

    public static void main(String[] args) {
         
        String x, y;
        char w;

        x = "ComputingQuantum";
        y = "ComputingClassical";

        System.out.println(y.compareTo(x));

        x = "QuantumComputing";        
        y = "QuantumKomputing";     

        System.out.println(x.compareTo(y));

        x = "ClassicalComputing";     
        y = "ClassicalComputingX";     

        System.out.println(y.compareTo(x));

        x = "ConventionalComputing";     
        y = "ConventionalComputinG";     

        System.out.println(x.compareTo(y));
        
        x = "x" + "y";
        w = 'x';
        // System.out.println(x.compareTo(w)); // Uncompilable Error        
    }
}
/* OUTPUT 
-14
-8
1
32
*/
