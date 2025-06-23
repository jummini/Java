package a5_class;

public class Book {
    String title;
    String author;
    double price;

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String tostring() {
        return title + "by" + author + ","+ price + "원";


//    public String setTitle(String newTitle) {
//        this.title = newTitle;
//        return this.title;
//    }
//
//    public String setAuthor(String newAuthor) {
//        this.author = newAuthor;
//        return this.author;
//    }
//
//    public double setPrice(double newPrice) {
//        this.price = newPrice;
//        return this.price;
//    }


    }
    /*
    필드 :
    제목 (title)
    저자 (author)
    가격 (price)
    생성자 : 기본생성자와 모든 필드를 포함한 생성자
    메서드 : 책의 정보를 출력하는 메서드

    "제목 by 저자, 가격원" - 해리포터 by J.K. 롤링, 14000원
     */
}
