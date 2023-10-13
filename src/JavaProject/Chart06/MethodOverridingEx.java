package JavaProject.Chart06;

class Shape{            //슈퍼클래스
    public Shape next;
    public Shape(){next = null;}

    public void draw(){
        System.out.println("Shape");
    }
}
class Line extends Shape{
    @Override
    public void draw(){       //메소드 오버라이딩
        System.out.println("Line");
    }
}
class Rect extends Shape{
    @Override
    public void draw(){                     //메소드 오버라이딩
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {                                  //메소드 오버라이딩
        System.out.println("Circle");
    }
}
public class MethodOverridingEx {
    static void paint(Shape p){
        p.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();

        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
    }
}
