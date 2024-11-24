import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Subclass untuk transaksi yang mewarisi LoginSystem
public class Transaksi extends Login {
    public void processTransaction() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Tampilkan tanggal dan waktu
            Date date = new Date();
            SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yy");
            SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");

            System.out.println("+------------------------------------------------------------+");
            System.out.println("Selamat Datang di Supermarket KamekShop");
            System.out.println("Tanggal dan Waktu : " + dateFormatter.format(date) + " " + timeFormatter.format(date));
            System.out.println("+------------------------------------------------------------+");

            // Input Nama Kasir
            System.out.print("Nama Kasir: ");
            String namaKasir = scanner.nextLine();

            // Input No Faktur
            System.out.print("No. Faktur: ");
            String noFaktur = scanner.nextLine();
            if (noFaktur.isEmpty()) {
                throw new InvalidTransactionException("No. Faktur tidak boleh kosong!");
            }

            // Input Kode Barang
            System.out.print("Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            // Input Nama Barang
            System.out.print("Nama Barang: ");
            String namaBarang = scanner.nextLine();

            // Input Harga Barang
            System.out.print("Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            // Input Jumlah Beli
            System.out.print("Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();
            if (jumlahBeli <= 0) {
                throw new InvalidTransactionException("Jumlah beli tidak boleh kurang dari 0.");
            }

            // Hitung total
            double total = hargaBarang * jumlahBeli;

            // Tampilkan hasil transaksi
            System.out.println("+------------------------------------------------------------+");
            System.out.println("TOTAL       : Rp " + total);
            System.out.println("+------------------------------------------------------------+");
            System.out.println("Kasir       : " + namaKasir);
            System.out.println("+------------------------------------------------------------+");

        } catch (InvalidTransactionException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input. Silakan ulangi!");
        }
    }
}