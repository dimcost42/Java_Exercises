/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise7_w2_d2_22_10;

/**
 *
 * @author dimco
 */
public class Exercise7_w2_d2_22_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //  Write code to print the numbers between 1 and 100 that are evenly divisible by four but not by five 
        
     
     for (int i=0; i<100 ; i++)
     {
         if ((i%4 == 0)&&(i%5!=0))
         {
             System.out.println(i);
         }
     }
     
     
        
    }
    
}
