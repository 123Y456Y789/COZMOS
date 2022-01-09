/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication203;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class JavaApplication203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayi=(int)(Math.random()*101);
        Scanner klavye =new Scanner(System.in);
        System.out.println("0 ile 100 arasında bir sayı tahmin et");
        int tahmin=-1;
        while(tahmin!=sayi){
            System.out.println("/nTahmin ediniz: ");
            tahmin=klavye.nextInt();
            
            if(tahmin==sayi)
                System.out.println("evet, sayı: "+sayi);
            else if(tahmin>sayi)
                System.out.println(" tahmininiz çok büyük ");
            else 
                System.out.println(" tahmininiz çok küçük ");
        }
        
    }
    
}
