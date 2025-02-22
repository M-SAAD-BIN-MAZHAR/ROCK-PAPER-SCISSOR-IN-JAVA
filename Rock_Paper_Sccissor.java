import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Sccissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENETR '0' FOR SCISSOR '1' FOR ROCK '2' FOR PAPER ");
        int userInput=sc.nextInt();

        Random rd=new Random();
        int compInp=rd.nextInt(3);
        if(userInput>=0&&userInput<3)
        {
        if(userInput==compInp)
        {
            System.out.println("GAME IS DRAWN");
        }
        else if(userInput==0 && compInp==1|| userInput==1 && compInp==2 || userInput==2 && compInp==0) 
        {
           System.out.println("COMPUTER WON THE GAME ");
        }
        else
        {
            System.out.println("YOU WON THE GAME ");
        }
        if(compInp==0)
        {
            System.out.println("COMPUTER INPUT WAS SCISSOR ");
        }
        else if(compInp==1)
        {
            System.out.println("COMPUTER INPUT WAS ROCK ");
        }else if(compInp==2) {
        System.out.println("COMPUTER INPUT WAS PAPER");
        }

          
    }else 
    System.out.println(" AYOU ENTER INVALID MOVE ");
        sc.close();
         
    }
    
}
