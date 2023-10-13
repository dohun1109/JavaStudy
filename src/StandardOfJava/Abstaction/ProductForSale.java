package StandardOfJava.Abstaction;



public abstract class ProductForSale {

   protected String type;
   protected double price;
   protected String description;
   //protected -> Sub Class 가 접근하여 수정할 수 있다.


    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int qty) {  //qty = 제품의 개수
        return qty * price; //제품의 개수 * 제품의 단일 가격 = 총 판매 가격
    }

    public void printPricedItem(int qty) {

        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n", qty, price, type, description);
        
    }

    public abstract void showDetails();
    

    
}
