public class InitTest {
    public static void main(String[] args) {
        Shape shape = new Ellipse();
    }
}
class Shape {

    int size = 5;

    Shape() {
        System.out.println(size);//①
        print();//②
    }
    public void print() {
        System.out.println(size);
    }
}
class Ellipse extends Shape{
    int size = 6;
    static {
        System.out.println("I am static method.");//③
    }
    Ellipse() {
        print();//④
    }
    public void print() {
        System.out.println(size);
    }
}
/*
打印结果是：
③：I am static method.
①：5
②：0
④：6
*/