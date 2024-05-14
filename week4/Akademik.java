package week4;
import week1.Mahasiswa;
import java.util.*;

public class Akademik {
    public static void main(String[]args){
        int n;
        System.out.println("Masukkan Jumlah data : ");
        //buat objek dari class scanner untuk menginput data

        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        //buat variabel array dengan tipe mahasiswa
        Mahasiswa[] mhs = new Mahasiswa[n];

        String nim;
        Double ipk;
        String nama;
        int usia;
        

        for(int i=0;i < n;i++){
            System.out.println("Data ke-"+(i+1));
            System.out.print("Masukkan NIM : ");
            nim = inp.next();
            System.out.print("Masukkan IPK : ");
            ipk = inp.nextDouble();
            System.out.print("Masukkan Nama : ");
            nama = inp.next();
            System.out.print("Masukkan Usia : ");
            usia = inp.nextInt();

            mhs[i] = new Mahasiswa( nim, nama,ipk, usia);
        }   
        for(int i= 0; i < n; i++){
            System.out.println("data ke : "+(i+1));
            mhs[i].getidentitas(); 
        }
    }
}