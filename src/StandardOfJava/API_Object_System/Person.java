package StandardOfJava.API_Object_System;

public class Person {


    private String name;
    private String id;
    private int pw;
    private int age;
    private double distance;


    public Person(String name, String id, int pw, int age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }


    void move(int x1,int x2, int y1, int y2){
        this.distance = Math.sqrt(((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
        System.out.println("두 점사이의 거리 :"+distance);
        System.out.println("거리의 제곱: "+ distance*distance);

    }

//    public static void main(String[] args) {
//        Person p1 = new Person("박기영", "parki", 1010, 20);
//        p1.move(0,2,0,2);
//    }
}
