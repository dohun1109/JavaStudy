package JavaProject.MidelleTest01Ex;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
    /* 학생관리시스템에서 요구하는 기능을 처리하는 객체를 만드는 클래스
    *  학생관리시스템의 요구사항을 만족시키기 위해서 입력정보를 StudentUI 객체의 도움을 받아
    *  모든 로직을 처리하고 실제 데이터를 보관하는 역활을 한다.
    *  StudentDAO.java
    * */
    private Scanner scan;
    private ArrayList<Student> al;
    private String id;
    private String name;
    private int score;

    //1. 등록
    public void create() {
        System.out.println("학번 입력 >> ");
        id = scan.nextLine();

        //id가 이미 존재하면 등록 안함.
        for (int i = 0; i < al.size(); i++){
            Student stu = al.get(i);
            if (id.equals(stu.getId())){
                System.out.println("이미 존재하는 ID입니다.");
                return;
            }
        }
        System.out.println("이름 입력>> ");
        name = scan.nextLine();

        System.out.println("성적 입력>> ");
        score = Integer.parseInt(scan.nextLine());

        Student stu = new Student(id, name, score);
        al.add(stu);


    }

    //2. 조회
    public void read() {
        for (int i = 0; i< al.size(); i++){
            System.out.println("ID : " + al.get(i).getId() + "이름 : " + al.get(i).getName() + " 상작 :" + al.get(i).getScore() );

        }
    }

    //3. 수정
    public void update() {
        System.out.print("수정할 ID를 입력하세요>> ");
        id = scan.nextLine().trim();

        for (int i = 0; i < al.size(); i++){
            Student stu = al.get(i);
            if (id.equals(stu.getId())){
                al.remove(i);
            }else{
                System.out.println("수정할 ID가 없습니다.");
                return;
            }
        }
        System.out.println("수정 내용을 다시 입력하시오>>");
        create();
    }

    public void delete() {
        
    }
}
