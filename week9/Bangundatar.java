package week9;

public class Bangundatar{
    private static final double pi =3.14;
    private int panjang;
    private int lebar;
    private int diameter;
    private int sisi;

    public Bangundatar(int sisi){
        this.sisi = sisi;
    }

    public Bangundatar(int panjang,int lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }
    public Bangundatar(int diameter,double pi){
        this.diameter=diameter;
    }
    public int luas(int a){
        return a*a;
    }

    public int luas(int a,int b){
        return a*b;
    }
    public double luas(double diameter,double pi){ 
    return diameter*pi;
    }
    public void methodlingkaran(int diameter){
        System.out.println("->Lingkaran<-");
        System.out.println("Diameter = "+diameter);
        System.out.println("pi = "+pi);
        System.out.println("Luas = " + luas(diameter,pi));
    }
     public void methodpersegi(int sisi){
        System.out.println("->Persegi<-");
        System.out.println("Sisi = "+sisi);
        System.out.println("Luas = " + luas(sisi));
    }
    public void methodpersegi_panjang(int panjang,int lebar){
        System.out.println("->Persegi Panjang<-");
        System.out.println("Panjang = "+panjang);
        System.out.println("leabr = "+lebar);
        System.out.println("Luas = " + luas(panjang,lebar));
    }
}