/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farhan Umudee
 */
import java.util.Scanner;
public class Medicine {
     public static void main(String[] args){
         int age;
         double drug;
         
         Scanner KB = new Scanner(System.in);
         
         System.out.print("Enter your age : ");
         age = KB.nextInt();
         
         if (age <= 5) {
             drug = (0.5 * 3) * 4;
             System.out.println("You got drug " +drug+ " Tabs.");
         }
         else if (age > 5 && age <= 15) {
             drug = (1*3) * 4;
             System.out.println("You got drug " +drug+ " Tabs.");
         }
         else {
             drug = (2*3) * 4;
             System.out.println("You got drug " +drug+ " Tabs.");
         }
     }
    
}