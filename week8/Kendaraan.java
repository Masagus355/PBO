package week8;

public class Kendaraan{
    public String Nama;
    public String Warna;
    public int HP;
    public String Bahan_bakar;

    public Kendaraan(String Nama,String Warna,int HP,String Bahan_bakar){
        this.Nama= Nama;
        this.Warna= Warna;
        this.HP=HP;
        this.Bahan_bakar=Bahan_bakar;
    }
    public String getNama(){
        return Nama;
    }
    public String getWarna(){
        return Warna;
    }
    public int getHP(){
        return HP;
    }
    public String getBahan_bakar(){
        return Nama;
    }
    public void printdetail_kendaraan(){
        System.out.println("Nama = " + Nama);
        System.out.println("Warna = " + Warna);
        System.out.println("HorsePower = " + HP);
        System.out.println("Bahan_bakar = "+ Bahan_bakar);
    }
}
