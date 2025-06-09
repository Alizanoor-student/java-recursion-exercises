public class oops {
    public static void main(String[] args) {
        /*//store 5 roll numbers
        int[] numbers = new int[5];
        //store 5 names
        String[] name = new String[5];
        //data of 5 students:{roll no,name,marks}
        int[] rno = new int[5];
        String[] str = new String[5];
        float[] marks = new float[5];
        Student[] students = new Student[5];*/
        //just declaring
        //Student kunal;
        //we are printing default vales of objects
        Student kunal= new Student();
       /* kunal.rno=13;
        kunal.name="kunal.khuswaya";
        kunal.marks=88.8f;*/
        //making a constructor
       // kunal.greetings() ;
       // System.out.println(kunal.rno);
       // System.out.println(kunal.name);
       // System.out.println(kunal.marks);
        Student random2= new Student();
        System.out.println(random2.name);
        Student one= new Student();
        Student two= one;
        one.name="Something something";
        System.out.println(two.name);

    }
}
     //Create a class
     //Constructor must be inside the class
    class Student {
         int rno;
         String name;
         float marks;

         //Adding function greeting in a class
         /*void greetings() {
             System.out.println("Hello! My name is " + this.name);*/
             Student(int rno, String name, float marks){
                 this.rno = rno;
                 this.name = name;
                 this.marks = marks;
             }
         //this is how you call a constructor from another constructor
         //internally:new Student();
         Student(){
             this(13,"default person",100.0f);
             }
         }









