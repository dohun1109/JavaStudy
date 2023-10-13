package StandardOfJava.UnClassified;

public sealed class sealedPerson permits Employee, Manager {
    //필드
    public String name;

    //메소드 
    public void work(){
        System.out.println("하는 일이 결정되지 않았습니다.");
    }

}
