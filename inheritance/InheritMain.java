package inheritance;
import java.util.Scanner;
public class InheritMain {
    public static void main (String[]args){
        Scanner scans = new Scanner(System.in);
        
            System.out.println("Nama : ");
            String nama = scans.next();
            System.out.println("Nim : ");
            String nim = scans.next();
            System.out.println("Address: ");
            String address = scans.next();
            System.out.println("Hobi: ");
            String hobby = scans.next();
            Student std = new Student(nama,nim,address,hobby);
            std.identity();
            std.hobi();
            std.hitungPembayaran();
    }
}
