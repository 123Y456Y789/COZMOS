/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication205;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class JavaApplication205 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner klavye=new Scanner(System.in);
        
        System.out.println("ilk tam sayıyı giriniz: ");
        int sayi1=klavye.nextInt();
        System.out.println("ikinci tam sayıyı giriniz: ");
        int sayi2=klavye.nextInt();
        
        int ebob=1;
        int k=2;
        while(k<=sayi1 &&k<=sayi2){
            if(sayi1%k==0 && sayi2%k==0)
                ebob=k;
            k++;
        }
        System.out.println(sayi1+" ve "+sayi2+" için ebob: "+ebob);
    }
    
}
