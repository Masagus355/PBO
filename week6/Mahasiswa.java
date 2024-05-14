package week6;
import java.util.ArrayList;
import java.util.Scanner;
public class Mahasiswa{
    private String nama;
    private String nim;
    private int semester;
    private int sks;
    private int spp;

    //getter
    public Mahasiswa(String nama,String nim, int semester, int sks){
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.sks = sks;
        this.setSpp();
    }
//setter
    private void setSpp(){
        if(semester < 2 ){
            this.spp = 3000000;
        }
        else if(semester >=3 && semester <=6){
            this.spp = 2900000;
        }
        else {
            this.spp = 2750000;
        }
    }
    public int hitungTagihan(){
        int biayaSks;
        if(semester < 2){
            biayaSks = 300000;
        }
        else if(semester >=3 && semester <=6){
            biayaSks = 275000;
        }
        else{
            biayaSks = 250000;
        }
        return sks * biayaSks + spp;
    }

    public String toString(){
        return "Nama: " + nama + ", NIM: " + nim + ", Semester: " + semester + ", sks : " + sks ;
    }
}
