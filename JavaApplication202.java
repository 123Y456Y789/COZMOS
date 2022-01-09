/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication202;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class JavaApplication202 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Boyunuzu cm olarak giriniz: ");
        int boy =klavye.nextInt();
        System.out.println("kilonuzu kg olarak giriniz: ");
        int kilo =klavye.nextInt();
        
        double oran=boy/kilo;
        
        if(oran<2.0)
            System.err.println("şişman!");
        else if(oran>2.0 && oran<=2.5)
            System.err.println("normal!");
        else
            System.out.println("Zayıf");
    }
    
}
