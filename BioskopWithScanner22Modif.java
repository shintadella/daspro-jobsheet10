import java.util.Scanner;

public class BioskopWithScanner22Modif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] tempatPenonton = new String[4][2];

        
        for (int i = 0; i < tempatPenonton.length; i++) {
            for (int j = 0; j < tempatPenonton[i].length; j++) {
                tempatPenonton[i][j] = "***";
            }
        }

        while (true) {
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan baris: ");
            int baris = input.nextInt();

            System.out.print("Masukkan kolom: ");
            int kolom = input.nextInt();
            input.nextLine();

            if (baris < 1 || baris > tempatPenonton.length || kolom < 1 || kolom > tempatPenonton[0].length) {
                System.out.println("Baris atau kolom tidak valid. Silakan masukkan kembali.");
                continue;
            }

            if (tempatPenonton[baris - 1][kolom - 1].equals("-")) {
                tempatPenonton[baris - 1][kolom - 1] = nama;
                System.out.println("Kursi berhasil dipesan.");
            } else {
                System.out.println("Maaf, kursi sudah terisi. Silakan pilih kursi lain.");
            }

            System.out.print("Input penonton lainnya? (y/n): ");
            String next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("\nTampilan Tempat Duduk : ");
        for (int i = 0; i < tempatPenonton.length; i++) {
            for (int j = 0; j < tempatPenonton[i].length; j++) {
                System.out.print(tempatPenonton[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
