/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_7_POLIMORFISME_DINAMIS;

/**
 *
 * @author adellia
 */
public class LINGKARAN extends BANGUN_DATAR {
    int r ;
    
    public LINGKARAN (int r){
        this.r =r;
    }
    
    @Override
    public float luas(){
        return (float) Math.PI * r * r ;
    }
    
    @Override
    public float keliling(){
        return (float) (2* Math.PI * r) ;
    }
}
