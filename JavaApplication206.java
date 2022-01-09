/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication206;

/**
 *
 * @author Acer
 */
public class JavaApplication206 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int birinci=1;
        int ikinci=1;
        
        System.out.print(birinci+"  ");
        System.out.print(ikinci+"  ");
        
        for(int i=3; i<17;i++){
            int yeni=birinci+ikinci;
            System.out.print(yeni+"  ");
            birinci=ikinci;
            ikinci=yeni;
            
        }
    }
    
}
