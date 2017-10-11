package com.company;


import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        String name;
        String breed;
        int age;

        System.out.print( "Greetings. What is your pet's name? " );
        Scanner Keyboard= new Scanner(System.in);
        name = Keyboard.next();

        System.out.print( "What kind of animal is " + name + "? " );
        breed = Keyboard.next();

        System.out.print( "How old is " + name + "? ");
        age=Keyboard.nextInt();
                //+ " is your " + breed + " and it is " + age );
    }
}
