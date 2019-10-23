/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesapp_22_10;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dimco
 */
public class ExercisesApp_22_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        float meters = 1.852f;
//        float miles = 1.150779f;
//        int nauticalMile =1;
//        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Give me the distance of km");
//         nauticalMile=sc.nextInt();
//        
//         float resMeters = (nauticalMile/meters);
//         float resMiles = (nauticalMile/miles);
//        
//        System.out.println("The distance " + nauticalMile + " is in nautical miles " +resMeters+ " and in miles " +resMiles);
        
        //-------------------
        int counter = 0;
         System.out.println("Give me how many numbers u want to store");
          Scanner sc = new Scanner(System.in);
         counter=sc.nextInt();

         Integer intArray[];
         intArray = new Integer[counter];
         
         for (int i=0; i<counter ; i++)
         {
         System.out.println("Give me a value for index " + i + " of array");
         intArray[i]=sc.nextInt();
         }
      
//          intArray[0]= 50;  
//          intArray[1]= 55;  
//          intArray[2]= 51;  
//          intArray[3]= 552;  
//          intArray[4]= 501;  
//          intArray[5]= 507;  
//          intArray[6]= 580;  
//          intArray[7]= 560;  
//          intArray[8]= 500;  
//          intArray[9]= 503;  
//          intArray[10]= 5044;  
//   
           System.out.println("");
         for (int i=0; i<intArray.length; i++)
        {
          System.out.println("In index " + i + " value " + intArray[i]);
        }
       
         
     //    System.out.println(Collections.max(intArray));
         
         
    }
    
}
