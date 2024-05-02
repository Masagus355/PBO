package inheritance;
import java.util.Scanner;
public class Student extends Person{
	String nim;
	public Student(String nama,String address, String nim,String hobby) {
		super(nama,address,hobby);
		this.nim = nim;
	}
	public String getNim()
	{
		return nim;
	}
	
	@Override
	public void identity(){
		System.out.println("NIM: "+getNim());
		System.out.println("Nama: "+super.nama);
		System.out.println("Alamat: "+super.address);
	}
	public void hobi(){
		System.out.println("hobi: "+super.hobby);
	}
	// Method to calculate the total payment of the student
    public void hitungPembayaran() {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for SPP, SKS, and Modul fees
        System.out.print("Masukkan biaya SPP: ");
        double spp = scanner.nextDouble();

        System.out.print("Masukkan biaya SKS: ");
        double sks = scanner.nextDouble();

        System.out.print("Masukkan biaya Modul: ");
        double modul = scanner.nextDouble();

        // Calculate the total payment
        double totalPayment = spp + sks + modul;

        // Print the total payment
        System.out.println("Total Pembayaran: " + totalPayment);
        
        // Close the scanner if you're done with it
        scanner.close();
    }
		
}