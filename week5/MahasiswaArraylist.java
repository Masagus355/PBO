package week5;
import week1.Mahasiswa;
import java.util.*;

public class MahasiswaArraylist{
    public static void main (String[]args){
       
     
        Mahasiswa mhs =new Mahasiswa("14355","Kiagus");
        mhs.insertNilai(99.0);
        mhs.insertNilai(82.0);
        mhs.insertNilai(65.0);
        mhs.insertNilai(55.0);
        mhs.insertNilai(80.0);
        mhs.insertMatkul("PBO","A11.4444",4);
        mhs.getidentitas();
    }
}