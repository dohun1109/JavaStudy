package StandardOfJava.UnClassified;

import java.util.Arrays;

public class GarbageObjectEx {
    public static void main(String[] args) {

        String hobby = "여행";
        hobby = "영화";   //여행에 해당하는 객체를 Garbage Object 로 만듬.

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;   //kind1 ->  reference object is not garbage.
        System.out.println("kind2 : " + kind2);

        String aaa = "hello";
        String bbb = "hello";   //같은 값을 가지면 새로운 object 가 생성되는게 아니라
        //String 의 경우 reference type variable 이기 때문에 같은 주소를 가리키게 된다.

        System.out.println(aaa.equals(bbb));    //true
        System.out.println(aaa == bbb);         //ture

        String[] arrStr = new String[3];
        arrStr[0] = "Java";
        arrStr[1] = "Java";
        arrStr[2] = new String("Java");

        System.out.println(arrStr[0] == arrStr[1]); // 그냥 String 형태의 값으로 힙메모리에 생성 후 heap memory address 를 저장 할 경우 같은 address 를 가리키지만
        System.out.println(arrStr[0] == arrStr[2]); //new 연산자를 통해 새로운 String 을(같은 값이라 할 지라도 ) 생성할 경우 다른 address 를 가진다.


        //array copy
        String[] str1 = {"aaa","bbb","ccc"};
        String[] str2 = new String[str1.length];
        String[] str3 = new String[str1.length];


        for (int i = 0; i< str1.length; i++) {
            str2[i] = str1[i];
        }
        System.out.println(Arrays.toString(str2));


        System.arraycopy(str1,0,str3,0,str1.length);
        System.out.println(Arrays.toString(str3));

        

        



        
    }
}
