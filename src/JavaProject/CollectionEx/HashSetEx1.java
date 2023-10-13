package JavaProject.CollectionEx;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

    public static void main(String[] args) {
        // 사용자 정의 객체를 넣을 때 정상적으로 출력하기 위해서는
        // Set 계열은 equals(), hashCode() 의 값이 같아야 같은 객체로 인식
        
        HashSet<Student> set = new HashSet<>();

        Student stuKim = new Student("100", "KIm", 80);
        Student stuLee = new Student("200", "Lee", 80);
        Student stuPark = new Student("300", "Pakr", 90);
        Student stuKim1 = new Student("100", "Kim", 90);

        set.add(stuKim);
        set.add(stuLee);
        set.add(stuPark);
        set.add(stuKim1);


        System.out.println(stuKim.equals(stuKim1));   //중복
        System.out.println(stuKim.hashCode());
        System.out.println(stuKim1.hashCode());
        
        System.out.println(set);







    }
}
