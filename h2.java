import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        int age;
        Scanner age = new Scanner(System.in);

        System.out.print("Enter your age: ");
        age.nextInt();

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }
    }
}
