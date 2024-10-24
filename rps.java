package com;
import java.util.Scanner;
import java.util.Random;

public class rps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Computer");
        System.out.println("2.People");
        System.out.println("Enter number With whom u want play:");
        int input = sc.nextInt();
        System.out.println("Welcome, Lets play fair and square");
        System.out.println("Rules:\nRock beats --> Scissor beats --> Paper beats --> Rock\n\n");

        System.out.println("1.Rock");
        System.out.println("2.Scissor");
        System.out.println("3.Paper");
        if (input == 1) {
            int numcom;
            Random rand = new Random();
            numcom = rand.nextInt(1,4);

            System.out.println("Enter ur move number: ");
            int movno = sc.nextInt();
            System.out.println("You picked: "+movno+" Computer picked: "+numcom);
            if(movno == numcom){
                System.out.println("It's tie");
            }
            else if(movno == 1 && numcom == 2){
                System.out.println("You wins!!!!");
            }
            else if(movno == 2 && numcom == 3){
                System.out.println("You wins!!!!");
            }
            else if(movno == 3 && numcom == 1){
                System.out.println("You wins!!!!");
            }
            else if(movno == 2 && numcom == 1){
                System.out.println("Computer wins!!!!");
            }
            else if(movno == 3 && numcom == 2){
                System.out.println("Computer wins!!!!");
            }
            else if(movno == 1 && numcom == 3){
                System.out.println("Computer wins!!!!");
            }
            else{
                System.out.println("Enter valid input");
            }
        }
        else if(input == 2){
            System.out.println("Only two person can play at once");
            int[] p = new int[2];
            for(int i = 0 ; i <  2 ; i++){
                int n = i+ 1;
                System.out.println("Enter Player "+n+" your move in number: ");
                p[i] = sc.nextInt();
            }
            if(p[0] == p[1]){
                System.out.println("This game is tie");
            }
            else if (p[0] == 1 && p[1]==2) {
                System.out.println("Player 1 wins");
            }
            else if (p[0] == 1 && p[1]==3) {
                System.out.println("Player 2 wins");
            }
            else if (p[0] == 2 && p[1]==3) {
                System.out.println("Player 1 wins");
            }
            else if (p[0] == 2 && p[1]==1) {
                System.out.println("Player 2 wins");
            }
            else if (p[0] == 3 && p[1]==1) {
                System.out.println("Player 1 wins");
            }
            else if (p[0] == 3 && p[1]==2) {
                System.out.println("Player 2 wins");
            }
            
        }
        else{
            System.out.println("Enter valid input");
        }
    }
}
