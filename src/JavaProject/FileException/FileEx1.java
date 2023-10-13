package JavaProject.FileException;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class FileEx1 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("test.dat1");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        fis.close();
        ois.close();
    }
}
