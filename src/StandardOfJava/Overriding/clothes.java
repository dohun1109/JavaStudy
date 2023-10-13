package StandardOfJava.Overriding;

public class clothes {

    public void cut_height(){
        System.out.println("높이를 수선함.");

    }

    public void cut_width() {
        System.out.println("너비를 수선함.");
    }


    public void show_price(){
        System.out.println("TAG 가격 : 50000");
    }
}

class reform extends clothes {

    @Override
    public void cut_height() {
        System.out.println("오버라이딩 : 높이를 3cm 수선함");
    }

    @Override
    public void cut_width() {
        System.out.println("오버라이딩 : 너비를 5cm 수선함.");
    }

    @Override
    public void show_price() {
        super.show_price();
        System.out.println("추가금"+ 500+ "원");
    }
}

class wardrobe extends clothes{
    public static void main(String[] args) {


        clothes ct = new clothes();
        reform re = new reform();

        ct.cut_height();
        ct.cut_width();
        ct.show_price();

        re.cut_height();
        re.cut_width();
        re.show_price();

        
    }
}

