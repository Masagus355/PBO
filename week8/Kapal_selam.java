package week8;

public class Kapal_selam extends Kapal {
    public String Waktu_selam;
public Kapal_selam(String Nama,String Warna,int HP,String Bahan_bakar,Double Daya_angkut,String Masa_layar,String Waktu_selam){
           super(Nama,Warna,HP,Bahan_bakar,Daya_angkut,Masa_layar);
           this.Waktu_selam=Waktu_selam;
       }
       public String getWaktu_selam(){
           return Waktu_selam;
       }
      
       public void printdetailkapal_selam(){
       System.out.println("Nama: "+super.getNama());
       System.out.println("Warna: "+super.getWarna());
       System.out.println("HorsePower: "+super.getHP());
       System.out.println("Bahan bakar: "+super.getBahan_bakar());
       System.out.println("Daya Angkut: "+super.getDaya_angkut());
       System.out.println("Masa Layar: "+super.getMasa_layar());
       System.out.println("Waktu selam : "+getWaktu_selam());
       }
}