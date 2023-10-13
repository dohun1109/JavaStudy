package StandardOfJava.Generic.GenericClassChallenge;

public class River extends Line{

    private String name;

    public River(String name , String... locations) {
        super(locations);
        this.name = name;                     
    }

    @Override
    public String toString() {
        return name + "강 ";
    } 
}
