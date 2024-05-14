package week6;
import java.util.ArrayList;
import java.util.Scanner;
import week6.Mahasiswa;

public class Tagihan{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();

        
        System.out.println("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();

        for (int i=0;i<jumlahMahasiswa;i++){
            System.out.println("Data Mahasiswa ke-" + (i+1) + ":");
            System.out.println("Nama : ");
            String nama = scanner.next();
            System.out.println("Nim : ");
            String nim = scanner.next();
            System.out.println("Semester: ");
            int Semester = scanner.nextInt();
            System.out.println("sks: ");
            int sks = scanner.nextInt();

            Mahasiswa mahasiswa =  new Mahasiswa(nama,nim,Semester,sks);
            mahasiswas.add(mahasiswa);
        }
        System.out.println("\nData Mahasiswa : ");
        for (Mahasiswa mahasiswa : mahasiswas){
            System.out.println(mahasiswa.toString());
            System.out.println("Tagihan : "+ mahasiswa.hitungTagihan()+" Rupiah");
        }
    }
}