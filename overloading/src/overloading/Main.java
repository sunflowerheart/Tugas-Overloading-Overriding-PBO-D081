/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, bilangan_a, bilangan_b, bilangan_c, skalar; 
        System.out.println("Yafi Arya Maulana --- 21081010135");
        System.out.println("============================================");
        System.out.println("Program Perhitungan Vektor Metode Overloading");
        System.out.println("============================================");
        System.out.println("Beberapa Pilihan Menu : ");
        System.out.println("1. Perkalian Vektor Dengan Vektor");
        System.out.println("2. Perkalian Vektor Dengan Skalar");
        System.out.println("3. Keluar Dari Program Menu");
        System.out.print("Silahkan Masukkan Pilihan Menu Anda : ");
        menu = input.nextInt();
        
        switch (menu) {
            case 1 :
                System.out.println("Anda Memilih Menu Perkalian Vektor");
                System.out.println("********************************************");
                System.out.print("Masukkan Bilangan Vektor 1 : ");
                bilangan_a = input.nextInt();
                System.out.print("Masukkan Bilangan Vektor 2 : ");
                bilangan_b = input.nextInt();
                System.out.print("Masukkan Bilangan Vektor 3 : ");
                bilangan_c = input.nextInt();
                VectorThree vector1 = new VectorThree(bilangan_a, bilangan_b, bilangan_c);
                System.out.print("----Vektor Yang Sudah di Input---- : ");
                vector1.display();

                System.out.println("Hasil Perkalian Vektor dengan Vektor : ");
                System.out.println("\nHasil : "+vector1.increase(vector1));
                break;
                
                 case 2 :
                System.out.println("Anda Memilih Menu Perkalian Vektor Skalar");
                System.out.println("********************************************");
                System.out.print("Masukkan Bilangan Vektor 1 : ");
                bilangan_a = input.nextInt();
                System.out.print("Masukkan Bilangan Vektor 2 : ");
                bilangan_b = input.nextInt();
                System.out.print("Masukkan Bilangan Vektor 3 : ");
                bilangan_c = input.nextInt();
                VectorThree vector2 = new VectorThree(bilangan_a, bilangan_b, bilangan_c);
                System.out.print("----Vektor Yang Sudah di Input---- = ");
                vector2.display();

                System.out.print("Masukkan Nilai Skalar : ");
                skalar = input.nextInt();
                System.out.println(" Hasil Perkalian Vektor dengan Skalar : ");
                System.out.print("Hasil Dari perhitungan Skalar = ");
                vector2.increase(skalar).display();
                break;
                case 3 :
                System.exit(0);
                break;
            
            default :
                System.out.println("Pilihan Anda Tidak Ada, Silahkan Input Kembali");
        }
        input.close();
    }  
}
     

