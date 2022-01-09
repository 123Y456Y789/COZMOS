/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication207;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class JavaApplication207 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("ilk şehri giriniz: ");
        String sehir1=klavye.nextLine();
        System.out.print("ikinci şehri giriniz: ");
        String sehir2=klavye.nextLine();
        
        if(sehir1.compareTo(sehir2)<0){
            System.out.println("alfabetik sıralama: "+sehir1+" , "+sehir2);
            
        }
        else{
            System.out.println("alfabetik sıralama: "+sehir2+" , "+sehir1);
        }
        
    }
    
}
