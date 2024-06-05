package week8;

public class Pesawat_jet extends Pesawat {
     public String Mesin_jet;
public Pesawat_jet(String Nama,String Warna,int HP,String Bahan_bakar,Double Panjang_sayap,String Mesin_jet){
            super(Nama,Warna,HP,Bahan_bakar,Panjang_sayap);
            this.Mesin_jet=Mesin_jet;
        }
        public String getMesin_jet(){
            return Mesin_jet;
        }
        @Override
        public void printdetail_kendaraan(){
        System.out.println("Nama: "+super.getNama());
		System.out.println("Warna: "+super.getWarna());
        System.out.println("HorsePower: "+super.getHP());
        System.out.println("Bahan bakar: "+super.getBahan_bakar());
        System.out.println("Panjang Sayap: "+super.getPanjang_sayap());
        System.out.println("Mesin jet : "+getMesin_jet());
        }
}