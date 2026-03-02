package Week5;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Exercise4 {
    /**
     * Constructor for objects of class Exercise02
     */
    public Exercise4() {
    }

    public static void printStudentList(String[] names, int[] marks) {
        int n = marks.length;
        System.out.println();
        System.out.println("The list of " + n +" students is");
        for (int i=0; i<n; i++)
            System.out.println("Name: "+names[i]+"  Mark: "+ marks[i]);
        System.out.println();
    }

    /**
     * This method uses Counting Sort to sort the list of n students by their marks
     * The list is sorted in descending order
     */
    public static void sortStudentByMark(String[] names, int[] marks) {

        int n = marks.length;
        int[] count = new int[11];
        String[] output_names = new String[n];
        int[] output_marks = new int[n];
        // QUESTION 4
        // Write java code to: Initialize count array with all zeros;
//       for(int i = 0; i < count.length; i++)
//       {
//           count[i] = 0;
//       }
        // Store the count of each element;
        for(int mark : marks)
        {
            count[mark]++;
        }
        // Calculate the cumulative count of each array
        for(int i = 9; i >= 0; i--)
        {
            count[i] += count[i + 1];
        }
        // End of QUESTION 4
        // QUESTION 5
        // Write java code to find the index of each element of the original array in count array,
        for(int i = n - 1; i >= 0; i--)
        {
            int mark = marks[i];
            int position = count[mark] - 1;
            // place the elements in output array;
            output_marks[position] = mark;
            output_names[position] = names[i];
            count[mark]--;
        }
        // Copy the sorted elements into original array
        for(int i = 0; i < n; i++)
        {
            marks[i] = output_marks[i];
            names[i] = output_names[i];
        }
        // End of QUESTION 5
    }

    /**
     * This method shows the first M students from the sorted list
     */
    public static void showStudents(String[] names, int[] marks, int m) {
        System.out.println("The list of " + m +" students who has the highest mark is:");
        for (int i=0; i<m; i++)
            System.out.println("Name: "+names[i]+"  Mark: "+ marks[i]);
    }

    public static void main(String[]args)
    {
        int n,m;
        int[] marks;
        String[] names;

        System.out.println("How many students in the list? ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Please input M: ");
        m = scanner.nextInt();

        //Remove newline character after calling nextInt()
        String tmp=scanner.nextLine();

        marks = new int[n];
        names = new String[n];

        for (int i=0; i<n; i++) {
            System.out.println("Please input the name and mark of student "+ (i+1) +":");
            System.out.println("Name: ");
            names[i] = scanner.nextLine();
            System.out.println("Mark: ");
            marks[i] = scanner.nextInt();
            //Remove newline character after calling nextInt()
            tmp = scanner.nextLine();
        }

        printStudentList(names,marks);
        sortStudentByMark(names,marks);
        showStudents(names,marks,m);
    }
}

