package JavaProject.MidelleTest01Ex;

public class Student {
    private String id;      //id
    private String name;    //이름
    private int score;      //성적

    public Student(String id, String name, int score){
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

    //객체 정보를 문자열로 출력
    public String toString(){
        return id+ ":" + name+ ":" +score;
    }

    //객체가 같은지 검사
    public boolean equals(Object obj){
        boolean result = false;

        //id 만 같으면 같은 객체
        if (obj instanceof Student){
            Student stu = (Student) obj;
            return id.equals(stu.id);
        }
        return result;
    }


}
