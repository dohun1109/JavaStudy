package JavaProject.FileException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**/
public class FileCopyEx {

    public static void main(String[] args) throws Exception{
        // 1. 읽고 쓸 장치를 준비한다.
        InputStream in = null;
        OutputStream out = null;

        in = new FileInputStream("/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/FileException/aaa.txt");
        out = new FileOutputStream("/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/FileException/copy.txt");

        //2. 읽고/쓰기
        while (true){
            int data = in.read();

            if (data == -1){
                break;
            }
            out.write(data);
            System.out.print((char)data);
        }
        // 3. 장치를 닫아준다.
        in.close();
        out.close();


    }
}
