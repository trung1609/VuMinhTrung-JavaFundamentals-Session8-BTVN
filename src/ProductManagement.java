import java.util.Scanner;

public class ProductManagement {
    Product[] arrProduct = new Product[100];
    int currentProduct = 0;
    int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManagement productManagement = new ProductManagement();
        do {
            System.out.println("***********MENU SAN PHAM*************");
            System.out.println("1. Them san pham moi");
            System.out.println("2. In danh sach san pham");
            System.out.println("3. Tim san pham theo khoang gia");
            System.out.println("4. Thong ke so san pham da tao");
            System.out.println("0. Thoat");
            System.out.print("Lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    productManagement.addProduct(sc);
                    break;
                case 2:
                    productManagement.displayProduct(sc);
                    break;
                case 3:
                    productManagement.searchProduct(sc);
                    break;
                case 4:
                    productManagement.totalProduct();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap lai lua chon.");
            }
        } while (true);
    }

    public void addProduct(Scanner sc) {
        System.out.print("Nhap so san pham muon them: ");
        int countProduct = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < countProduct; i++) {
            System.out.printf("Nhap san pham thu %d: \n", i + 1);
            arrProduct[currentProduct] = new Product();
            arrProduct[currentProduct].input(sc);
            currentProduct++;
            count++;
        }
    }

    public void displayProduct(Scanner sc) {
        if (currentProduct == 0) {
            System.out.println("Chua co san pham nao duoc them");
        } else {
            for (int i = 0; i < currentProduct; i++) {
                arrProduct[i].print();
            }
        }
    }

    public void searchProduct(Scanner sc) {
        boolean isFound = false;
        if (currentProduct == 0) {
            System.out.println("Chua co san pham nao duoc them");
        } else {
            System.out.println("Nhap san pham theo khoang gia:");
            System.out.print("Nhap khoang gia thu nhat: ");
            double a = Double.parseDouble(sc.nextLine());
            System.out.print("Nhap khoang gia thu hai: ");
            double b = Double.parseDouble(sc.nextLine());
            for (int i = 0; i < currentProduct; i++) {
                if (arrProduct[i].getPrice() >= a && arrProduct[i].getPrice() <= b) {
                    arrProduct[i].print();
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("Khong tim thay san pham");
            }
        }
    }

    public void totalProduct() {
        if (currentProduct == 0) {
            System.out.println("Chua co san pham nao duoc them");
        }else{
            System.out.printf("So san pham da tao: %d san pham\n", count);
        }
    }
}
