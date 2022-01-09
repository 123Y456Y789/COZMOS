/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication208;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class JavaApplication208 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner klavye=new Scanner(System.in);
        System.out.println("LÜTFEN BİR TAMSAYI GİRİNİZ: ");
        int sayi=klavye.nextInt();
        
        int tekRakamlarSayisi=0;
        int tekRakamlarToplami=0;
        int ciftRakamlarSayisi=0;  
        int ciftRakamlarToplami=0;
        
        while(sayi!=0){
            int basamakDegeri=sayi%10;
            sayi=sayi/10;
            
            if(basamakDegeri%2==0){
                ciftRakamlarToplami= ciftRakamlarToplami+basamakDegeri;
                ciftRakamlarSayisi++;
             }else{
              tekRakamlarToplami= tekRakamlarToplami+basamakDegeri;
              tekRakamlarSayisi++;   
            }
            System.out.println("çift basamak sayisi: "+ciftRakamlarSayisi);
            System.out.println("tek basamak sayisi: "+tekRakamlarSayisi);
            System.out.println("çift basamak toplamı: "+ciftRakamlarToplami);
            System.out.println("tek basamak toplamı: "+tekRakamlarToplami);
        }
    }
    
}
