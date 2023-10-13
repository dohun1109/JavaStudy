package JavaProject.gui_basic;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {
    private Scanner scan;
    private ArrayList<Student> al;


    public StudentDAO() {
        scan = new Scanner(System.in);
        al = new ArrayList<Student>();
    }

    // 1. 등록
    // 등록시 점수는 0~100 사이 값 등록
    public boolean create(String id, String name, int score) {
        for (int i = 0; i < al.size(); i++) {
            Student s = al.get(i);
            if (id.equals(s.getId()))
                return false;
        }
        Student stu = new Student(id, name, score);
        al.add(stu);
        return true;
    }

    // 2. 조회
    public String read() {
        String str = " ";
        for (int i = 0; i < al.size(); i++) {
            str = str + "ID : " + al.get(i).getId() + "이름 : " + al.get(i).getName() + "성적 : "
                    + al.get(i).getScore() + '\n';
        }
        return str;
    }

    // 3. 수정
    public int update(String id) {

        int plus = 0;
        for (int i = 0; i < al.size(); i++) {
            Student stu = al.get(i);

            if (id.equals(stu.getId())) {
                break;
            } else
                plus++;

        }
        return plus;

    }
    public Student Search_i(int id_i){

        Student st1 = new Student(al.get(id_i).getId(), al.get(id_i).getName(),al.get(id_i).getScore());

        return st1;
    }
    
    // 추가. 검색
    public boolean Search(String id){
        boolean result = false;

        for (int i = 0; i < al.size(); i++) {
            Student stu = al.get(i);

            if (id.equals(stu.getId())) {
                result = true;
            } else
                continue;

        }
        return result;
    }

    // 4. 삭제
    public void delete(String id) {
        System.out.println("삭제할 학생 ID를 입력하세요 . >>>");
        String del_id = scan.nextLine();

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
            System.out.println("ID가 삭제됨");
        } else {
            System.out.println("삭제할 ID가 없습니다.");
        }


    }

    public void save() {
        try {
            String savefilename = "/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/gui_basic/final1.txt";
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
            String savefilename = "/Users/kimdohun/Desktop/Java/Studywithme/studyWithMe/src/JavaProject/gui_basic/final1.txt";
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


    public void update_2(int id_i, String id,String name,int score) {
          al.set(id_i,new Student(id,name,score));

    }
}
