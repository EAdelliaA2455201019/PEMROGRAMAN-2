/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_6_METHOD_GETTER_DAN_SETTER_UNTUK_ENKAPSULASI;

/**
 *
 * @author adellia
 */

// Enkapsulasi: data dibungkus dengan modifier private agar tidak bisa diakses secara langsunfg dari luar class. 
// Alasan menggunakan method setter dan getter: 
    // 1. meningkatkan keamanan data. (karena terbungkus dalam method)
    // 2. agar lebih mudah dalam mengontrol atribut dan method.
    // 3. class bisa kita buat menjadi read-only dan write-only.
    // 4. fleksibel.
public class USER {
    // modifier 
    // membuat kedua atribut tidak bisa diakses langsung dari luar class, sehingga wajib lewat setter/getter.
    private String username;
    private String password;
    
    // Ini Method Setter
    // Method setUsername digunakan untuk memberikan nilai baru pada atribut username.
    public void setUsername (String username){
        // this.username merujuk pada atribut class.
        // parameter username adalah nilai yang diterima dari luar.
        this.username = username;
    }
    
    public void setPassword (String password){
        this.password = password;
    }
    
    // Ini Method Getter
    // Method getUsername digunakan untuk mengambil nilai username.
    public String getUsername(){
        return this.username;
    }
    
    public String getPassword(){
        return this.password;
    }
}
