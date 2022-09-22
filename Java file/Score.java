/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farhan Umudee
 */
import java.util.Scanner;

public class Score {
 
  public static void main(String[] args){ 
  int score;
  Scanner KB = new Scanner(System.in);
     
  System.out. print("Enter your Score:  ");
  score = KB.nextInt();
  
  if (score >= 50){
  System.out.println("You Passed Examination");}
  
  else{
  System.out.println("You Fail Examination");}

   }
}
