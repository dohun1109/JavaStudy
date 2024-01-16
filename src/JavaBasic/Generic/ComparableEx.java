package JavaBasic.Generic;

import java.util.Arrays;
import java.util.Collection;

// 컬렉션을 인자로 받아 컬렉션의 요소들을 최대값(max)를 구해 반환하는 메서드 예제이다. 제네릭 메서드 타입으로 재귀적 타입 한정이 사용되었다.
public class ComparableEx {
    // 외부로 들어온 타입 E는 Comparable<E> 를 구현한 E 객체이어야 한다.
    //즉, 자기 자신 말고는 안받겠다는 소리
    
    public static <E extends Comparable<E>> E max(Collection<E> collection) {
        if (collection.isEmpty()) throw new IllegalArgumentException("컬렉션이 비어 있습니다.");

        E result = null;
        for (E e : collection) {
            if (result == null) {
                result = e;
                continue;
            }

            if (e.compareTo(result) > 0) {
                result = e;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        Collection<Integer> list = Arrays.asList(56, 34, 12, 31, 65, 77, 91, 88);
        System.out.println(ComparableEx.max(list));

        Collection<Number> list2 = Arrays.asList(56, 34, 12, 31, 65, 77, 91, 88);
//        System.out.println(ComparableEx.max(list2));
        //! Error - Number 추상 메소드는 Comparable 을 구현하지 않았기 때문
        Collection<Integer> list3 = Arrays.asList();
//        System.out.println(ComparableEx.max(list3)); ->           IllegalArgumentException 발생 
        
    }

}
