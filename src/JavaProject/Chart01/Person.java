package JavaProject.Chart01;

public class Person {
    private  String name;
    private int age;
    private int ssn;

    public Person(String name, int age, int ssn){
        this.name = name;
        this.age = age;
        this.ssn = ssn;

    }
    public String toString(){
        return name+":"+age+":"+ssn;
    }


}
