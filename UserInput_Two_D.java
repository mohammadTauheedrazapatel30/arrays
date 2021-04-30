/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.corejava_2.array;

import java.util.Scanner;

/**
 *
 * @author Mohammad Tauheed
 */
public class UserInput_Two_D {
     public static void main(String[] args) {
        
         int a[][] = new int[3][3];
         
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Enter elements : ");
         
         for(int i=0;i<3;i++){
             
            for(int j=0;j<3;j++){
                
                a[i][j] = scan.nextInt();
            } 
         }
         
         System.out.println("Printing elements passed by the user :");
         
         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 System.out.println(a[i][j]);
             }
         }
    }
}
