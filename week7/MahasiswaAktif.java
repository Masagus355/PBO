package week7;
import week1.Mahasiswa;

public class MahasiswaAktif extends Mahasiswa{
    public int usia;
    public int semester;
//constructor
    public MahasiswaAktif (String nama,String nim,String tanggal_lahir,int semester){
        super(nama,nim,tanggal_lahir);
        this.semester = semester;
    }
    //getter untuk mahasiswa aktif
    public void getidentitasMA(){
        System.out.println("Nama = " + getnama());
        System.out.println("Nim = " + getnim());
        System.out.println("tanggal lahir = " + getttg_lhr());
        System.out.println("Semester = "+ semester);
    }
}