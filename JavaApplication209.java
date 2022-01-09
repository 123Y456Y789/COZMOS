/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication209;

/**
 *
 * @author Acer
 */
public class JavaApplication209 {
    public static void yazdir(int baslangic,int adet,int artis){
        for(int i=0; i<adet; i++){
            System.out.println(baslangic+"  ");
            baslangic=baslangic+artis;
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        yazdir(1,5,2);
        yazdir(10,7,5);
        yazdir(8,4,8);
    }
    
}
