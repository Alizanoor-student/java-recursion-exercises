interface A {
    void methodA();
}

interface B {
    void methodB();
}

//  Class implements both interfaces (multiple inheritance)
class C implements A, B {
    public void methodA() {
        System.out.println("Method A from Interface A");
    }

    public void methodB() {
        System.out.println("Method B from Interface B");
    }
}

public class multipleInheritanceDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
