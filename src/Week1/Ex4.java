package Week1;

import java.util.Scanner;

public class Ex4 {
    /**
     * Constructor for objects of class Exercise04
     */
    public Ex4() {

    }

    // Find out the position of a name in the list
    public static int NameSearching(String[] list, String s) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equalsIgnoreCase(s)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n;
        String[] names;
        String search_name;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names in the name list?");
        n = scanner.nextInt();

        //Remove newline character after calling nextInt()
        String tmp = scanner.nextLine();

        names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Please enter names[" + i + "]:");
            names[i] = scanner.nextLine();
        }

        System.out.println("The list of names is:");
        for (int i = 0; i < names.length; i++)
            System.out.println(names[i]);

        System.out.println("Please enter a name for searching:");
        search_name = scanner.nextLine();
        if (NameSearching(names, search_name) == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("The searching result is: " + search_name + " at the index: " + NameSearching(names, search_name));
        }
    }
}
