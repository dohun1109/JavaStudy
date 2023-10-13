package StandardOfJava.UnClassified;

public class SealedExample {
    public static void main(String[] args) {
        sealedPerson p = new sealedPerson();
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        p.work();
        e.work();
        m.work();
        d.work();
    }
}
