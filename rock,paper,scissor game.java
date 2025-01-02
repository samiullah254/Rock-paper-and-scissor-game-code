//                   ROCK PAPER SCISSOR GAME

import java.util.Scanner;
import java.util.Random;
public class Exercise2_Video_no_20 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("enter 0 for paper, 1 for rock, 2 for scissor: ");
        int myTurn = sc.nextInt();

        System.out.print("number picked by computer = ");
        Random rand = new Random();        // generates random number between 0 and 2
        int computerTurn = rand.nextInt(3);
        System.out.println(computerTurn);

        if (myTurn>=0 && myTurn<=2){
            System.out.println("Game start");
        }
        else {
            System.out.println("invalid input");
        }


        if(myTurn ==   computerTurn ){
            System.out.println("it's a draw");
        }
        else if((myTurn == 1 && computerTurn == 0) || (myTurn == 0 && computerTurn == 2) || (myTurn == 2 && computerTurn == 1)){
            System.out.println("you lose the game");
        }
        else if((myTurn == 2 && computerTurn == 0) || (myTurn == 0 && computerTurn == 1) || (myTurn == 1 && computerTurn == 2)){
            System.out.println("you win the game");
        }







    }
}
