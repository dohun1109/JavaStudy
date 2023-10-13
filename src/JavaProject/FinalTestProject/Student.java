package JavaProject.FinalTestProject;




import java.io.Serializable;

// 객체 직렬화를 위해서는 Serializable 인터페이스를 구현 해 주어야 한다.

/*
 * 학생관리 시스템에서 학생 데이터를 하나의 객체 단위로 보관하기 위한 클래스
 * 학생 각각의 정보를 하나의 Student 데이터 객체가 된다.
 * Student.java
 */

public class Student implements Serializable {
    private String id;   //id
    private String name; //이름
    private int score;   //성적

    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    // 객체 정보를 문자열로 출력
    public String toString() {
        return id+":"+name+":"+score;
    }
    // 객체가 같은지 검사
    public boolean equals(Object obj) {
        boolean result = false;
        // id만 같으면 같은 객체
        if(obj instanceof Student) {
            Student stu = (Student)obj;
            return id.equals(stu.id);
        }
        return result;
    }



}