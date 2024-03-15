package JavaBasic.DesignPattern;


class NaturalType{
    String type;

    NaturalType(AnimalEx animal) {
        // 생성자로 부터 동물이름이 같은면, 정규 표현식으로 매칭된 동물 타입을 설정.
        if (animal instanceof Cat) {
            this.type = "포유류";
        }
    }
    String print(){
        return "이 동물의 종류는 " + type + " 입니다.";

    }


}


class AnimalEx{
    NaturalType getType(){
        NaturalType n = new NaturalType(this);
        return n;
    }

}

class Cat extends AnimalEx{

}

public class LSP_EX {

    public static void main(String[] args) {
        AnimalEx cat = new Cat();
        String result = cat.getType().print();
        System.out.println(result);
        
    }
}
