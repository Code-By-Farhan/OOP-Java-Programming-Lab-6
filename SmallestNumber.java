import java.util.Scanner;

public class SmallestNumber {
    public static double findSmallest(double a, double b, double c) {
        double smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Input the Second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Input the third number: ");
        double num3 = sc.nextDouble();

        double result = findSmallest(num1, num2, num3);
        System.out.println("The smallest value is " + result);
    }
}