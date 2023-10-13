package JavaProject.CollectionEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {
        int[] arr = new int[3];
        // 그냥 array 는 불변성 객체 이기 때문에 구조를 확장하거나 배열의 길이를 변경하는게 불가능 하다.
        // 그런데 이러한 불변성 객체의 경우 처음 객체를 생성시에 크기를 지정해주어야 하는데
        // 이렇게 크기를 정해놓을 경우 힙 메모리에 생성된 객체가 메모리의 낭비로 이어질수 있다. 사용하지 않을 때의
        // 메모리를 제어해주면 되는데 java 의 경우 GC 가 메모리를 제어하기 때문에 프로그래머가 직접적으로 메모리제어에
        // 접근 할 수 없다 그럼으로 동적으로 배열의 길이를 변경하여 늘리거나 줄일 수 있는 ArrayList를 사용해야 한다.

        ArrayList list = new ArrayList();
        // List => 순서가 있고 중복을 허용한다.

        list.add("Kim");
        list.add(10);
        list.add(20);
        list.add("Lee");
        list.add(10);
        list.add(12.5);

        System.out.println(list);

        ArrayList<Student> list1 = new ArrayList<>();
        // 타입을 지정하여 특정 타입만을 받겠다는 것을 선언 하는 것을 제네릭 이라고 한다.
        //  <Stirng>

        Student stuKim = new Student("100", "KIm", 78);
        Student stuLee = new Student("200", "Lee", 80);
        Student stuPark = new Student("300", "Pakr", 90);
        Student stuKim1 = new Student("100", "Kim", 91);
        
        list1.add(stuKim);
        list1.add(stuLee);
        list1.add(stuPark);
        list1.add(stuKim1);

        System.out.println(list1);


        Iterator it = list1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore()-o2.getScore();
            }
        });

        System.out.println(list1);
    }
}
