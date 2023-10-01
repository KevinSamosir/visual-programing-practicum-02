// 12S23015 - Kevin Samosir
import java.util.*;
import java.lang.Math;

class P02_2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String program, kode, matkul, dosen, tanggal, waktu, rekomendasitugas, namatugas;
        double tingkatkesulitan, harideadline;
        double prioritas;

        program = input.nextLine();
        kode = input.nextLine();
        matkul = input.nextLine();
        dosen = input.nextLine();
        tanggal = input.nextLine();
        waktu = input.nextLine();
        tingkatkesulitan = input.nextDouble();
        harideadline = input.nextDouble();
        prioritas = tingkatkesulitan * (1.0 / harideadline);
        if (prioritas > 3) {
            rekomendasitugas = "penting!anda harus mengarjaka tugas ini segera.";
        } else {
            if (prioritas < 3.0 && prioritas > 1.5) {
                rekomendasitugas = "tugas ini memiliki prioritas menengah";
            } else {
                if (prioritas < 1.5) {
                    rekomendasitugas = "tugas ini relatif ringan, namun jangan terlalu lama>";
                }
            }
        }
        System.out.println("prioritas:" + toFixed(prioritas,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
