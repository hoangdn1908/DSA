package Week4;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    /**
     * Constructor for objects of class Exercise01
     */
    public InsertionSort() {
    }

    public static void printArray(int [] a) {
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }

    // Insertion sort algorithm to sort the array in ascending order Ques1
    public static void insertionSort(int[] a) {
        for(int i = 1; i < a.length; i++)
        {
            int key = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > key)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j + 1] = key;
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        int n;
        int[] a;

        System.out.println("Please input the integer n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        a = new int[n];
        for (int i=0; i<n; i++) {
            System.out.println("Please input the integer a["+i+"]:");
            a[i]=scanner.nextInt();
        }

        System.out.println("The input array is : ");
        printArray(a);

        insertionSort(a);

        System.out.println("The rearranged array is : ");
        printArray(a);
    }
}
