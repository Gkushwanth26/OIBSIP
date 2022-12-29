import java.util.*;
import java.lang.Math;
public class Task2 {
    public static void main(String args[]){
        System.out.print("******** NUMBER GUESSING GAME ******** ");
        System.out.println();
        System.out.println();
        int i=1;
        
        /* i = No of attempts to play the game*/
        while(i>0 && i<26){
            System.out.println();
            System.out.printf("enter a number:");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            
            /*random class*/
            
            Random r=new Random();
            int a=r.nextInt(100);
            if(n==a){
                System.out.println("The Entered number matches with the guessed number");
                System.out.println();
                System.out.println("Your Score is::"+100);
                System.out.println();
                System.out.printf("If you again want to play the game enter 1 or else 0::");
                int b=sc.nextInt();
                if (b==0){
                    System.out.println("Hope you enjoy the game");
                    i=0;
                }
                else{
                    i+=1;
                    if(i==26){
                        System.out.println();
                        System.out.println("Maximum no of attempts to play the game is 26");
                        System.out.println();
                        System.out.println("Hope you enjoy the game");
                    }
                }
            }
            else if(n<a){
                
                System.out.println("The Entered number is less than than the generated number");
                System.out.println("Entered number::"+n+" , Generated number::"+a);
                System.out.println();
                if((Math.abs(n-a))<3){
                    System.out.println("Your Score is::"+90);
                }
                else if((Math.abs(n-a))<5){
                     System.out.println("Your Score is::"+50);
                }
                else if((Math.abs(n-a))<10){
                     System.out.println("Your Score is::"+10);
                }
                else{
                    System.out.println("Your Score is::"+0);
                }
                System.out.println();
                System.out.printf("If you again want to play the game enter 1 or else 0::");
                int b=sc.nextInt();
                if (b==0){
                    System.out.println("Hope you enjoy the game");
                    i=0;
                }
                else{
                    i+=1;
                    if(i==26){
                        System.out.println();
                        System.out.println("Maximum no of attempts to play the game is 26");
                        System.out.println();
                        System.out.println("Hope you enjoy the game");
                    }
                }
            }
            else{
                System.out.println("The Entered number is greater than than the generated number");
                System.out.println("Entered number::"+n+" , Generated number::"+a);
                System.out.println();
                System.out.println();
                if((Math.abs(n-a))<3){
                    System.out.println("Your Score is::"+90);
                }
                else if((Math.abs(n-a))<5){
                     System.out.println("Your Score is::"+50);
                }
                else if((Math.abs(n-a))<10){
                     System.out.println("Your Score is::"+10);
                }
                else{
                    System.out.println("Your Score is::"+0);
                }
                System.out.println();
                System.out.printf("If you again want to play the game enter 1 or else 0::");
                int b=sc.nextInt();
                if (b==0){
                    System.out.println("Hope you enjoy the game");
                    i=0;
                }
                else{
                    i+=1;
                    if(i==26){
                        System.out.println();
                        System.out.println("Maximum no of attempts to play the game is 26");
                        System.out.println();
                        System.out.println("Hope you enjoy the game");
                    }
                }
            
            }
        }
    }
}
