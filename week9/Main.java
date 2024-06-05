package week9;

public class Main{

    public static void main (String[]args){
        System.out.println("================================");
        Bangundatar build = new Bangundatar(0);
        System.out.println("----------Bangun Datar----------");
        System.out.println("================================");
        build.methodlingkaran(2); 
        System.out.println("--------------------------------");
        build.methodpersegi(5);
        System.out.println("--------------------------------");
        build.methodpersegi_panjang(4,6);
        System.out.println("================================");
        Bangunruang builds = new Bangunruang(0);
        System.out.println("----------Bangun Ruang----------");
        System.out.println("================================");
        builds.methodKubus(5);
        System.out.println("--------------------------------");
        builds.methodbalok(2, 3, 5);
        System.out.println("================================");
    }
}