/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farhan Umudee
 */
import java.util.Scanner;

public class Parking {
 
  public static void main(String[] args){ 
  int h,f,total;
  Scanner KB = new Scanner(System.in);
     
  System.out. print("Enter your parking hours : ");
  h = KB.nextInt();

if (h <= 2){
   total=h*40; 
System.out. println("You have to pay "+total+ " baht");}

else if
  (h>2 && h<=5){
   total=(h-2)*30+80;    
System.out.println("You have to pay "+total+ " baht");}
 
else{ 
    total=(h-5)*20+170;  
  System.out.println("You have to pay "+total+ " baht");}

   }
} 
