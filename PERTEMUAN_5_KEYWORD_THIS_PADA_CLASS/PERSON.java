/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_5_KEYWORD_THIS_PADA_CLASS;

/**
 *
 * @author adellia
 */
public class PERSON {
    private String name;
    
    public void setName(String name){
        // Kata kunci this digunakan untuk referensi dari class itu sendiri.
        // this yang dimaksud disini adalah class PERSON, akan mengambil variable yang ada di class PERSON, yaitu String name.
        // Variable name akan mengambil variable yang ada di parameter method setName.
        // Kita tidak bisa menggunakan this di luar class.
        // this hanya bisa digunakan di dalam class saja.
        // Jika kita buat this di daam main, yang terjadi yaitu "non-static variable this cannot be referenced from a static contex".
        this.name = name;
    }
}

