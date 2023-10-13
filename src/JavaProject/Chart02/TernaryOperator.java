package JavaProject.Chart02;

public class TernaryOperator {
    public static void main(String[] args) {
         int a = 3; int b = 5;

        System.out.println("두 수의 차는:"+((a>b)?(a-b):(b-a)));

        if(a>b)System.out.println("두 수의 차는:"+(a-b));
        else System.out.println("두 수의 차는:"+(b-a));



    }
}
