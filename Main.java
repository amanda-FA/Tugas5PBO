import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaksi transaksi = new Transaksi();

        // Login process
        try {
            System.out.println("Log in");
            System.out.println("+------------------------------------------------------------+");

            // Input username dan password
            System.out.print("Username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Password: ");
            String inputPassword = scanner.nextLine();

            // Generate captcha
            Random random = new Random();
            int captcha = random.nextInt(9000) + 1000; // Captcha 4 digit
            System.out.println("Captcha: " + captcha);

            // Input captcha
            System.out.print("Masukkan Captcha: ");
            String inputCaptcha = scanner.nextLine();

            // Validasi login
            transaksi.login(inputUsername, inputPassword, inputCaptcha, String.valueOf(captcha));
            System.out.println("Login berhasil!");

            // Memproses transaksi
            transaksi.processTransaction();

        } catch (LoginFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}