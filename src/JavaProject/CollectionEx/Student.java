package JavaProject.CollectionEx;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    // Student 객체에 정렬기능을 가질려면 Comparable 인터페이스를 구현해주어야한다.

    private String id;
    private String name;
    private int score;

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

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public boolean equals(Object obj) {
        boolean result = false;

        //id 같으면 같은 객체
        if (obj instanceof Student) {
            Student stu = (Student) obj;
            return id.equals(stu.id);
        }


        return result;
    }

    @Override
    public int hashCode() {
        return (name).hashCode();
    }


    @Override    
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }


}
