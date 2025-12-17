package Session8;

public class kha1 {
    private int id;
    private String name;
    private int age;

    public kha1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        kha1 k1 = new kha1(1, "Jack", 25);
        k1.display();
    }
}
