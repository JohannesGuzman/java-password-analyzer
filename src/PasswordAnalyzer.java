import java.util.Scanner;

public class PasswordAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password:");
        String password = scanner.nextLine();

        int score = 0;

        if (password.length() >= 8) {
            System.out.println("Length: OK");
            score++;
        } else {
            System.out.println("Length: Too short");
        }

        if (password.matches(".*[A-Z].*")) {
            System.out.println("Uppercase: OK");
            score++;
        } else {
            System.out.println("Uppercase: Missing");
        }

        if (password.matches(".*[0-9].*")) {
            System.out.println("Numbers: OK");
            score++;
        } else {
            System.out.println("Numbers: Missing");
        }

        if (password.matches(".*[!@#$%^&*()].*")) {
            System.out.println("Special characters: OK");
            score++;
        } else {
            System.out.println("Special characters: Missing");
        }

        System.out.println("\nStrength score: " + score + "/4");

        if (score == 4) {
            System.out.println("Security level: Strong");
        } else if (score == 3) {
            System.out.println("Security level: Medium");
        } else {
            System.out.println("Security level: Weak");
        }

        scanner.close();
    }
}