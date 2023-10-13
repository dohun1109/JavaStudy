package JavaProject.Chart04;

import java.util.Scanner;

class Rectangle{
    int width ;         //member variable   - 클래스 전체
    int height ;
    Rectangle(){

    }
    public Rectangle(int width, int height){      // w -> local variable - 생성자 내에서만
        this.width = width;
        this.height = height;                   //this : 클래스 자체를 지정.
    }
    public int getArea() {
        return width* height;
    }
}
//파일명의 클래스는 접근지정자가 반드시 public
//하나의 자바 파일에 클래스가 여러개가 있을 수 있지만 public 접근지정자는 단 한개만 있어야 한다.

public class RacApp {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner scan = new Scanner(System.in);
        System.out.println(">>");
        rect.width = scan.nextInt();
        rect.height = scan.nextInt();
        System.out.println("사각형의 면적은 :" + rect.getArea());
        scan.close();
    }

}
