package StandardOfJava.UnClassified;

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println("정사각형 넓이" + cal.areaRectangle(5));
        System.out.println("직사각형 넓이" + cal.areaRectangle(5, 20));
        
    }
}
