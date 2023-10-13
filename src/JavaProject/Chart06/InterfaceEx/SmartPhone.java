package JavaProject.Chart06.InterfaceEx;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

    //MP3Interface의 추상메소드 구현
    @Override
    public void play() {
        System.out.println("음악을 연주합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악을 중단합니다.");
    }

    //MobilePhoneInterface의 추상메소드 구현
    @Override
    public void sendSMS() {
        System.out.println("문자갑니다.");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자왔어요.");
    }

    //PhoneInterface의 추상메소드 구현
    @Override
    public void sendCall() {
        System.out.println("따르릉따르릉~~~");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화 왔어요.");
    }

    public void schedule() {
        System.out.println("일정 관리합니다.");
    }

    public static void main(String[] args) {


        SmartPhone phone = new SmartPhone();
        phone.printLogo();
        phone.sendCall();
        phone.play();
        System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
        phone.schedule();

        //만들수 있는 타입 종류

        SmartPhone sp = new SmartPhone();
        PDA ps = new SmartPhone();       //다형성
        MobilePhoneInterface mp = new SmartPhone();//다형성
        MP3Interface mmp = new SmartPhone();             //다형성
        PhoneInterface ppmp = new SmartPhone();                //다형성
        Object get_obj = new SmartPhone();
        PDA pa = new PDA();


    }
}
