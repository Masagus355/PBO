package week8;

public class Pesawat extends Kendaraan {
     public Double Panjang_sayap;
public Pesawat(String Nama,String Warna,int HP,String Bahan_bakar,Double Panjang_sayap){
            super(Nama,Warna,HP,Bahan_bakar);
            this.Panjang_sayap=Panjang_sayap;
        }
        public Double getPanjang_sayap(){
            return Panjang_sayap;
        }

        public void takeoff(){
            System.out.println("Pesawat takeoff");
        }
        public void printdetail_Pesawat(){
            System.out.println("Nama = " + super.getNama());
            System.out.println("Warna = " + super.getWarna());
            System.out.println("HorsePower = " + super.getHP());
            System.out.println("Bahan_bakar = "+ super.getBahan_bakar());
            System.out.println("Panjang Sayap = "+ getPanjang_sayap());
        }
}