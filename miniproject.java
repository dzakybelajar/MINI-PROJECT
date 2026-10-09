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
        
        int jumlahMahasiswa = 3;
        Mahasiswa[] daftarMhs = new Mahasiswa[jumlahMahasiswa];

        System.out.println("=== INPUT DATA MAHASISWA ===");
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i + 1));
            
            daftarMhs[i] = new Mahasiswa();

            System.out.print("Nama  : ");
            daftarMhs[i].nama = input.nextLine();

            System.out.print("NIM   : ");
            daftarMhs[i].nim = input.nextLine();

            System.out.print("Nilai : ");
            String strNilai = input.nextLine();
            daftarMhs[i].nilai = Double.parseDouble(strNilai);
        }

        System.out.println("\n===================================");
        System.out.println("      DAFTAR KELULUSAN MAHASISWA     ");
        System.out.println("===================================");
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            daftarMhs[i].tampilkanData();
            daftarMhs[i].cekKelulusan();
        }
        input.close();
    }
}