package week8;

public class Kapal extends Kendaraan{
     public Double Daya_angkut;
     public String Masa_layar;
        public Kapal(String Nama,String Warna,int HP,String Bahan_bakar,Double Daya_angkut,String Masa_layar){
            super(Nama,Warna,HP,Bahan_bakar);
            this.Daya_angkut=Daya_angkut;
            this.Masa_layar=Masa_layar;
        }
        public Double getDaya_angkut(){
            return Daya_angkut;
        }
        public String getMasa_layar(){
            return Masa_layar;
        }

        @Override
        public void printdetail_kendaraan(){
		System.out.println("Nama: "+super.getNama());
		System.out.println("Warna: "+super.getWarna());
        System.out.println("HorsePower: "+super.getHP());
        System.out.println("Bahan bakar: "+super.getBahan_bakar());
        System.out.println("Daya angkut: " + getDaya_angkut());
        System.out.println("Masa Layar : "+ getMasa_layar());
	}
}