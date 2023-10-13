package JavaProject.Chart02;

public class LogicOp {

    public static void main(String[] args) {
        //&&(AND) 연산자는 앞이 false이면 뒤를 연산하지 않는다.

        System.out.println(true && true);   //true
        System.out.println(true && false);  //false
        System.out.println(true && (5 < 3)); //false
        System.out.println((5<=5)&& (7>2)); //ture

        System.out.println("----------------");
        int value1 = 3;

        System.out.println(false && ++value1 > 6);
        System.out.println(value1);

        System.out.println( ++value1 > 6&& false);
        System.out.println(value1);

        int value2  = 3;
        System.out.println(true && ++value2 > 6);
        System.out.println(value2);




    }
}
