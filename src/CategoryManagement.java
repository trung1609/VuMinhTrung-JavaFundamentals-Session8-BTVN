import java.util.Scanner;

public class CategoryManagement implements ICRUD {
    Category[] categories = new Category[100];
    int currentIndex = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CategoryManagement categoryManagement = new CategoryManagement();
        do {
            System.out.println("**************MENU**************");
            System.out.println("1. Them danh muc");
            System.out.println("2. Hien thi danh muc");
            System.out.println("3. Cap nhat danh muc");
            System.out.println("4. Xoa danh muc");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Category category = new Category();
                    System.out.print("Nhap ID danh muc: ");
                    category.setId(Integer.parseInt(sc.nextLine()));
                    System.out.print("Nhap ten danh muc: ");
                    category.setName(sc.nextLine());
                    System.out.print("Nhap mo ta danh muc: ");
                    category.setDescription(sc.nextLine());
                    categoryManagement.addCategory(category);
                    break;
                case 2:
                    Category[] list = categoryManagement.findAll();
                    if (categoryManagement.currentIndex == 0) {
                        System.out.println("Chua co danh muc");
                    } else {
                        for (int i = 0; i < categoryManagement.currentIndex; i++) {
                            System.out.println("ID: " + list[i].getId() + ", Name: " + list[i].getName() + ", Description: " + list[i].getDescription());
                        }
                    }
                    break;
                case 3:
                    if (categoryManagement.currentIndex == 0) {
                        System.out.println("Chua co danh muc");
                    } else {
                        categoryManagement.updateCategory(sc);
                    }
                    break;
                case 4:
                    if (categoryManagement.currentIndex == 0) {
                        System.out.println("Chua co danh muc");
                    } else {
                        System.out.print("Nhap ID danh muc can xoa: ");
                        int catalogId = Integer.parseInt(sc.nextLine());
                        categoryManagement.deleteById(catalogId);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-5");
            }
        } while (true);
    }

    @Override
    public Category[] findAll() {
        return categories;
    }

    @Override
    public void addCategory(Category category) {
        categories[currentIndex] = category;
        currentIndex++;
        System.out.println("Danh muc da duoc them");
    }

    public int checkID(int id) {
        for (int i = 0; i < currentIndex; i++) {
            if (categories[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void updateCategory(Category category) {
        int index = checkID(category.getId());
        if (index == -1) {
            System.err.println("Ma danh muc khong ton tai.");
            return;
        }
        categories[index].setName(category.getName());
        categories[index].setDescription(category.getDescription());

    }

    public void updateCategory(Scanner sc){
        System.out.println("Nhap ID danh muc can cap nhat: ");
        int catalogID = Integer.parseInt(sc.nextLine());
        int indexUpdate = checkID(catalogID);
        if (indexUpdate == -1) {
            System.err.println("Khong tim thay danh muc");
            return;
        }
        categories[indexUpdate].setId(catalogID);
        System.out.print("Nhap ten moi: ");
        categories[indexUpdate].setName(sc.nextLine());
        System.out.print("Nhap mo ta moi: ");
        categories[indexUpdate].setDescription(sc.nextLine());
        System.out.println("Danh muc da duoc cap nhat");
    }

    @Override
    public void deleteById(int id) {
        int index = checkID(id);
        if (index == -1) {
            System.err.println("Danh muc khong ton tai.");
            return;
        }
        for (int i = index; i < currentIndex - 1; i++) {
            categories[i] = categories[i + 1];
        }
        currentIndex--;
        System.out.println("Danh muc da duoc xoa thanh cong");
    }
}
