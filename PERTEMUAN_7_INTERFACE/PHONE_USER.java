/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_7_INTERFACE;

/**
 *
 * @author adellia
 */
// membuat objek PHONE_USER bisa menggunakan objek handphone apapun.
// syarat: objek handphone harus mengimpementasikan method dari interface PHONE.
// larangan dalam interface:
// jangan buat variabel di dalam interface, tapi jika membuat konstanta diperbolehkan.
// jangan mengisi method, cukup tuliskan nama method, tipe data, dan parameter saja.
// jangan beri modifier private atau protected pada method dan konstanta yang ada di dalam interfae.
// Interface tidak bisa dibuat objek instancenya dengan kata  kunci new.
public class PHONE_USER {
    private PHONE phone;
    // Konstruktor
    // Variabel PHONE, phone parameter.
    public PHONE_USER (PHONE phone){
        // Objek yang didapat dari interface.
        this.phone = phone;
    }
    
    void turnOnThePhone(){
        this.phone.powerOn ();
    }
    
    void turnOffThePhone(){
        this.phone.powerOff();
    }
    
    void makePhoneLouder(){
        this.phone.volumeUp();
    }
    
    void makePhoneSilent(){
        this.phone.volumeDown();
    }
}
