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
public class Tokoh {
    private String nama;
    private String peran;
    
    public Tokoh(String nama, String peran){
        this.nama=nama;
        this.peran=peran;
    }

    public String getNama() {
        return nama;
    }

    public String getPeran() {
        return peran;
    }
    
}
