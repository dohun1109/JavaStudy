package JavaBasic.kr.co.hanbit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaEx1 {


    public static void main(String[] args) {
        List list =  new ArrayList<String>();

        list.add("void");
        list.add("static");
        list.add("public");

        System.out.println(list);
        //익명 클래스 코드
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        });
        System.out.println(list);
        list.add("abc");



        //람다 표현식 코드
        list.sort((Comparator<String>) (str1, str2) -> str1.compareTo(str2));
        System.out.println("list = " + list);
        



    }

}
