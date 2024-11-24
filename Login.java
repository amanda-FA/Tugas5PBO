// Superclass untuk login
public class Login {
    private final String USERNAME = "BukaToko";
    private final String PASSWORD = "TokoSkincareManda111";

    public void login(String inputUsername, String inputPassword, String inputCaptcha, String generatedCaptcha) throws LoginFailedException {
        if (!inputUsername.equals(USERNAME) || !inputPassword.equals(PASSWORD)) {
            throw new LoginFailedException("Login gagal, username atau password salah.");
        }
        if (!inputCaptcha.equals(generatedCaptcha)) {
            throw new LoginFailedException("Login gagal, captcha salah.");
        }
    }
}