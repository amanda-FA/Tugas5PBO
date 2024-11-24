// Custom exception untuk transaksi yang tidak valid
public class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}