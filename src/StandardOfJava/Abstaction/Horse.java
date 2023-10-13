package StandardOfJava.Abstaction;

public class Horse extends Mammal {


    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring");
        
    }


    @Override
    public void makeNoise() {
        if (type == "Clydesdale") {
            System.out.print(" Horse!  ");
        }else{
            System.out.print(" Wtf Horse!!  ");
        }
    }
}
