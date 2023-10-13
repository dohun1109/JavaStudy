package JavaProject.Chart04;

public class Book {
    private String title;
    private String author;

    void show(){
        System.out.println(title+" "+author);

    }
    //this() : 생성자에서 또 다른 생성자 호출하는 메소드
    public Book(){
        this("","");
    }
    public Book(String title){
        this(title,"작가 미상");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        int[] arr = new int[3];

        Book[] book = new Book[3];
        book[0] = new Book("춘향전");
        book[1] = new Book("토지","박경리");
        book[2] = new Book("어린왕자","생택쥐페리");

        for (int i = 0; i< book.length;i++){
            book[i].show();
        }
    }
}
