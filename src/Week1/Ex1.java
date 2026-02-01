package Week1;

import java.util.Scanner;

public class Ex1 {
    /**
     * Constructor for objects of class Exercise01
     */
    public Ex1() {
    }

    // Count numbers of characters in a string
    public static int CountChar(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isLetter(s.charAt(i))) count++;
        }
        return count; // This statement must be deleted when you finish implementing this method

    }

    public static void main(String[] args)
    {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a name: ");
        name=scanner.nextLine();
        System.out.println("The total characters of that name is: " + CountChar(name));
    }
}
