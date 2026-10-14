import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    double nilai;

    public void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
    }

    public void cekKelulusan() {
        if (nilai >= 60) 
        { System.out.println("Status: Lulus"); } 
        else
        { System.out.println("Status: Tidak Lulus"); }
        System.out.println("-----------------------------------");
    }
}

public class miniproject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jmlh_mhs = 3;
        Mahasiswa[] mhs = new Mahasiswa[jmlh_mhs];

        System.out.println("=== Input Data Mahasiswa ===");
        
        for (int i = 0; i < jmlh_mhs; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            
            mhs[i] = new Mahasiswa();

            System.out.print("Nama  : ");
            mhs[i].nama = input.nextLine();

            System.out.print("NIM   : ");
            mhs[i].nim = input.nextLine();

            System.out.print("Nilai : ");
            String strNilai = input.nextLine();
            mhs[i].nilai = Double.parseDouble(strNilai);
        }

        System.out.println("\n-----------------------------------");
        System.out.println("    Daftar Kelulusan Mahasiswa     ");
        System.out.println("-----------------------------------");
        
        for (int i = 0; i < jmlh_mhs; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            mhs[i].tampilkanData();
            mhs[i].cekKelulusan();
        }
        input.close();
    }
}