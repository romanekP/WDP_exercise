import java.util.Scanner;

public class WDP_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your lastname: ");
        String lastname = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 21) {
            System.out.println(name + " " + lastname + " You're too young to enter :-(");
        } else {
            System.out.println(name + " " + lastname + " You can enter!");
        }


    }
}