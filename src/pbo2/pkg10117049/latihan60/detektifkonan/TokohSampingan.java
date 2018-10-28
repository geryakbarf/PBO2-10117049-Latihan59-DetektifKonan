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
public class TokohSampingan extends Tokoh{

    private String relasi;
    
    public TokohSampingan(String nama, String peran, String relasi) {
        super(nama, peran);
        this.relasi=relasi;
    }

    public String getRelasi() {
        return relasi;
    }
    
    public void tampil(){
        System.out.println("Nama : "+getNama());
        System.out.println("Peran : "+getPeran());
        System.out.println("Relasi dengan Tokoh Utama : "+getRelasi());
        System.out.println("");
    }
    
}
