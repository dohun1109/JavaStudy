package JavaProject.CollectionEx;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

    public static void main(String[] args) {
        // Set => 순서가 없고 중복이 허용되지 않는다.
        // 즉, 같은 값을 추가하면 하나만 적용됨. 그리고 순서가 없기 때문에 저장한 순서대로
        // 저장되는게 아니라 아무렇게나 저장됨.?
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(10);
        set.add(50);

        System.out.println(set);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
}
