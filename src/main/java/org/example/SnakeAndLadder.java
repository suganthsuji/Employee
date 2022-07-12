package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
    public static int position=0 , count=0;
    public static void main (String[] args)
    {
        dieroll();
        System.out.println("NO OF TIMES DICE ROLLED IS " + count);
    }

    public static void dieroll()
    {

        Double dienumber=Math.floor((Math.random()*6)+1);
        System.out.println("THE DICE ROLLS " + dienumber);
        count++;
        List<String> options=new ArrayList<>();
        options.add("NO_PLAY");
        options.add("LADDER");
        options.add("SNAKE");

        Random random=new Random();
        String option=options.get(random.nextInt(options.size()));
        System.out.println("OPTION CHOSEN IS " + option);

        if (option == "SNAKE"){
            position -= dienumber;
        }
        else if (option == "LADDER") {
            position += dienumber;
        }
        if (position < 0) {
            position = 0;
        }
        if (position == 100){
            System.out.println("GAME WON");
        }
        if (position > 100){
            position -= dienumber;
        }
        System.out.println("CURRENT POSITION IS " + position);
        System.out.println();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Press 0 to quit or 1 to continue");
        int x= scanner.nextInt();
        if(x==1) {
            dieroll();
        }
    }

}
