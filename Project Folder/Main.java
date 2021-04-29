package com.company;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//By Dominik Lipinski | c00242052 | Project code

public class Main {
    //Menu of the code. Prototype  menu.
    static void menu(){
        System.out.println("======================");
        System.out.println("1: Scan Code ");
        System.out.println("2: Test Methods ");
        System.out.println("3: Exit");
        System.out.println();
    }


    public static void main(String[] args) {
        //Scanner for input.
        Scanner Input = new Scanner(System.in);

        //Variables
        int pick;

        //On start up
        System.out.println("Random Data Generation");
        menu();

        System.out.println("Enter the number:");
        pick = Input.nextInt();

        while(pick != 3) {

            switch (pick) {
                case 1:
                System.out.println("Scan code..");
                    break;
                case 2:
                System.out.println("Test methods..");
                    break;
                    default:
                    System.out.println("Wrong number");
            }
            menu();
            System.out.println("Enter the number:");
            pick = Input.nextInt();
        }

    }

    /*
     try {
        File myObj = new File("filename.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();
    } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
    */
}
