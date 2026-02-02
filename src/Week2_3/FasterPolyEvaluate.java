package Week2_3;

import java.util.Scanner;

public class FasterPolyEvaluate {
    /**
     * Constructor for objects of class FasterPolyEvaluate
     */
    public FasterPolyEvaluate() {
    }

    public static void print_poly(double [] c) {
        System.out.println("The polynomial is:");
        for (int i=c.length-1; i>0; i--) {
            if (i != 1)
                System.out.print(c[i] + "*x^" + i + " + ");
            else
                System.out.print(c[i] + "*x" + " + ");
        }
        System.out.println(c[0]);
    }

    // This method evaluate the value of a polynomial
    // Quest 5
    public static double evaluatePoly(double[] c, double x) {
        double s = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            s = s * x + c[i];
        }
        return s;
    }

    // This recursive method evaluate the value of a polynomial
    // Quest 6
    public static double recEvaluatePoly(double [] c, double x, int index) {
    if(index == c.length - 1) return c[index];
    return c[index] + x * recEvaluatePoly(c, x, index + 1);
    }

    public static void main(String[] args)
    {
        int n;
        double [] c;
        double x;

        System.out.println("Please enter the degree n of the polynomial:");
        Scanner scanner = new Scanner(System.in);
        n=scanner.nextInt();

        c=new double[n+1];

        for (int i=0; i<c.length; i++)
        {
            System.out.println("Please enter the coefficient c["+i+"]:");
            c[i]=scanner.nextDouble();
        }
        print_poly(c);

        System.out.println("Please enter the value of x:");
        x=scanner.nextDouble();

        System.out.println("The value P(" + x + ") = " + evaluatePoly(c,x));
        System.out.println("Using a recursive method, the value P(" + x + ") = " + recEvaluatePoly(c,x,0));
    }
}
