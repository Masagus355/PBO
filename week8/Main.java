package week8;

public class Main {
    public static void main(String[] args) {
        System.out.println("================================");
        Kendaraan K = new Kendaraan("Calya","Merah",120,"bensin");
        K.printdetail_kendaraan();
        System.out.println("================================");
        Pesawat KP = new Pesawat("Supermarine Spitfire","Hijau Zaitun",1470,"Avgas",11.23);
        KP.takeoff();
        KP.printdetail_Pesawat();
        System.out.println("--------------------------------");
        Pesawat_jet KPJ = new Pesawat_jet("Chengdu J-20 Mighty Dragon","Abu-Abu gelap",38800,"Jet fuel",13.5,"WS-10C");
        KPJ.printdetail_kendaraan();
        System.out.println("================================");
        Kapal KK = new Kapal("RMS Titanic","Putih dan hitam",46000,"Batubara",3.547,"4 hari sebelum tenggelam");
        KK.printdetail_kendaraan();
        System.out.println("--------------------------------");
        Kapal_selam KKS = new Kapal_selam("USS Virginia(SSN-774)","cemani(hitam)",40000,"nuklir",134.0,"tanpa batas","tanpa batas");
        KKS.printdetailkapal_selam();
    }
}
