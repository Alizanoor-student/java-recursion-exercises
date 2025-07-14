class Shape {
    public void area() {
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of triangle: "+(0.5*l*h));
    }
}
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println("Area of triangle: " + (0.5 * l * h));
    }
}
public class inheritance {
    public static void main(String[] args) {
    Triangle t1 = new Triangle();
    t1.area();
    t1.area(10,5);
    }
}
