package week8;

public class Pesawat_propeller extends Pesawat {
     public String Mesin_piston_propeller;
public Pesawat_propeller(String Nama,String Warna,int HP,String Bahan_bakar,Double Panjang_sayap,String Mesin_piston_propeller){
            super(Nama,Warna,HP,Bahan_bakar,Panjang_sayap);
            this.Mesin_piston_propeller=Mesin_piston_propeller;
        }
        public String getMesin_piston_propeller(){
            return Mesin_piston_propeller;
        }
        @Override
        public void printdetail_kendaraan(){
        System.out.println("Nama: "+super.getNama());
		System.out.println("Warna: "+super.getWarna());
        System.out.println("HorsePower: "+super.getHP());
        System.out.println("Bahan bakar: "+super.getBahan_bakar());
        System.out.println("Panjang Sayap: "+super.getPanjang_sayap());
        System.out.println("Mesin propeller : "+getMesin_piston_propeller());
        }
}