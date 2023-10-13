package StandardOfJava.UnClassified;

public class AirplaneEx extends Airplane {

    //상수 선언
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;


    //상태 필드 선언
    public int flyMode = NORMAL;

    //메소드 재정의

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음쇽으로 미귝에갼댜");
        } else
            //Airplane 의 fly 메소드 호출
            super.fly();
        
    }
}
