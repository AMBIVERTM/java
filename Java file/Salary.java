/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farhan Umudee
 */
import java.util.Scanner;

public class Salary {
 
  public static void main(String[] args){ 
  int h,w,total;
  Scanner KB = new Scanner(System.in);
     
  System.out. print("Enter your hours : ");
  h = KB.nextInt();

if (h <= 8){
   total=h*30; 
System.out. println("You got wage is "+total+ " baht");}

else{
  total=(h-8)*45+240;  
System.out.println("You got wage is "+total+ " baht");}

   }
} 