import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elmas boyutunu girin (tek sayı olmalıdır):");
        int boyut = scanner.nextInt();

        if (boyut % 2 == 0) {
            System.out.println("Lütfen tek bir sayı girin.");
            return;
        }

        int yarimBoyut = (boyut + 1) / 2;

        // Üst kısmı oluştur
        for (int i = 1; i <= yarimBoyut; i++) {
            for (int j = 1; j <= yarimBoyut - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısmı oluştur
        for (int i = yarimBoyut - 1; i >= 1; i--) {
            for (int j = 1; j <= yarimBoyut - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
