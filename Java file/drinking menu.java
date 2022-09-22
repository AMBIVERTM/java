#include<stdio.h>
#include<conio.h>

void screen_welcome()
{
	printf("\n                         :::::::::::::::::::::::::::::::::::::");
	printf("\n                         ::                                 ::");
	printf("\n                         ::  :::::::::::::::::::::::::::::  ::");
	printf("\n                         ::  ::                         ::  ::");
	printf("\n                         ::  :: Welcome to Fatoni+ Cafe ::  ::");
	printf("\n                         ::  ::                         ::  ::");
	printf("\n                         ::  :::::::::::::::::::::::::::::  ::");
	printf("\n                         ::                                 ::");
	printf("\n                         :::::::::::::::::::::::::::::::::::::");
	printf("\n\n                                 ***** Free Wifi *****   ");
	printf("\n\n                           >>> Press any key to continue <<<  ");
	getch();
	system("cls");
}

void screeen_menu()
{
    printf ("\n\n                              :::::::::::::::::::::::");
    printf ("\n                                ::                   ::");
	printf ("\n                                :: Fatoni+ Cafe Menu ::");
	printf ("\n                                ::                   ::");
	printf ("\n                                :::::::::::::::::::::::");
    printf ("\n        ___________________________________   ___________________________________     ");
    printf ("\n       |                                   | |                                   | ");
    printf ("\n       |             DRINK MENU            | |           DESSERT MENU            | ");
    printf ("\n       |___________________________________| |___________________________________| ");
    printf ("\n       |                 |                 | |                 |                 | ");
    printf ("\n       |      MENU       |      PRICE      | |      MENU       |      PRICE      | ");
    printf ("\n       |_________________|_________________| |_________________|_________________| ");    
    printf ("\n       |                 |                 | |                 |                 | ");
    printf ("\n       | [1] Latte       |     35 Bath     | | [A] Croissant   |     50 Bath     | ");
    printf ("\n       | [2] Cappuccino  |     35 Bath     | | [B] Donut       |     15 Bath     | ");
    printf ("\n       | [3] Mocha       |     35 Bath     | | [C] Cupcake     |     30 Bath     | "); 
    printf ("\n       | [4] Espresso    |     35 Bath     | | [D] Cheesecake  |     60 Bath     | ");    
    printf ("\n       | [5] Americano   |     40 Bath     | | [E] Crapecake   |     70 Bath     | ");     
    printf ("\n       | [6] Chocolate   |     25 Bath     | | [F] Tiramisu    |     60 Bath     | ");     
    printf ("\n       | [7] Green tea   |     25 Bath     | | [G] Brownies    |     20 Bath     | ");   
    printf ("\n       |_________________|_________________| |_________________|_________________| ");
    printf ("\n\n                              ::::::::::::::::::::::::::::            ");
    printf ("\n                              :: Press (P) to End Order ::            ");
    printf ("\n                              ::::::::::::::::::::::::::::            ");
    
}

void end_program()
{
	printf("\n\n                                  :::::::::::::::::::::::");
	printf("\n                                    ::                   ::");
	printf("\n                                    ::     Thank you     ::");
	printf("\n                                    ::                   ::");
	printf("\n                                    ::  Have a nine day  ::");
	printf("\n                                    ::                   ::");
	printf("\n                                    ::    ^-^ ^-^ ^-^    ::");
	printf("\n                                    ::                   ::");
	printf("\n                                    :::::::::::::::::::::::");
}

