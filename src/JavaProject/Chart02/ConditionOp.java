package JavaProject.Chart02;

public class ConditionOp {
    public static void main(String[] args) {

        int x = 5;
        int y = 3;

        //삼항연산자
//        int s = ( x > y)? 1: -1;

        int s;
        if(x > y){
            s = 1;
        }else
            s = -1;
        System.out.println("s: "+s);
    }

}
