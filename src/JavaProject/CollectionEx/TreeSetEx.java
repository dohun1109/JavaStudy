package JavaProject.CollectionEx;

import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {
        TreeSet<String> htree = new TreeSet<>();

        //Tree 가 붙으면 정렬기능을 가진다.

        htree.add("AAA");
        htree.add("KKK");
        htree.add("CCC");
        htree.add("AAA");       //중복
        htree.add("BBB");

        System.out.println(htree);
    }
}
