package week8;

public class Kapal_feri extends Kapal {
    public int Kapasitas_penumpang;
public Kapal_feri(String Nama,String Warna,int HP,String Bahan_bakar,Double Daya_angkut,String Masa_layar,int Kapasitas_penumpang){
           super(Nama,Warna,HP,Bahan_bakar,Daya_angkut,Masa_layar);
           this.Kapasitas_penumpang=Kapasitas_penumpang;
       }
       public int getKapasitas_penumpang(){
           return Kapasitas_penumpang;
       }
    
       public void printdetailkapal_feri(){
       System.out.println("Nama: "+super.getNama());
       System.out.println("Warna: "+super.getWarna());
       System.out.println("HorsePower: "+super.getHP());
       System.out.println("Bahan bakar: "+super.getBahan_bakar());
       System.out.println("Daya Angkut: "+super.getDaya_angkut());
       System.out.println("Masa Layar: "+super.getMasa_layar());
       System.out.println("Kapasitas Penumpang : "+getKapasitas_penumpang());
       }
}