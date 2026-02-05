import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";

        System.out.println("🔐 Password Generator developer by Monty");

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        String password = "";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password += characters.charAt(index);
        }

        System.out.println("Generated Password: " + password);
    }
}
