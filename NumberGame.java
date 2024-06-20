import java.util.Scanner;

public class NumberGame
{
     public static void main(String args[])
     {
       for (int i=1;i<=100;i++)
        {
            System.out.print( " "+ i);
        }

       Scanner sc = new Scanner(System.in);
       int myNum = (int)(Math.random()*100);
       int userNum = 0;

       do{
         System.out.println();
         System.out.println("Guess random number(1-100) in above: ");
         userNum = sc.nextInt();

         if(userNum == myNum){
          System.out.println("Correct Number");
          break;
         }
         else if(userNum > myNum){
          System.out.println("your number is too High");
         }
         else{
          System.out.println("your number is too low");
         }
       }

       while(userNum >= 0);

       System.out.println("My number was: ");
       System.out.println(myNum);

       }
}
    
     