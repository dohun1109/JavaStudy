package JavaProject.CollectionEx;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {


    public static void main(String[] args) {

        TreeSet<Student> htree = new TreeSet<>();

        Student stuKim = new Student("100", "Kim", 80);
        Student stuLee = new Student("200", "Lee", 80);
        Student stuPark = new Student("300", "Park", 90);
        Student stuKim1 = new Student("100", "Kim", 80);    //중복

        htree.add(stuKim);
        htree.add(stuLee);
        htree.add(stuPark);
        htree.add(stuKim1);

        System.out.println(htree);

        Iterator<Student> it  = htree.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        

    }
}
