/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication204;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class JavaApplication204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("faktöriyel hesabı yapılacak sayıyı giriniz: ");
       Scanner klavye=new Scanner(System.in);
       int giris=klavye.nextInt();
       
       int sonuc=1;
       
       for(int i=1;i<=giris;i++){
           sonuc=sonuc*i;
       }
       System.out.println(sonuc);
    }
    
}
