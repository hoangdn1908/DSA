package Week5;

public class Exercise6 {
    /**
     * Constructor for objects of class Exercise02
     */
    public Exercise6() {
    }

    public static void printList(String [] a) {
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]+" | ");
        }
        System.out.println(" ");
    }

    /**
     * This method sorts the list of strings based on the value of character #d (column d)
     * where d = 0 is the leftmost character and d = M-1 is the rightmost character.
     * the method must be a stable sorting algorithm.
     * For example, if input array a = ["apple","grape","melon","Mango","Olive","Onion","peach"].
     * The result of columSort(a,0) will be:
     *      a = ["Mango","Olive","Onion","apple","grape","melon","peach"]
     * The result of columSort(a,1) will be:
     *      a = ["Mango","melon","peach","Olive","Onion","apple","grape"]
     * or the result of columSort(a,4) will be
     *      a = ["apple","grape","Olive","peach","melon","Onion","Mango"]
     * Counting sort algorithm is used as a stable sort method (with max=255 because the range of elements
     * in counting sort is 0..255).
     *
     * @author (nxthang)
     * @version (1.0)
     */
    public static void columSort(String[] a, int d) {
        int n = a.length;
        int[] count = new int[256];
        String[] output = new String[n];
        // QUESTION 8
        // Write java code to complete this method
        for(String word : a)
        {
            count[word.charAt(d)]++;
        }
        for(int i = 1; i < count.length; i++)
        {
            count[i] += count[i - 1];
        }
        for(int i = n - 1; i >= 0; i--)
        {
            int c = a[i].charAt(d);
            int index = count[c] - 1;
            output[index] = a[i];
            count[c]--;
        }
        System.arraycopy(output, 0, a, 0, n);
        // End of QUESTION 8
    }

    public static void sortStringList(String[] a, int m) {
        // QUESTION 9
        // Write java code to complete this method
        for(int i = m - 1; i >= 0; i--)
        {
            columSort(a, i);
        }
        // End of QUESTION 9
    }

    public static void main(String[]args) {
        int m = 5;
        String[] a = new String[] {"apple","grape","melon","Mango","Olive","Onion","peach"};

//        System.out.println("The list of strings is: ");
//        printList(a);
//        sortStringList(a, m);
//        System.out.println("The list of sorted strings is: ");
//        printList(a);

        a = new String[] {"apple","grape","melon","Mango","Olive","Onion","peach"};
        System.out.println("columnSort(a,4):");
        columSort(a,2);
        printList(a);

    }
}

