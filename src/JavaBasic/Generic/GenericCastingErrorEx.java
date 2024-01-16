package JavaBasic.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Fruit1 {}
class Apple1 implements Fruit1{
}


public class GenericCastingErrorEx {
    public static void main(String[] args) {

        // 배열은 OK
        Object[] arr = new Integer[1];

        //제네릭은 Error
        List<Object> list = new ArrayList<>();

        List<Object> listStr = null;
        List<String> listObj = null;

        //에러 List<String> -> List<Object>
//        listObj = (List<String>) listStr;

        //에러 List<Object> -> List<String>
//        listStr = (List<Object>) listObj;

        Apple1[] integers = new Apple1[]{
                new Apple1(),
                new Apple1(),
                new Apple1()
        };
        print(integers);

        List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3));
//        printGeneric(lists);     컴파일 에러 발생
        // 배열 같은 경우 printGeneric 의 parameter 로 argument가 넘어갈때 Integer[] 배열타입이 Object[] 배열 타입으로 업케스팅이 적용 되어 문제가 없지만, 제네릭 같은 경우 타입 파라미터가 오로지 똑같은 타입만 받기 때문에


        

        

    }

    public static void print(Fruit1[] arr) {
        for (Object e : arr) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
    public static void printGeneric(List<Object> arr) {
        for (Object e : arr) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
    


}








