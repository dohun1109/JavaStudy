package JavaProject.Chart02;


import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {

        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 입력: ");

        Scanner scan = new Scanner(System.in);

        System.out.print("이름은? : ");
        String name = scan.nextLine();

        System.out.print("도시는? : ");
        String city = scan.nextLine();

        System.out.print("나이은? : ");
        String age = scan.nextLine();

        System.out.print("체중은? : ");
        String wh = scan.nextLine();

        System.out.print("독신 여부는?(y/n) : ");
        String yn = scan.nextLine();



        System.out.println("입력된 이름, 도시, 나이, 체중, 독신 여부는?"+"\n"+name+","+city+","+age+","+wh+","+yn);


    }
}
