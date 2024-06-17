/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week11;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author kiagu
 */
public class Week11 {
        static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        static final String url = "jdbc:mysql://127.0.0.1/a112214355";
        static final String username = "root";
        static final String password = "";

        static Connection conn;
        static Statement stmt;
        static ResultSet rs;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scans = new Scanner(System.in);
        int choice=0;
        int subchoice=0;
        System.out.println("Pilih Tabel\n1. Tabel buku\n2. Tabel Penulis");
        choice=scans.nextInt();
        if(choice==1){
            System.out.println("Pilih Query\n1. Insert\n2. Show\n3. Delete");
            subchoice=scans.nextInt();
            if(subchoice==1){
            insert_buku(scans);
            }else if (subchoice == 2) {
                show_buku();
            }else if (subchoice == 3) {
                delete_buku(scans);
            }
        }else if(choice==2){
            System.out.println("Pilih Query\n1. Insert\n2. Show\n3. Delete");
            subchoice=scans.nextInt();
            if(subchoice==1){
            insert_penulis(scans);
            }else if (subchoice == 2) {
                show_penulis();
            } else if (subchoice == 3) {
                delete_penulis(scans);
            }
        }
       }
    //Procedure insert ke tabel buku
 public static void insert_buku(Scanner scans) {
        scans.nextLine();  // Consume newline
        
        System.out.println("Masukkan Judul Buku:");
        String judul_buku = scans.nextLine();
        
        System.out.println("Masukkan Tahun Terbit:");
        int tahun_terbit = scans.nextInt();
        
        System.out.println("Masukkan Stok:");
        int stok = scans.nextInt();
        
        System.out.println("Masukkan ID Penulis:");
        int penulis = scans.nextInt();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO buku (judul_buku, tahun_terbit, stok, penulis) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, judul_buku);
            ps.setInt(2, tahun_terbit);
            ps.setInt(3, stok);
            ps.setInt(4, penulis);
            
            ps.execute();
            
            ps.close();
            stmt.close();
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    } 
    //Procedure insert ke tabel penulis
 public static void insert_penulis(Scanner scans) {
        scans.nextLine();  // Consume newline
        
        System.out.println("Masukkan nama Penulis:");
        String nama_penulis = scans.nextLine();
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO penulis (nama_penulis) VALUES (?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, nama_penulis);
      
            
            ps.execute();
            
            ps.close();
            stmt.close();
            conn.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }  
    
    // Procedure show tabel buku
    public static void show_buku() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM buku";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String judul_buku = rs.getString("judul_buku");
                int tahun_terbit = rs.getInt("tahun_terbit");
                int stok = rs.getInt("stok");
                int penulis = rs.getInt("penulis");

                System.out.println("ID: " + id + ", Judul Buku: " + judul_buku + ", Tahun Terbit: " + tahun_terbit + ", Stok: " + stok + ", Penulis: " + penulis);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Procedure show tabel penulis
    public static void show_penulis() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM penulis";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nama_penulis = rs.getString("nama_penulis");

                System.out.println("ID: " + id + ", Nama Penulis: " + nama_penulis);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Procedure delete dari tabel buku
    public static void delete_buku(Scanner scans) {
        System.out.println("Masukkan ID Buku yang akan dihapus:");
        int id = scans.nextInt();

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();

            String sql = "DELETE FROM buku WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.execute();

            ps.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Procedure delete dari tabel penulis
    public static void delete_penulis(Scanner scans) {
        System.out.println("Masukkan ID Penulis yang akan dihapus:");
        int id = scans.nextInt();

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();

            String sql = "DELETE FROM penulis WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.execute();

            ps.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
 
