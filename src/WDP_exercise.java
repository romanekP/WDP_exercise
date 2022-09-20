import java.util.Scanner;

public class WDP_exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = scanner.next();
        System.out.println("Enter your Lastname: ");
        String lastname = scanner.next();
        System.out.println("Enter your Age: ");
        int Age = scanner.nextInt();
        if (Age < 21) {
            System.out.println(name + " " + lastname +
                    "You're too young to enter :-(");
        }
        if (Age==21){
            System.out.println(name + " " + lastname +
                    " Congratulations! Barely, barely... ");
        }
        else {
            System.out.println(name + " " + lastname + " You can enter!");
        }


    }
}
