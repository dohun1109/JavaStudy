package JavaProject.Chart06;
//1. 상속을 이용하지 않는 경우
//문제점 : 새로운 교통편이 추가 될때 마다 Travel 클래스에 추가되는 교통편을 지원하기 위한
//goBusan(XXX xxx) 메소드가 추가되어야 한다.

//2. 상속을 이용
//문제점 : goBusan(Transportation t) 메소드로 메소드 파라미터의 다형성을 이용하여
//모든 교통을 받아 들여 해당 교통편을 else if 문으로 처리하므로 새로운 교통편이 추가되면 else if 문이 추가된다.

//3. 메소드 오버라이딩
//새로운 교통편이 추가되더라도 프로그램 수정이 필요없다.

//4. 추상클래스를 이용  - 오버라이딩을 강제할 방법은 무엇인가? -추상메소드로 만들어 준다.
// 오버라이딩을 강제로 구현하게 함.

abstract class Transportation {
    public abstract void go();   //메소드를 강제적으로 오버라이딩을 시키는 방법.    -추상클래스로 정의
    //클래스가 추상 메소드를 가지면 그 클래스는 추상클래스가 된다.
    //{
//        System.out.println("부산으로 가는 교통편입니다.");
//    }
}

class Bus extends Transportation {
    @Override
    public void go() {
        System.out.println("버스를 타고 부산을 간다.");
    }
//    public void goBusBusan() {
//        System.out.println("버스를 타고 부산을 간다.");
//    }
}

class Train extends Transportation {
    @Override
    public void go() {
        System.out.println("기차를 타고 부산을 간다.");
    }
//    public void goTrainBusan() {
//        System.out.println("기차를 타고 부산을 간다.");
//    }
}

class KTX extends Transportation {
    @Override
    public void go() {
        System.out.println("KTX를 타고 부산을 간다.");
    }
}

public class Travel {
    //메소드 파라미터의 다형성을 이용한다. - 즉, Transportation 타입의 모든 객체는
    //goBusan() 메소드의 변수를 사용할 수 있다.


    public void goBusan(Transportation t) {
        //메소드 오버라이딩을 이용.(재사용성 증가)ㄴ
        t.go();
    }

//    public void goBusan(Transportation t) {
//        if (t instanceof Bus) {
//            ((Bus) t).goBusBusan();
//
//        } else if (t instanceof Train) {
//            ((Train) t).goTrainBusan();
//
//        }
//    }
//    public void goBusan(Bus bus) {
//        bus.goBusBusan();
//    }
//
//    public void goBusan(Train train) {
//        train.goTrainBusan();
//    }

    public static void main(String[] args) {
        Travel travel = new Travel();

        //버스를 타고 부산을 간다.
        Bus bus = new Bus();
        travel.goBusan(bus);

        //기차를 타고 부산을 간다.
        Train train = new Train();
        travel.goBusan(train);

        //KTX를 타고 부산을 간다.
        KTX ktx = new KTX();
        travel.goBusan(ktx);
    }

}
