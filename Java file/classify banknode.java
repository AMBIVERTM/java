
import java.util.Scanner;
public class workshop1 {

  
    public static void main(String[] args) {
    int amount, OriginalAmount, thousand,
        fivehundred, onehundred, fifty, twenty,
        tencoin, fivecoin, twocoin, onecoin ; // declare all variable
        
    System.out.println("Enter all your Money"); // ask user to put their money
    System.out.println("that you would like to classify Banknote and coin");
    System.out.println("the system will find and provide you clasify");
     
    Scanner keyboard = new Scanner(System.in);
    amount = keyboard.nextInt();
    
    OriginalAmount = amount;
    thousand = amount /1000;
    amount = amount %1000;
    fivehundred = amount /500;
    amount = amount %500;
    onehundred = amount /100;
    amount = amount %100;
    fifty = amount /50;
    amount = amount %50;
    twenty = amount /20;
    amount = amount %20;
    tencoin = amount /10;
    amount = amount %10;
    fivecoin = amount /5;
    amount = amount %5;
    twocoin = amount /2;
    amount = amount %2;
    onecoin = amount /1;
    amount = amount %1;
    
    System.out.println(OriginalAmount +" Bath thai currency can be classify as:");
    System.out.println(thousand + " thousand ");   
    System.out.println(fivehundred + " fivehundred ");  
    System.out.println(onehundred + " onehundred ");
    System.out.println(fifty + " fifty ");
    System.out.println(twenty + " twenty ");
    System.out.println(tencoin + " tencoin ");
    System.out.println(fivecoin + " fivecoin ");
    System.out.println(twocoin + " twocoin ");
    System.out.println(onecoin + " onecoin ");
               
    }
}
