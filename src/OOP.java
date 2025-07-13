/*class Pen{
    String color;
    String type;//ball point or gel
    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }*/
    class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //Non Parameterized Constructor
    Student() {
        System.out.println("Contructor called");
    }
   //Parameterized constructor
   Student(String name, int age){
      this.name=name;
      this.age=age;
   }
   //Copy Constructor
   Student(Student s2){
       this.name=s2.name;
       this.age=s2.age;
   }
}
public class OOP {
    public static void main(String[] args) {
    /*Pen pen1= new Pen();
    pen1.color="blue";
    pen1.type="gel";
    pen1.write();
    Pen pen2 = new Pen();
    pen2.color="black";
    pen2.type="ballpoint";
    pen1.printColor();
    pen2.printColor();*/
        Student s1 = new Student();
        s1.name = "Aliza";
        s1.age = 21;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}





