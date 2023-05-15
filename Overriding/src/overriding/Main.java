/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overriding;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        System.out.println("Program Overriding Jenis Mobil Di Indonesia ");
        System.out.println("====================================================\n");
        System.out.println("Silahkan Pilih Jenis Mobil : ");
        System.out.println("1. Sedan");
        System.out.println("2. MPV");
        System.out.println("3. SUV");
        System.out.print("Masukkan Pilihan Jenis Mobil Anda : ");
        menu = input.nextInt();
        
        switch (menu) {
            case 1:
                System.out.println("Anda Memilih Sedan, Berikut Daftar Merk & Nama Mobil Sedan : ");
                Sedan sd = new Sedan ("Honda City", "Toyota Camry", "BMW Seri 7");
                sd.kategori_harga();
                break;
            
            case 2:
                System.out.println("Anda Memilih MPV, Berikut Daftar Merk & Nama Mobil MPV : ");
                Mpv mp = new Mpv("Mitsubishi Xpander", "Toyota Innova Venturer", "Lexus LM 350");
                mp.kategori_harga();
                break;
                
            case 3:
                System.out.println("Anda Memilih SUV, Berikut Daftar Merk & Nama Mobil SUV : ");
                Suv su = new Suv("Daihatsu Rocky", "Mitsubishi Pajero Sport", "Mercy GLS 450");
                su.kategori_harga();
                break;    
        }
         input.close();
    }
    
}