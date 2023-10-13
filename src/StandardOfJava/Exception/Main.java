package StandardOfJava.Exception;

public class Main {

    //일반 예외 -> 컴파일러 체크 예외, 자바 소스를 컴파일 하는 과정에서 예외 처리 코드가 필요한지 검사한다.
    //실행 예외(Runtime Exception) -> 컴파일하는 과정에서 예외처리코드를 검사하지 않는 예외를 말한다.


    //예외처리 과정 : JVM은 프로그램 실행하느 도중에 예외가 발생하면 해당 예외 클래스로 객체를 생성한다. 그리고 나서 예외 처리코드에서 예외 객체를 이용할 수 있도록 도와준다. 모든예외는 java.lang.Exception 클래스를 상속받는다.

    //Runtime Exception
    public static void main(String[] args) {
        String data = null;
//        System.out.println(data.toString());
        //NullPointerException -> 객체가 없는 상태에서 객체를 사용하려해서 예외 발생

//        String data1 = args[0];
//        String data2 = args[1];
//        System.out.println("args[0] : " + data1);
//        System.out.println("args[1] : " + data2);
        //ArrayIndexOutOfBoundsException -> array 에서 index 범위 초과 할 경우 발생


        //int value1 = Integer.parseInt("a100");
        //NumberFormatException -> 숫자로 변환될수 없는 문자


        //ClassCastException -> 타입변환 예외
        //타입 변환가능한지 instanceof 로 확인

        try {
            XXXException Xe = new XXXException();
            Xe.method();
        } catch (XXXException e) {
            throw new RuntimeException(e);
        }


    }

    


    
}
class XXXException extends Exception{
    public XXXException() {
    }

    public XXXException(String message) {
        super(message);
    }
    public void method() throws XXXException{
        throw new XXXException("메시지");
    }

    
}
