package JavaProject.save;

import java.io.Serializable;

public class Student implements Serializable {
    /*
    * 학생관리시스템에서 학생 데이터 하나를 객체단위로 보관하기 위한 클래스
    * 학생 각각의 정보는 하나의 Student 데이터 객체가 된다.
    * */
    private String id;          //학생 id
    private String name;        //학생 이름
    private int score;          //학생 성적

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    //객체의 정보를 문자열로 출력
    @Override
    public String toString() {
        return "id:"+id+"name :"+ name +"socre :"+ score;
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;

        //id만 같으면 같은 객체
        if (o instanceof Student){
            Student stu = (Student)o;
            return id.equals(stu.id);
        }
        return result;
    }

}
