package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {


        String[] quotes ={

         "The only way to do great work is to love what you do. — Steve Jobs ",
        "Success is not final, failure is not fatal: it is the courage to continue that counts. ",
         "Believe you can and you’re halfway there. ",
         "It always seems impossible until it’s done",
         "Your time is limited, so don’t waste it living someone else’s life.",
         "in the middle of every difficulty lies opportunity",
        " The future depends on what you do today",
         " Act as if what you do makes a difference. It does",
         " Dream big and dare to fail.",
         "Happiness depends upon ourselves."
        };



        Scanner myScanner = new Scanner(System.in);


            System.out.println(" pick a number between 1 and 10");

            int isQuote = myScanner.nextInt();
            myScanner.nextLine();

            System.out.println(quotes[isQuote-1]);

            boolean lContinue = true;


            while (lContinue) {
                System.out.println("press y/n to stop or continue ");
                String loop = myScanner.nextLine();

                if (loop.equalsIgnoreCase("y")) {
                    int isQuotes2= myScanner.nextInt();
                    System.out.println(quotes[isQuotes2-1]);


                } else if (loop.equalsIgnoreCase("n")) {
                    lContinue= false;

                }






            }

        }


    }

