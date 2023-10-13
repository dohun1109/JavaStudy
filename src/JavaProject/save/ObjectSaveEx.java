package JavaProject.save;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class ObjectSaveEx {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("aaa.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student stuKim = new Student("100", "Kim", 90);
        Student stuLee = new Student("200", "Lee", 80);
        Student stuPark = new Student("300", "Park", 80);

        ArrayList<Student> al = new ArrayList<>();
        al.add(stuKim);
        al.add(stuLee);
        al.add(stuPark);

        //객체직렬화 - 저장할 객체에 Serializable 인터페이스를 구현하여 객체를 직렬화 해주어야 한다.
        oos.writeObject(al);

        oos.close();
        fos.close();

        System.out.println("저장된 객체를 읽기 위해서 객체 역직렬화");
        FileInputStream fis = new FileInputStream("aaa.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        System.out.println(list);

        ois.close();
        fis.close();

        
    }

}
