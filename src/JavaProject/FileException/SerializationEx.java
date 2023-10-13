package JavaProject.FileException;

import java.io.*;
import java.util.ArrayList;

public class SerializationEx {

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/FileException/data.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        Student stuKim = new Student("100", "Kim", 90);
        Student stuLee = new Student("200", "Lee", 80);
        Student stuPark = new Student("300", "Park", 88);

        ArrayList<Student> list = new ArrayList<>();
        list.add(stuKim);
        list.add(stuLee);
        list.add(stuPark);

        // 객체직렬화
        String serializedData = String.valueOf(list);
        oos.writeUTF(serializedData);

        oos.close();
        bos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/FileException/data.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);

        // 객체역직렬화
        ArrayList<Student> stuList;

        stuList = (ArrayList<Student>) ois.readObject();
        System.out.println(stuList);

        ois.close();
        bis.close();
        fis.close();
    }
}
