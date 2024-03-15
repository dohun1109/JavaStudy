package JavaBasic.BigIntegerEx;

import java.math.BigInteger; //Biginteger 를 사용하려면 math 클래스를 import 해야된다.

public class Main {
    public static void main(String[] args) {

        // 문자열로 생성
        BigInteger bigNumber = new BigInteger("10000");

        //숫자로 생성
        BigInteger bigInteger = BigInteger.valueOf(8871);

        // n 진수로 생성
        BigInteger bigInteger1 = new BigInteger("FFFF", 16); //16진수
        BigInteger bigInteger2 = new BigInteger("1011", 2); // 2진수


        System.out.println("bigNumber = " + bigNumber);
        System.out.println("bigInteger = " + bigInteger);
        System.out.println("bigInteger1 = " + bigInteger1);
        System.out.println("bigInteger2 = " + bigInteger2);

        //int / long -> BigInteger
        int num = 100000;
        BigInteger bigNumber2 = BigInteger.valueOf(num);


        //BigInteger -> int
        int int_bigNum = bigNumber.intValue();

        //BigInteger -> long
        long long_bigNum = bigNumber.longValue();

        //BigInteger -> float
        float float_bigNum = bigNumber.floatValue();

        //BigInteger -> double
        double double_bigNum = bigNumber.doubleValue();

        //BigInteger -? String
        String String_bigNum = bigNumber.toString();


        BigInteger bt1 = new BigInteger("10000");
        BigInteger bt2 = new BigInteger("20000");

        System.out.println("덧셈 : " + bt1.add(bt2));

        System.out.println("뺄셈 : " + bt2.subtract(bt1));

        System.out.println("곱셈 : " + bt1.multiply(bt2));

        System.out.println("나눗셈 : " + bt2.divide(bt1));


        System.out.println(" 나머지 : " + bt2.remainder(bt1));


        // 두 수 비교 compareTo 맞으면 0 / 틀리면 -1
        int compare = bt1.compareTo(bt2);
        System.out.println(compare);


        System.out.println(bt2.divide( BigInteger.TWO));


        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

        str2 = str2.intern();
        System.out.println(str1 == str2);
        

    }




}
