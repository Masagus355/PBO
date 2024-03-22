package week2;

public class Inputkrs {
    public static void main(String[] args) {
        Krs krs1 = new Krs();
        krs1.setMataKuliah("Pemograman Web", 0);
        krs1.setMataKuliah("PBO", 1);
        krs1.setMataKuliah("Dasar Pemograman", 2);
        krs1.setSks(3, 0);
        krs1.setSks(4, 1);
        krs1.setSks(2, 2);
        krs1.infoKrs();
    }
}
