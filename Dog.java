public class Dog {
    String name;
    String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "Brown");
        System.out.println("Name: " + dog.name);
        System.out.println("Color: " + dog.color);
    }
}