package JavaProject.Chart02;

import java.util.Scanner;

public class IfElseEx {
    public static void main(String[] args) {
        //성적을 입력ㅂ다아 90이상은 A, 80이상은 B, 70이상은 C ~~~~
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int score = Integer.parseInt(str);

        if(score >= 90){
            System.out.println("A");
        }else if(score >= 80){
            System.out.println("B");
        }else if(score >= 70){
            System.out.println("C");
        }else if(score >= 60){
            System.out.println("D");
        }else System.out.println("F");



    }
}
