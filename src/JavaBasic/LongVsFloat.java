package JavaBasic;


import java.math.BigDecimal;

public class LongVsFloat {


    public static void main(String[] args) {
        long longType = Long.MAX_VALUE;
        float floatType = Float.MAX_VALUE;

        System.out.println("longType = " + Long.SIZE / 8 + "byte");
        System.out.println("floatType = " + Float.SIZE / 8 + "byte");


        if (longType > floatType) {          //false
            System.out.println("long type 승리");
        } else if (longType < floatType) {  //true
            System.out.println("float type 승리");
        } else
            System.out.println("같다?");

        //이러한 결과의 이유는
        // float 의 경우 부동 소수점 방식으로 인해 수를 더 많이 표현할 수 있기 때문
        BigDecimal a = new BigDecimal("1231245124.12312312312321");
        System.out.println(a.getClass().getSimpleName());
    }


    
}

