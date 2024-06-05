package week9;

public class Bangunruang {
    private int sisi;
    private int lebar;
    private int panjang;
    private int tinggi;

    public Bangunruang(int sisi){
        this.sisi=sisi;
    }
    public Bangunruang(int lebar,int panjang,int tinggi){
        this.tinggi=tinggi;
        this.lebar=lebar;
        this.panjang=lebar;
    }
    public int luas(int a){
        return 6*(a*a);
    }
    public int luas(int a,int b,int c){
        return ((a*b)+(a*c)+(b*c))*2;
    }
  public void methodKubus(int sisi){
    System.out.println("->Kubus<-");
    System.out.println("Sisi ="+sisi);
    System.out.println("Rumus luas Kubus = 6xs^2");
    System.out.println("Jadi = 6x"+sisi+"^2");
    System.out.println("Hasil Luas Kubus = "+luas(sisi));
  }
  public void methodbalok(int panjang,int lebar,int tinggi){
    System.out.println("->Balok<-");
    System.out.println("Panjang ="+panjang);
    System.out.println("Lebar ="+lebar);
    System.out.println("Tinggi ="+tinggi);
    System.out.println("Rumus luas Balok = 2x((pxl)+(pxt)+(lxt))");
    System.out.println("Jadi = 2x(("+panjang+"x"+lebar+")+("+panjang+"+"+tinggi+")+("+lebar+"x"+tinggi+"))");
    System.out.println("Luas Balok = "+luas(panjang,lebar,tinggi));
  }
}
