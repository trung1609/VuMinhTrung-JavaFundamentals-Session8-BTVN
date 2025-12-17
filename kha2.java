package Session8;

public class kha2 {
    private String title;
    private String author;
    private double price;

    public kha2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        kha2 k2 = new kha2("Harry Potter", "JK", 50000);
        System.out.println("Title: " + k2.title);
        System.out.println("Author: " + k2.author);
        System.out.println("Price: " + k2.price);
    }
}
