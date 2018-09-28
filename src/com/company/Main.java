package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        System.out.println("what's your name?");
        String name = intro.nextLine();
        System.out.println("hello " + name);

        Scanner guess = new Scanner(System.in);
        System.out.println("what number am i thinking of between 1-10?");
        String guessInput = intro.nextLine();
        int counter = 1;
        int randomNum = (int)(Math.random()*10);
        while (rsLib.guessRight(guessInput, randomNum) == false) {
            System.out.println("try again " + name);
            guessInput = intro.nextLine();
            counter+=1;
        }
        if (rsLib.guessRight(guessInput, randomNum) == true) {
            System.out.println(name + ", you took " + counter + " guess(es) to get the correct answer");
        }

        Scanner g2 = new Scanner(System.in);
        System.out.println("choose a number between 1 to 100 and the computer will guess it. answer with higher, lower or correct. is your number 100?");
        String g2input = intro.nextLine();
        int theGuess = 100;
        int interval = 100;
        counter = 1;
        while (g2input.equals("correct") == false) {
            if (g2input.equals("lower") == true) {
                interval = interval/2;
                if (interval < 1) {interval =1;}
                theGuess = theGuess-interval;
                System.out.println(name + ", is your number " + theGuess + "?");
                g2input = intro.nextLine();
                counter+=1;
            }

            if (g2input.equals("higher") == true) {
                if (theGuess != 100) {
                    interval = interval/2;
                    if (interval < 1) {interval =1;}
                    theGuess = (int) (theGuess+interval);
                    System.out.println(name + ", is your number " + theGuess + "?");
                    g2input = intro.nextLine();
                    counter+=1;
                }
                if (theGuess == 100 || theGuess > 100) {
                    System.out.println(name + ", is your number 100?");
                    g2input = intro.nextLine();
                }
            }

        }
        if (g2input.equals("correct") == true) {
            System.out.println("the computer took " + counter + " guess(es) to get the correct answer");
        }
    }

}
