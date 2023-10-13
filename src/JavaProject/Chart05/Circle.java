package JavaProject.Chart05;

public class Circle {
    int radius;

    public Circle(){}       //-> 생성자 오버로딩
    public Circle(int radius){  //생성자
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
}
