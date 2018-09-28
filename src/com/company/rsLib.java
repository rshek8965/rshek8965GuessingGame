package com.company;

import java.util.Scanner;
import java.lang.Math;

public class rsLib {


    public static boolean guessRight(String guess, int randomNum) {
        if (Integer.parseInt(guess) == randomNum) {return true;}
        else return false;
    }
}
