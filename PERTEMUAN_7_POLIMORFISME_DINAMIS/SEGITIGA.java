/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_7_POLIMORFISME_DINAMIS;

/**
 *
 * @author adellia
 */
public class SEGITIGA extends BANGUN_DATAR {
    int alas ;
    int tinggi ;
    
    public SEGITIGA(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public float luas(){
        return (1/2 * this.alas) * this.tinggi;
    }
}