char main(){ 
//function
screen_welcome();
screeen_menu();

//declare variable
char choose,menu;
int sum=0,count=0,money,change; 
int count1=0,count2=0;

//choose Yes/No
    
	printf ("\n\n                          Do you want to oders? [Yes/Y],[No/N]: ");
    scanf("%c",&choose);

    
    if(choose=='y' || choose=='Y'){
    
        while(menu!='P' || menu!='p'){
        
			
            printf ("\n\n        ***** Please enter key drinks or desserts : ");
            scanf ("%s",&menu);
             
			if(menu=='1'){
             printf ("\n        :::::::::::::::::::");
			 printf ("\n        :: Latte 35 Bath ::");
			 printf ("\n        :::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum+=35*count1;
			 count2+=count;
			 
            }else if(menu=='2'){
             printf ("\n        ::::::::::::::::::::::::");
			 printf ("\n        :: Cappuccino 35 Bath ::");
			 printf ("\n        ::::::::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+35*count1;
			 count2+=count;
			 
            }else if(menu=='3'){
             printf ("\n        :::::::::::::::::::");
			 printf ("\n        :: Mocha 35 Bath ::");
			 printf ("\n        :::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+35*count1;
			 count2+=count;
			 
            }else if(menu=='4'){
             printf ("\n        ::::::::::::::::::::::");
			 printf ("\n        :: Espresso 35 Bath ::");
			 printf ("\n        ::::::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+35*count1;
			 count2+=count;
			 
            }else if(menu=='5'){
             printf ("\n        :::::::::::::::::::::::");
			 printf ("\n        :: Americano 40 Bath ::");
			 printf ("\n        :::::::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+40*count1;
			 count2+=count;
			 
            }else if(menu=='6'){
             printf ("\n        :::::::::::::::::::::::");
			 printf ("\n        :: Chocolate 25 Bath ::");
			 printf ("\n        :::::::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+25*count1;
			 count2+=count;
			 
            }else if(menu=='7'){
             printf ("\n        :::::::::::::::::::::::");
			 printf ("\n        :: Green tea 25 Bath ::");
			 printf ("\n        :::::::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+25*count1;
			 count2+=count;
			 
            }else if(menu=='A'||menu=='a'){
             printf ("\n        :::::::::::::::::::::::");
			 printf ("\n        :: Croissant 50 Bath ::");
			 printf ("\n        :::::::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+50*count1;
			 count2+=count;
			 
		    }else if(menu=='B'||menu=='b'){
             printf ("\n        :::::::::::::::::::");
			 printf ("\n        :: Donut 15 Bath ::");
			 printf ("\n        :::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+15*count1;
			 count2+=count;
		    
			}else if(menu=='C'||menu=='c'){
             printf ("\n        :::::::::::::::::::::");
			 printf ("\n        :: Cupcake 30 Bath ::");
			 printf ("\n        :::::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+30*count1;
			 count2+=count;
		    
			}else if(menu=='D'||menu=='d'){
             printf ("\n        ::::::::::::::::::::::::");
			 printf ("\n        :: Cheesecake 60 Bath ::");
			 printf ("\n        ::::::::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+60*count1;
			 count2+=count;
		    
			}else if(menu=='E'||menu=='e'){
             printf ("\n        :::::::::::::::::::::::");
			 printf ("\n        :: Crapecake 70 Bath ::");
			 printf ("\n        :::::::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+70*count1;
			 count2+=count;
			
			}else if(menu=='F'||menu=='f'){
             printf ("\n        ::::::::::::::::::::::");
			 printf ("\n        :: Tiramisu 60 Bath ::");
			 printf ("\n        ::::::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+60*count1;
			 count2+=count;
		    
			}else if(menu=='G'||menu=='g'){
             printf ("\n        ::::::::::::::::::::::");
			 printf ("\n        :: Brownies 20 Bath ::");
			 printf ("\n        ::::::::::::::::::::::");
			 printf ("\n\n        +++++ (Enter) How many you want? : ");
			 scanf ("%d",&count);
			 count1=count;
			 sum=sum+20*count1;
			 count2+=count;
			 
			//Finish to oders
			}else if(menu=='P'||menu=='p'){ 
             system("cls");
			 printf("\n                               :::::::::::::::::::::::::::::");
			 printf("\n                               ::                         ::");
			 printf("\n                               ::   *** Finish oder ***   ::");
             printf("\n                               ::                         ::");
			 printf("\n                               :: All your order %d items  ::",count2);
             printf("\n                               :: Total prices is %d Bath ::",sum);
             printf("\n                               ::                         ::");
			 printf("\n                               :::::::::::::::::::::::::::::");
			 
			 //pay and money change
			 printf("\n\n        >>>>> Enter your money for pay is : ");
             scanf("%d",&money);
             change = money - sum;
             printf("\n        >>>>> Your money change is : %d ",change);
             printf("\n\n\n                            >>> Press any key to End program <<<");
			 getch();
             break;
			}
	       
	        }
        }
        
	
	
	if(choose=='N'||choose=='n');{
       system("cls");
	   end_program();   
	}
	
   
    return 0;
}


