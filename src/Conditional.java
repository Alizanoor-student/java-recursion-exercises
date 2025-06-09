import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button= sc.nextInt();
       /* if(button==1){
            System.out.println("Namaste");
        }
       else if(button==2){
            System.out.println("Hello");
        }
       else if(button==3){
            System.out.println("Bonjour");
        }
       else{
            System.out.println("Invalid output");
        }*/
        switch(button) {
            case 1 -> System.out.println("Namaste");
            case 2 -> System.out.println("Hello");
            case 3 -> System.out.println("Bonjour");
            default -> System.out.println("Invalid output");
        }
//        switch(button) {
//            case 1:
//                System.out.println("Namaste");
//                break;
//            case 2:
//                System.out.println("Hello");
//                break;
//
//            case 3:
//                System.out.println("Bonjour");
//            default:
//                System.out.println("Invalid output");
//        }
    }
}
