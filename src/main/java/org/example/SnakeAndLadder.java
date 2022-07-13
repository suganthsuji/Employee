package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SnakeAndLadder {
    public static int position[]=new int[2], roll=0,i;
//    public static int count[]=new int[2];
   public static void main (String[] args)
    {
        int i = (int)(Math.floor((Math.random()+0.5)));
        System.out.println("PLAYER "+ i+" STARTS THE GAME");
        dieroll(i);
        System.out.println("NO OF TIMES DICE ROLLED IS " + roll);
//        System.out.println("NO OF TIMES DICE ROLLED BY PLAYER 0 IS "+count[0]);
//        System.out.println("NO OF TIMES DICE ROLLED BY PLAYER 1 IS "+count[1]);
    }

    public static void dieroll(int i)
    {
        System.out.println("PLAYER " + i + " IS PLAYING");
//        count[0] = (i==0) ? (count[0]++) : count[0];
//        count[1] = (i==1) ? (count[1]++) : count[1];
        int a = (i==0) ? 1:0;
        Double dienumber=Math.floor((Math.random()*6)+1);
        System.out.println("THE DICE ROLLS " + dienumber);
        roll++;
        List<String> options=new ArrayList<>();
        options.add("NO_PLAY");
        options.add("LADDER");
        options.add("SNAKE");

        Random random=new Random();
        String option=options.get(random.nextInt(options.size()));
        System.out.println("OPTION CHOSEN IS " + option);

        if (option == "SNAKE"){
            position[i] -= dienumber;
        }
        else if (option == "LADDER") {
            position[i] += dienumber;
        }
        if (position[i] < 0) {
            position[i] = 0;
        }
        if (position[i] == 100){
            System.out.println("GAME WON");
        }
        if (position[i] > 100){
            position[i] -= dienumber;
        }
        System.out.println("CURRENT POSITION IS " + position[i]);
        System.out.println();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Press 0 to quit or 1 to continue");
        int x= scanner.nextInt();
        if(x==1 && option=="LADDER") {
            dieroll(i);
        }
        else if(x==1){
            dieroll(a);
        }
    }

}
