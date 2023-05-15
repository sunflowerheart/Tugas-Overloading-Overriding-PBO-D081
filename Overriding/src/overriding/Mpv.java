/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author yafiaryamaulana
 */
public class Mpv extends Sedan{ 
    public Mpv (String murah, String menengah, String mahal)
    {
        super(murah,menengah,mahal);
    }
    
    public void kategori_harga()
    {
        System.out.println("Jenis Mobil MPV");
        System.out.println("MPV adalah sebuah jenis mobil penumpang yang bisa mengangkut 7 orang dan mengangkut barang. ");
        System.out.println("Kategori Harga Murah     : "+murah);
        System.out.println("Kategori Harga Menengah  : "+menengah);
        System.out.println("Kategori Harga Mahal     : "+mahal);
        System.out.println("=======================================================================================");
        
    }
    
    }