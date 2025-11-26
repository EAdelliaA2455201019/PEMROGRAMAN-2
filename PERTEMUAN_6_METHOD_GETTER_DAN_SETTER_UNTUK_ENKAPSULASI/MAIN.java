/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN_6_METHOD_GETTER_DAN_SETTER_UNTUK_ENKAPSULASI;

/**
 *
 * @author adellia
 */
public class MAIN {
    public static void main(String[] args) {
        // membuat objek dari class USER.
        USER dian = new USER();
       
        // menggunakan method setter.
        dian.setUsername("dian");
        dian.setPassword("kopijava");
        
        // menggunakan method getter
        System.out.println("Username: " + dian.getUsername());
        System.out.println("Password: " + dian.getPassword());
    }  
}
