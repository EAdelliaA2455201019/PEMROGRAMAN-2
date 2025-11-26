/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_5_KEYWORD_THIS_PADA_CLASS;

/**
 *
 * @author adellia
 */

public class USER {
    // Mendeklarasikan Variable         
    private String username;
    private String password;
    
    // Konstruktor ditambahkan supaya bisa langsung membuat objek dengan parameter
    public USER(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    // Ini Method Setter
    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    // Ini Method Getter
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void tampilData() {
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
    }
}

class DEMO_USER {
    public static void main(String[] args) {
        USER petani = new USER("petanikode", "kopi");
        petani.tampilData();
    }
}
