package org.example;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class FunctionalProgram {
    public static void main(String[] args) {

        Distance();
        WindChill();
        ThreeInt();
        TwoD();

    }
    public static void Distance(){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("Enter x Value");
        int x = scanner.nextInt();
        System.out.println("Enter y Value");
        int y = scanner.nextInt();
        System.out.println("Output : " + df.format(Math.sqrt((Math.pow(x,2))+(Math.pow(y,2)))));
    }

    public static void WindChill(){
        System.out.println("Wind Chill");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature");
        int t = scanner.nextInt();
        double w = 0;
        System.out.println("Enter Wind Speed");
        int v = scanner.nextInt();

        if (t > 50 || v > 120 || v < 3)
        {
            System.out.println("Input Invalid");
        }
        else
        {
            w = 35.74 + (0.6215 * t ) + ((0.4275 * t ) - 35.75 ) * Math.pow(v,0.16);
        }
        System.out.println("Wind Chill : " + w);
    }
    public static void TwoD(){
        System.out.println("Two Dimensional Array");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No.of.Rows");
        int row = scanner.nextInt();
        System.out.println("Enter No.of.Columns");
        int column = scanner.nextInt();
        int [][] array = new int[row][column];
        for ( int i = 0 ; i < row ; i++)
        {
            for ( int j = 0 ; j < column ; j++)
            {
                System.out.println("Enter Value for " + i + " row "+ j + " column ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Two Dimension Array " + Arrays.deepToString(array));
    }
    public static void ThreeInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for ( int i = 0 ; i < n ; i++)
        {
            System.out.println("Enter number for position "+ i);
            a[i] = scanner.nextInt();
        }
        for ( int i = 0 ; i < n-2 ; i++)
        {
            for ( int j = i + 1 ; j < n-1 ; j++ )
            {
                for ( int k = j + 1 ; k < n ; k++)
                {
                    if ( a[i] + a[j] + a[k] == 0)
                    {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    }

}
