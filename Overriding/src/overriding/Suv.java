/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

/**
 *
 * @author yafiaryamaulana
 */
public class Suv extends Sedan{
    public Suv (String murah, String menengah, String mahal)
    {
        super(murah,menengah,mahal); 
    }
    
    public void kategori_harga()
    {
        System.out.println("Jenis Mobil SUV");
        System.out.println("SUV adalah sebuah jenis mobil penumpang yang bisa melewati segala medan offroad dan memiliki sistem roda 4x4. ");
        System.out.println("Kategori Harga Murah     : "+murah);
        System.out.println("Kategori Harga Menengah  : "+menengah);
        System.out.println("Kategori Harga Mahal     : "+mahal);
        System.out.println("=======================================================================================");
        
    }
    
    }