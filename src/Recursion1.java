public class Recursion1 {
    //  Print numbers from 1 to 5
    /*public static void printNum(int n) {
        if (n == 6) {// Base condition
            return;
        }

        System.out.println(n);//print current number
        printNum(n + 1); // recursive call
    }
    public static void main(String[] args) {
        int n=1;
        printNum(n);//n=1
    }*/
    //Print sum of first n natural numbers
    /*public static void printSum(int i, int n, int sum) {
        if (i == n) { //base condition
            sum += i; // add last number
            System.out.println("sum=" + sum);
            return;
        }
        sum += i; // add current number
        printSum(i + 1, n, sum); //recursive call with next number

    }

    public static void main(String args[]) {
        int n = 5;
        printSum(1, n, 0);
    }*/
    //Factorial using recursion
   /* public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {//base condition
            return 1;
        }
        int fact_nm1 = calculateFactorial(n - 1);//recursive call
        int fact = n * fact_nm1;// multiply n with (n-1)!
        return fact;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = calculateFactorial(n);
        System.out.println("Factorial of " + n + " = " + result);
    }*/
    //Print the fibonacci sequence till nth term
    public static void printFib(int a, int b, int n){
         if(n==0){
             return;
         }
        int c=a+b;
        System.out.println(c);
        printFib(b, c, n-1);

    }

    public static void main(String[] args) {
        int a = 0, b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printFib(a, b, n-2);

    }
}

