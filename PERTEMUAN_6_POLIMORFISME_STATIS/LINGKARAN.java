/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_6_POLIMORFISME_STATIS;

/**
 *
 * @author adellia
 */

// Polimorfisme: prinsip di mana class dapat memiliki banyak "bentuk" method yang berbeda-beda meskipun namanya sama.
// "bentuk": isinya beda, parameter beda, dan tipe data beda.


public class LINGKARAN {
    // method menghitung luas dengan jari-jari.
    // method overloading terjadi pada sebuah class yang memiliki parameter dan tipe data yang berbeda.
    float luas (float r){
        return (float) (Math.PI*r*r);
    }
    
    // method menghitung luas dengan diameter.
    double luas (double d){
        return (double) (Math.PI*d*1/4);
    }
    
    public static void main(String[] args) {
        LINGKARAN L = new LINGKARAN();
        
        float r = 10;
        double d = 20;
        
        System.out.println("Luas Lingkaran Dengan Jari-Jari = " + L.luas(r));
        System.out.println("Luas Lingkaran Dengan Diameter = " + L.luas(d));
    }
}
