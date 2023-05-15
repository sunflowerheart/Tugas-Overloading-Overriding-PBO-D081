/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;


public class Sedan {
    String murah;
    String menengah; 
    String mahal;
    
    public Sedan (String murah, String menengah, String mahal)
    {
        this.murah = murah;
        this.menengah = menengah;
        this.mahal = mahal;
     
    }
    
    public void kategori_harga()
    {
        System.out.println("Jenis Mobil Sedan");
        System.out.println("Sedan adalah sebuah jenis mobil penumpang dengan kapasitas sampai dengan 5 orang dan mempunyai suspensi yang empuk. ");
        System.out.println("Kategori Harga Murah     : "+murah);
        System.out.println("Kategori Harga Menengah  : "+menengah);
        System.out.println("Kategori Harga Mahal     : "+mahal);
        System.out.println("=======================================================================================");
        
    }
    
    }

