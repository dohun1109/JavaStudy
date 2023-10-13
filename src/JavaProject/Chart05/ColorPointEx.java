package JavaProject.Chart05;

import java.awt.*;

class Point {
    private int x, y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point {
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}
public class ColorPointEx{
    public ColorPointEx(int i, int i1, String blue) {
    }

    public static void main(String[] args) {
        Point p = new Point();   //Point 객체 생성
        p.set(1,2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}
