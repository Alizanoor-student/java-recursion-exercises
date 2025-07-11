class Pen {
    String color;
    String type;// ball point or a gel

    public void write() {
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+ age);
    }

    //Constructor Non parameterized
    Student(){
        System.out.println("Constructor called");
    }
    //Prameterized constructOR
   /* Student(String name,int age){
        this.name=name;
        this.age=age;
    }*/
    //Copy constructor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }

}

public class oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aliza";
        s1.age = 21;
        s1.printInfo(s1.name, s1.age);

    }
}
