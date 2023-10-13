package JavaProject.Basic;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO implements Serializable {
    /*
     * 학생관리시스템에서 요구하는 기능을 처리하는 객체를 만드는 클래스
     * 학생관리시스템의 요구사항을 만족시키기 위해서 입력정보를 StudentUI 객체의 도움을 받아
     * 모든 로직을 처리하고 실제 데이터를 보관하는 역활을 한다.
     * */

    private Scanner scan;
    private ArrayList<Student> al;   //ArrayList 에 무한 데이터 입력 Student type 의 제네릭 사용.
    private String id;
    private String name;
    private int score;

    public StudentDAO() {
        scan = new Scanner(System.in);
        al = new ArrayList<Student>();

    }

    //1. create() 등록 CRUD 중 C
    public void create() {
        System.out.println("학번 입력 >> ");
        id = scan.nextLine();

        for (int i = 0; i < al.size(); i++) {
            Student stu = al.get(i);
            if (id.equals(stu.getId())) {
                System.out.println("이미 존재하는 ID입니다. ");
                return;
            }
        }
        System.out.println("이름 입력 >> ");
        name = scan.nextLine();

        System.out.println("성적 입력 1~100 사이 숫자 입력>> ");
        score = Integer.parseInt(scan.nextLine());
        if (score >= 0 && score <= 100) {
            Student stu = new Student(id, name, score);
            al.add(stu);
        } else {
            System.out.println(" 1 ~ 100 수를 입력하세요 (입력한 데이터는 사라집니다.)>>");
            return;
//            System.exit(0);   //프로그램 종료 method
        }


    }

    //2. 조회 CRUD 중 Read
    public void read() {
        for (int i = 0; i < al.size(); i++) {
            System.out.println("ID : " + al.get(i).getId() + " 이름 :" + al.get(i).getName() + "성적 : " + al.get(i).getScore());
        }
    }

    //3. 수정 CRUD 중 Update
    public void update() {
        System.out.println("수정할 ID를 입력하세요 >> ");
        id = scan.nextLine().trim();    //trim() = 공백을 제거 하는 method

        for (int i = 0; i < al.size(); i++) {
            Student stu = al.get(i);
            if (id.equals(stu.getId())) {
                al.remove(i);
            } else {
                System.out.println("수정할 ID가 없습니다.");
                return;
            }
        }
        System.out.println(" 수정 내용을 다시 입력하시오 >> ");
        create();

    }

    //4. 삭제 CRUD 중 Delete
    public void delete() {
        System.out.println(" 삭제할 학생의 ID를 입력하세요. >> ");
        id = scan.nextLine();

        boolean found = false;
        int tempIndex = 0;

        for (int i = 0; i < al.size(); i++) {
            Student stu = al.get(i);
            if (id.equals(stu.getId())) {
                found = true;
                tempIndex = i;
            }
        }
        if (found) {
            al.remove(tempIndex);
            System.out.println("ID가 삭제됨. ");
        } else {
            System.out.println("삭제하 ID가 없습니다.");
        }
    }

    public void save() {
        try {
            String savefilename = "/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/Basic/data.txt";
            FileOutputStream fos = new FileOutputStream(savefilename);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);


            ArrayList<Student> list = new ArrayList<>();
            for (int i = 0; i < al.size(); i++) {
                list.add(new Student(al.get(i).getId(), al.get(i).getName(), al.get(i).getScore()));
            }


            // 객체직렬화
            bw.write(String.valueOf(list));


            bw.close();
            osw.close();
            fos.close();

        } catch (Exception e) {
            System.out.println("객체 저장에 실패");
        }
    }

    public void load() {
        try {
            String savefilename = "/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/Basic/data.txt";
            FileInputStream fis = new FileInputStream(savefilename);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);


            ArrayList<String> stulist = new ArrayList<>();
            for (int i = 0; i < al.size(); i++) {
                stulist.add(br.readLine());
            }
            System.out.println(stulist);

            br.close();
            isr.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("역직렬화 실패");
        }


    }


}
