/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication210;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class JavaApplication210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner giris=new Scanner(System.in);
        double sayi;
        System.out.println("karekökü istenen sayı: ");
        sayi=giris.nextInt();
        
        if(sayi<0)
            System.out.println("olmadı, sayı pozitif değil!!!");
        else
            System.out.println(sayi+"'nin karakökü: "+Math.sqrt(sayi));
            
        
    }
    
}
