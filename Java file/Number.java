/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Farhan Umudee
 */
import java.util.Scanner;
public class Number {
        public static void main(String[] args){
            int num1, num2, total;
            
            Scanner KB = new Scanner(System.in);
            
            System.out.print("Enter number 1 : ");
            num1 = KB.nextInt();
            System.out.print("Input number 2 : ");
            num2 = KB.nextInt();
            total = num1 - num2;
            
            if (total > 0) {
                System.out.println(total+ " is Positive number");
            }
            else if (total < 0) {
                System.out.println(total+ " is Nagetive number");
            }
            else {
                System.out.println(total+ " is Zero number");
            }
           
        }
}