package week1;
public class Mahasiswa
{
    String nim,nama;
    int usia;

    public void belajar(){
        System.out.println(nama + " belajar");
    }
    public void main_game(){
        System.out.println(nama + " main game");
    }
    public void getidentitas(){
        System.out.println(nama + " adalah nama dari mahasiswa tersebut");
        System.out.println(nim + " adalah nim dari mahasiswa tersebut");
        System.out.println(usia + " adalah usia dari mahasiswa tersebut");
    }
    public void space(){
        System.out.println("    ");
    }
}