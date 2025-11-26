/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_7_INTERFACE;

/**
 *
 * @author adellia
 */
// mengimplementasikan seluruh method yang ada pada class PHONE.
public class XIAOMI implements PHONE{
    
    // int volume untuk menampung volume saat ini.
    private int volume;
    private boolean isPowerOn;
    
    // membuat constructor
    public XIAOMI (){
        this.volume = 50;
    }
    
    @Override
    public void powerOn() {
        isPowerOn  = true;
        System.out.println("Handphone Menyala...");
        System.out.println("Selamat datang di XIAOMI PHONE");
        System.out.println("Android Version 100");
    }
    
    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone Dimatikan");
    }

    @Override
    public void volumeUp() {
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume FULL");
                System.out.println("Sudah " + this.getVolume()+"%");
            }else{
                this.volume+= 10;
                System.out.println("Volume Sekarang: " + this.getVolume());
            }
        }else{
            System.out.println("Nyalakan Dulu HP-nya Bro...!!!");
        }
    }

    @Override
    public void volumeDown() {
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume Sudah Mentok Paling Rendah");
                System.out.println("Sudah " + this.getVolume()+"%");
            }else{
                this.volume-= 10; // ← ini yang diperbaiki (sebelumnya += 10)
                System.out.println("Volume Sekarang: " + this.getVolume());
            }
        }else{
            System.out.println("Nyalakan Dulu HP-nya Bro...!!!");
        }
    }

    public int getVolume(){
        return this.volume;
    }
}
