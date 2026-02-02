package Week2_3;

public class FasterPow {
    /**
     * Constructor for objects of class SimplePow
     */
    public FasterPow() {
    }

    // Method RecPow() evaluate x^n using a recursive implementation
    public static double RecPow(double x, int n) {
        if(n == 0) return 1;
        return  x * RecPow(x ,n-1);
    }


    public static double PowLoop(double x, int n)
    {
        double pow = 1;
        while(n > 0)
        {
            pow *= x;
            n--;
        }
        return pow;
    }

    public static int recursion(int x)
    {
        if(x == 10) return 10;
        return recursion(x+1);
    }


    public static void main(String[]args) {
//        int n;
//        double x;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the value of x:");
//        x=scanner.nextDouble();
//
//        System.out.println("Please enter the degree n:");
//        n=scanner.nextInt();
//
//        System.out.println("The value of (" + x + ")^" + n + " is: " + RecPow(x,n));
//        System.out.println(PowLoop(x,n));
         System.out.println(recursion(1));
    }
}
