import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //For Loop
       /* for(int counter=0; counter<5; counter++ ){
            System.out.println("Hello World");
        }
      for(int i=0; i<50; i++) {
            System.out.println(i);
        }*/
        //While Loop
        /*int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;*/
        // Do while loop
        /*int i=0;
        do{
            System.out.println(i);
            i++;}
        while (i<11);

        }*/
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i * n);
        }
    }
}
