package week5;

public class Matakuliah{
private String nama;
private String kelompok;
private int sks;


public Matakuliah(String nama,String kelompok, int sks){
this.nama= nama;
this.kelompok= kelompok;
this.sks = sks;
}
public String getnamaMatkul(){
    return nama;
}
public String getkelompok(){
    return kelompok;
}
public int getsks(){
    return sks;
}
}