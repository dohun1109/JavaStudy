package StandardOfJava.UnClassified;

public class AirplaneRunner {
    public static void main(String[] args) {
        AirplaneEx air1 = new AirplaneEx();

        air1.takeoff();
        air1.fly();
        air1.flyMode = AirplaneEx.SUPERSONIC;
        air1.fly();
        air1.flyMode = AirplaneEx.NORMAL;
        air1.fly();
        air1.land();
        
    }

}
