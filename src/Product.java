import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    public static int AUTO_ID = 1;
    public final String WAREHOUSE_CODE = "KHO-01";

    public Product() {
    }

    public Product( String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void input(Scanner sc) {
        id = AUTO_ID++;
        System.out.print("Nhap ten san pham: ");
        this.name = sc.nextLine();
        System.out.print("Nhap gia san pham: ");
        this.price = Double.parseDouble(sc.nextLine());
    }
    public void print(){
        System.out.println("***********Danh sach san pham************");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warehouse code: " + WAREHOUSE_CODE);
    }

    public double getPrice() {
        return price;
    }
}
