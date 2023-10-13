package JavaProject.Chart02;

public class LogicOp1 {
    public static void main(String[] args) {
        //|| (OR)연산자는 앞이 true면 뒤의 연산은 하지 않는다.
        System.out.println(true || true);   //true
        System.out.println(true || false);  //true
        System.out.println(true || (5<3));  //true
        System.out.println((5<=5)|| (7>2)); //true
        System.out.println((5<=5)||(7<2));  //true

        int value3 = 3;
        System.out.println(true || ++value3>6);
        System.out.println("value3:" + value3);     //3

        int value4 = 3;
        System.out.println(false || ++value4>6);
        System.out.println("value4: " + value4);    //4

        System.out.println(false || ++value4<6);    //5
        System.out.println(value4);

        //결론 -> && 앞이 flase면 계산 안함, || 앞이 true면 계산안함.
        //-> 나머지는 다 계산함.





    }
}
