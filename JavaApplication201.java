/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication201;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class JavaApplication201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner klavye=new Scanner(System.in);
      System.out.println("iki kardeşin yaşlarını giriniz: ");
      double yas1=klavye.nextDouble();
      double yas2=klavye.nextDouble();
      
      double ortalama=(yas1+yas2)/2;
      double toplam=yas1+yas2;
      
      System.out.println("ortalama: "+ortalama+" toplam: "+toplam);
    }
    
}
