package JavaProject.FileException;

import java.io.*;
import java.nio.charset.StandardCharsets;

// 정상적으로 예외처리를 한 경우
public class FileCopyEx2 {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;

        try{
            in = new FileInputStream("/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/FileException/aaa.txt");
            out = new FileOutputStream("/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/FileException/copy.txt");
            
            
            while (true){
                int data = in.read();
                if (data == -1) break;
                out.write(data);
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("찾는 파일이 존재하지 않습니다.");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("파일을 읽을 수가 없습니다.");
            throw new RuntimeException(e);
        }finally {
            try{
                in.close();
            }catch (IOException e){
                e.printStackTrace();
                System.out.println("파일을 닫지 안았습니다.");
            }
            try{
                out.close();
            }   catch(IOException e){
                e.printStackTrace();
                System.out.println("파일을 닫지 않았습니다.");
            }
        }
    }
}
