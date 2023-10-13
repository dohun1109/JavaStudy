package JavaProject.Basic;

import java.util.Scanner;

public class StudentUI {
    /*
    * 학생관리시스템은 학생의 정보를 1. 등록, 2. 조회, 3. 수정, 4. 삭제, 0. 종료 를 메뉴에 따라 지원하는
    * 전형적인 관리 시스템이다.
    * 학생관리 시스템은 화면을 담당하는 StudentUI, 로직과 실제 데이터를 처리하고 보관하는
    * StudentDAO , 학새에 대한 데이터 정보를 담당하는  Student 클래스로 구성된다.
    *
    * 학생관리 시스템에서 사용자와 대면하는 화면을 담당하는 클래스
    * 사용자에게 직접 보여지는 클래스로 입려괸 정보를 StudentDAO 객체에게 전달하고
    * 처리할 내용을 위임한다.
    * */
    private Scanner scan;
    private StudentDAO dao;     //학생관리시스템 데이터 처리 클래스

    public StudentUI() {
        scan = new Scanner(System.in);
        dao = new StudentDAO();

    }

    public void getShowUsage() {
        boolean bFlag = true;

        while (bFlag) {
            System.out.println("============사용방법==============");
            System.out.println("1. 등록, 2. 조회, 3. 수정, 4. 삭제, 5. 저장,6. 불러오기 ,0. 종료");

            String menu = scan.nextLine();
            if (menu.equals("0")) {
                System.out.println("종료");
                bFlag = false;
                return;
            } else {
                getUserInput(menu);
            }
        }
    }

    

    public void getUserInput(String strMenu) {
        if (strMenu.equals("1")) {
            System.out.println("등록 메뉴");

            dao.create();
        } else if (strMenu.equals("2")){
            System.out.println("조회 메뉴");

            dao.read();
        }else if (strMenu.equals("3")) {
            System.out.println("수정 메뉴");

            dao.update();
        }else if (strMenu.equals("4")) {
            System.out.println("삭제 메뉴");

            dao.delete();
        }else if (strMenu.equals("5")) {
            System.out.println("저장 메뉴");

            dao.save();    //저장
        }else if (strMenu.equals("6")) {
            System.out.println("불러오기 메뉴");
            dao.load(); //불러오기
        }
        else {
            System.out.println("0 ~ 4 사이의 수를 입력하세요");
        }

    }

    public static void main(String[] args) {
        StudentUI ui = new StudentUI();
        ui.getShowUsage();
    }
}
