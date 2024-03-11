package week1_A;

public class Assignment2_method {
    int diameterL=10,alasSegitigaSS=6,tinggiSegitigaSS=8,diameterT=5,tinggiT=10;

    // Method untuk menghitung keliling lingkaran
    public double hitungKelilingLingkaran() {
        double keliling = Math.PI * diameterL;
        return keliling;
    }

    // Method untuk menghitung luas segitiga siku-siku
    public double hitungLuasSegitigaSS() {
        double luas = (alasSegitigaSS * tinggiSegitigaSS) / 2.0;
        return luas;
    }
    
    // Method untuk menghitung volume tabung
    public double hitungVolumeTabung() {
        double volume = Math.PI * Math.pow((diameterT / 2.0), 2) * tinggiT;
        return volume;
    }
}

