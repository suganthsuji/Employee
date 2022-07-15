package org.example;

import java.text.DecimalFormat;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PracticeProblemDay5 {
    public static void main(String[] args){

        primefactor();
        Harmonicnumber();
        flipcoin();
        sqrt();
        Largest();
        VowelConsonant();
        OddorEven();
        swap();
        quotandremainder();
        pow();
        Leapyear();

    }



     public static void  Leapyear(){
         Scanner scanner=new Scanner(System.in);
         int year=scanner.nextInt();
         if(year<1000){
             System.out.println("ERROR: Enter four digit number");
         }
         else if(year%100==0&&year%4==0){
             if (year%400==0){
                 System.out.println(year+" is a Leap Year");
             }
              else {
             System.out.println(year+" is Not a Leap Year");
         }
         }
     }

    public static void pow(){
            Scanner scanner=new Scanner(System.in);
            double N= scanner.nextDouble();
            for(int i=1;i<=N;i++){
                System.out.println(Math.pow(2,i));
            }
    }

    public static void quotandremainder(){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        Scanner sc=new Scanner(System.in);
        int b= sc.nextInt();
        int quot=a/b;
        int remainder=a%b;
        System.out.println("The quotient of "+a+","+b+" is "+quot);
        System.out.println(remainder);
    }

    public static void swap(){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        Scanner sc=new Scanner(System.in);
        int b= sc.nextInt();
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("Swap of A is "+a+" Swap of B is "+b);
    }

    public static void OddorEven(){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        String b= (a%2)==0 ? "EVEN":"ODD";
        System.out.println(b);
    }
    public static void VowelConsonant(){
        Scanner scanner=new Scanner(System.in);
        char ch=scanner.nextLine().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Consonant");
        }
    }

    public static void Largest(){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        int b=scanner1.nextInt();
        Scanner scanner2=new Scanner(System.in);
        int c=scanner2.nextInt();

        if(a>b&&a>c){
            System.out.println("A is Largest number");
        }
        else if(b>a&&b>c){
            System.out.println("B is Largest Number");
        }
        else {
            System.out.println("C is Largest Number");
        }
    }

    public static void sqrt(){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(Math.pow(a,0.5));
    }

    public static void flipcoin(){
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.#");
        Scanner scanner = new Scanner(System.in);
        int tailsCount = 0;
        int headsCount = 0;
        System.out.println("Enter the Number of Flips ");
        int flips = scanner.nextInt();
        for (int i = 0; i < flips; i++) {
            String value = df.format(Math.random());
            if (Float.parseFloat(value) < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }
        System.out.println("Percentage of Tails " + ((tailsCount * 100 )/ flips) +"%");
        System.out.println("Percentage of Heads " + ((headsCount * 100)/ flips) +"%");
    }

    public static void Harmonicnumber(){
        System.out.println("Harmonic Number");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the N Value");
        int n = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("#.###");
        double h = 0.0;
        while(n > 0)
        {
            h += (double) 1 / n;
            n--;
            System.out.print(h +"  ");
        }
        System.out.println("");
        System.out.println("Output of Harmonic Series is "+df.format(h));
    }

   public static void primefactor(){
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set = new LinkedHashSet<>();
        System.out.println("Enter A Number");
        int num = scanner.nextInt();

        for (int i = 2 ; i <= num ; i++)
        {
            while (num % i == 0)
            {
                set.add(i);
                num /= i;
            }
        }
        System.out.println("The Prime Factors are " + set);
    }

}
