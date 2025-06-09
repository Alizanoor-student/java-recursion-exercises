import java.util.Scanner;
public class StudentGradeCalculator {
    //Method to calculate grade based on average marks
    public static String CalculateGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";// if marks are below 60
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//create scanner object
        //input Student name and marks
        System.out.println("Enter Student name: ");
        String name = sc.nextLine();//read full name including spaces
        System.out.println("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();//read integer marks
        System.out.println("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();
        System.out.println("Enter marks for Subject3: ");
        int s3 = sc.nextInt();
        //Calculations
        int total = s1 + s2 + s3;//total marks
        double average = total / 3.0;
        String grade = CalculateGrade(average);//call method to get grade
        //output the results
        System.out.println("---Result---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f\n" , average);//print average with two decimal places
        System.out.println("Grade: " + grade);
        sc.close();//close the scanner to avoid memory leaks
    }
}
