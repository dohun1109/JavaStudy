package JavaProject.Chart04;

public class BookRunner {
    public static void main(String[] args) {
        Book b1 = new Book("제목1","사람1");
        Book b2 = new Book("제목2");

        System.out.println("b1 정보:" +
                b1.getTitle()+" "+b1.getAuthor());
        System.out.println("b2 정보:" +
                b2.getTitle()+" "+b2.getAuthor());

    }
}
