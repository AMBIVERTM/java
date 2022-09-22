/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farhan Umudee
 */
import java.util.Scanner;

public class birthday {
 
  public static void main(String[] args){ 
  int age,cy,by;
  Scanner KB = new Scanner(System.in);
     
  System.out. print("Enter current year : ");
  cy = KB.nextInt();
  
  System.out. print("Enter your birth : ");
  by = KB.nextInt();
  age =cy-by;
if (age <= 20){
System.out. println("You age is  "+age+"  You are young");}
else{
System.out.println("You age is  "+age+"  You are adult");}

   }
}  

