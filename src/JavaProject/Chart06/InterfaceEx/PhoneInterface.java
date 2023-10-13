package JavaProject.Chart06.InterfaceEx;

public interface PhoneInterface {
    final int TIMEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void printLogo(){
        System.out.println("** Phone **");
    }
}

