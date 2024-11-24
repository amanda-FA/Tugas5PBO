// Custom exception untuk login gagal
public class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
}