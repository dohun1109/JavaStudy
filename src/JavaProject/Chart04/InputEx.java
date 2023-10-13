package JavaProject.Chart04;


import java.util.Scanner;

//0 ~ 100 까지 사이의 숫자만 입력받을 수 있도록 예외처리를 수정하시오.
public class InputEx {
    public void getInput() {
        Scanner scan = new Scanner(System.in);

        int userInput = 0;
        while (true) {
            System.out.print("숫자를 입력하시오>>:");
            try {
                userInput = Integer.parseInt(scan.nextLine());
                if(userInput == -1){
                    break;
                }
                if (userInput > 100 || userInput < 0) {
                    System.out.println("0~100사이 정수를 입력해 주세요:");
                    continue;
                }
                System.out.println("입력된 숫자는 " +
                        userInput + "입니다.");

            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("입력한 문자는 정수로 변환할 수 없습니다.");


            }
        }

    }

    public static void main(String[] args) {
        InputEx ie = new InputEx();
        ie.getInput();
    }


}
