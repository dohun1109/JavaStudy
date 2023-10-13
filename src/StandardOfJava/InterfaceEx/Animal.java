package StandardOfJava.InterfaceEx;

enum FlightStages implements Trackable{
    GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {

        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage() {

        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];
    }
}
record DragonFly(String name, String type) implements FlightEnabled {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Satellite implements OrbitEarth {

    FlightStages stage = FlightStages.GROUNDED;

    @Override
    public void achieveOrbit() {
        transition("Orbit achieved");
    }

    @Override
    public void takeOff() {
        transition("Taking Off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data Collection while Orbiting");
    }

    public void transition(String description) {

        System.out.println(description);
        stage = transition(stage);
        stage.track();
        
    }
}
interface OrbitEarth extends FlightEnabled {

    void achieveOrbit();

    private static void log(String description) {
        var today = new java.util.Date();
        System.out.println(today + " : " + description);
    }

    private void logState(FlightStages stage, String description) {

        description = stage + " : " + description;
        log(description);
        
    }

    @Override
    default FlightStages transition(FlightStages stages) {
        FlightStages nextStage = FlightEnabled.super.transition(stages);
        logState(stages, "Beginning Transition to " + nextStage);
        return nextStage;
    }
}


interface FlightEnabled {

    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    //interface 에서는 doub
    // le or final double, public final double,public static final double 4가지 경우 모두 동일한 의미이다.

    
    
    public abstract void takeOff();   //public
    abstract void land();           //abstract
    void fly();                     //위, 둘다 추상적으로 선언됨.

    default FlightStages transition(FlightStages stages){
//        System.out.println("transition not implemented on " + this.getClass().getName());
//        return null;
        FlightStages nextStage = stages.getNextStage();
        System.out.println("Transitioning from "+stages + " to " + nextStage);
         return nextStage;
    };
    
    
}

interface Trackable {
   void track();
}


public abstract class Animal {

    public abstract void move();
}
