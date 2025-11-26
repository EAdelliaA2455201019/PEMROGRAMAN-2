/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_6_CONSTRUKTOR;

/**
 *
 * @author adellia
 */
public class USER {
    // modifier
    private String username;
    private String password; 

    public USER(){
        System.out.println("ekseusi method construktor...");
    }
}

class DEMO_CONSTRUKTOR {

    public static void main(String[] args) {
       USER petani = new USER();
    }
}