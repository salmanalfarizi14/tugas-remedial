import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan suhu dalam Celsius
        System.out.print("Masukkan suhu dalam Celsius:30 ");
        double celsius = input.nextDouble();

        // Menghitung suhu dalam Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Menampilkan hasil konversi
        System.out.printf("Suhu dalam Fahrenheit: 86.00°F\n", fahrenheit);

        // Menutup scanner
        input.close();
    }
}
