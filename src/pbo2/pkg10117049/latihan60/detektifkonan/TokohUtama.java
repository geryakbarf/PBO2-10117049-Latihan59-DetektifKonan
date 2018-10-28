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
public class TokohUtama extends Tokoh {
    private String tujuan;
    private String tim;
    

    public TokohUtama(String nama, String peran,String tujuan, String tim ) {
        super(nama, peran);
        this.tujuan=tujuan;
        this.tim=tim;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getTim() {
        return tim;
    }
    
    public void tampil(){
        System.out.println("Nama : "+getNama());
        System.out.println("Peran : "+getPeran());
        System.out.println("Tim : "+getTim());
        System.out.println("Tujuan : "+getTujuan());
        System.out.println("");
    }
}
