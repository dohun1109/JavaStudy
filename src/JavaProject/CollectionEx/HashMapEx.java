package JavaProject.CollectionEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
            //Map = key/value 로 구성
            //key는 중복이 허용안되고 순서가 없고 value는 중복이 허용.

        map.put("Choi", 97);
        map.put("Hwang", 88);
        map.put("Kim", 78);
        map.put("Kim", 90);
        map.put("Park", 77);

        System.out.println(map);


        //key 는 Set 계열

        //사실 ,Iterator 는 특정한 것을 제거할 때 특화되어 있다.
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();

        while (it.hasNext()) {
            String name = it.next();
            int score = map.get(name);

            System.out.println("이름 :"+ name+", 성적:" + score);
        }
    }
}
