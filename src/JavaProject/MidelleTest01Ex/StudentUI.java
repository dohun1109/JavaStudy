package JavaProject.MidelleTest01Ex;





import java.util.Scanner;
/*
* "학생관리시스템은 학생의 정보를 "1. 등록, 2. 조회, 3. 수정, 4. 삭제, 0. 종료" 를 메뉴에 따라 지원하는
* 전형적인 관리시스템이다.
* 학생관리시스템은 화면을 담당하는 StudentUI, 로직과 실제 데이터를 처리하고 보관하는
* StudentDAO, 학생에 대한 데이터 정보를 담당하는 Student 클래스로 구성된다.
* */

public class StudentUI {
    private Scanner scan;
    private StudentDAO dao;     //학생관리시스템 데이터 처리 클래스

    public StudentUI(){
        scan = new Scanner(System.in);
        dao = new StudentDAO();
    }

    public void getShowUsage(){
        boolean bFlag = true;

        while (bFlag){
            System.out.println("============사용방법=========");
            System.out.println("1. 등록, 2. 조회, 3. 수정, 4. 삭제, 0. 종료");

            String menu = scan.nextLine();
            if(menu.equals("0")){
                System.out.println("종료");
                bFlag = false;
                return;
            }else{
                getUserInput(menu);       //재귀적 호출
            }

        }
    }

    public void getUserInput(String strMenu){
        if(strMenu.equals("1")){
            System.out.println("등록 메뉴");

            //1. 등록
            dao.create();

        }else if (strMenu.equals("2")){
            System.out.println("조회 메뉴");

            //2. 조회
            dao.read();

        }else if (strMenu.equals("3")){
            System.out.println("수정 메뉴");

            //3. 수정
            dao.update();

        }else if (strMenu.equals("4")){
            System.out.println("삭제 메뉴");

            //4. 삭제
            dao.delete();

        }else {
            System.out.println("0 ~ 4 사이의 수를 입력하세요");
        }
    }

    public static void main(String[] args) {
        StudentUI ui = new StudentUI();
        ui.getShowUsage();
    }
}
