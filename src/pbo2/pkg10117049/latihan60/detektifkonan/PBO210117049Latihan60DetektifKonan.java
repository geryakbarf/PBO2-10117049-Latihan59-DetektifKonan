/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan60.detektifkonan;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menampilkan Tokoh
 * di Anime Conan
 */
public class PBO210117049Latihan60DetektifKonan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TokohUtama conan = new TokohUtama("Conan Edogawa", "Detektif", "Menyelesaikan Kasus", "Detektif Cilik");
        conan.tampil();
        
        TokohUtama ran = new TokohUtama("Ran Mouri", "Ahli Karate", "Menjadi Ahli Karate di Seluruh Jepang", "Siswi SMA");
        ran.tampil();
        
        TokohUtama kogoro = new TokohUtama("Kogoro Mouri", "Detektif Swasta", "Memecahkan kasus", "Detektif Swasta");
        kogoro.tampil();
        
        TokohSampingan heiji = new TokohSampingan("Heiji Hattori", "Detektif SMA", "Temannya Conan");
        heiji.tampil();
        
        TokohSampingan kazuha = new TokohSampingan("Kazuha Tayoma", "Ahli Aikido", "Temannya Ran");
        kazuha.tampil();
    }

}
