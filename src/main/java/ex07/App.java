package ex07;



import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "What is the length of the room in feet?" );
        String Slength = input.nextLine();
        System.out.println("What is the width of the room in feet? ");
        String Swidth = input.nextLine();

        int length = Integer.parseInt(Slength);
        int width = Integer.parseInt(Swidth);
        System.out.println("You entered dimensions of "+ length +" feet by "+ width +" feet.");
        System.out.println("The area is");

        int area = length * width;
        double areaM = area * 0.09290304;


        System.out.println(area +" square feet");
        System.out.println(areaM + " square meters");
    }
}
