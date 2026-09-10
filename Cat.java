public class Cat {
    String name;
    int age;

    public Cat() {
        name = "Unknown";
        age = 0;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println("Name: " + cat.name);
        System.out.println("Age: " + cat.age);
    }
}