package JavaProject.Chart04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamEx {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        FileOutputStream fos = null;

        // Exception -> IOException -> FileNotFoundException
        try {
            // throws FileNotFoundException : 파일을 찾을수 없을시 예외처리.
            fis = new FileInputStream("/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/Chart04/text.txt");     // 읽을 파일이 없을 경우 예외 발생 , 컴파일시 발생.
            fos = new FileOutputStream("copy.txt");
            while (true) {
                int data = fis.read();  // IO 중에 읽을 때 예외 발생.

                if (data == -1) {
                    break;
                }
                fos.write(data);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 없어용");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException");
        } finally {
            try {
                System.out.println(" 쓰기 오류");
                fis.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                System.out.println("읽기 닫음");
                fos.close();
            }catch (IOException e) {
               e.printStackTrace();
            }
        }


    }
}
