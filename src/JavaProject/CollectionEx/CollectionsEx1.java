package JavaProject.CollectionEx;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx1 {
    static void printList(LinkedList<String> l){    //리스트의 요소를 모두 출력하는 메소드
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            String e = it.next();
            String separator;
            if (it.hasNext()) {
                separator = "->";           //마지막 요소가 아니면 ->
            }else
                separator = "\n";           //마지막 요소이면 줄바꿈
            System.out.println(e+separator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("트랜스포머");
        list.add("스타워즈");
        list.add("메트릭스");
        list.add(0, "터미네이터");
        list.add(2, "아바타");

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);


        int index = Collections.binarySearch(list, "아바타")+1;
        System.out.println("아바타는 " + index + "번째 요소입니다.");

    }
}
