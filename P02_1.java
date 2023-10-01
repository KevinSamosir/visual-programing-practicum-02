import java.util.*;
import java.lang.Math;

class P02_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, aC, lantai, ketersediaanTeknologi, tipe, status;
        int kapasitas, jumlahBuku;
        int skor;

        nama = input.nextLine();
        kapasitas = input.nextInt();
        jumlahBuku = input.nextInt();
        aC = input.nextLine();
        ketersediaanTeknologi = input.nextLine();
        lantai = input.nextLine();
        skor = (int) ((double) jumlahBuku / kapasitas * 100);
        if (skor >= 40) {
            status = "GudangElite";
        } else {
            if (skor >= 25) {
                status = "GedungStandart";
            } else {
                if (skor >= 25) {
                    status = "GedungPerluPeningkatan";
                }
            }
        }
        System.out.println(nama + "|" + aC + "|" + kapasitas + "|" + jumlahBuku + "|" + lantai + "|" + ketersediaanTeknologi + "|" + status);
    }
}
