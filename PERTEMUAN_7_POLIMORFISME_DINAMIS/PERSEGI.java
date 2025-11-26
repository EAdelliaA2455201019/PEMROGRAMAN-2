/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_7_POLIMORFISME_DINAMIS;

/**
 *
 * @author adellia
 */
// class anak
public class PERSEGI extends BANGUN_DATAR {
  int sisi ;
  
  public PERSEGI (int sisi){
      this.sisi = sisi;
  }
  
  // menggunakan method yang sama dengan induk, pakai override.
 @Override
    public float luas() {
        return this.sisi * this.sisi;
    }

    @Override
    public float keliling() {
        return this.sisi * 4;
    }
}