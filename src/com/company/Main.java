package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        rouletteGame();

    }

    public static void rouletteGame() {

        double total=0 ;
        int wonGame=0;
        int lostGame=0;
        double betNum = 0;
        int numOne = 0;
        double lostBet = 0;


        ArrayList<String> colorPick = new ArrayList<>();

        colorPick.add("black");
        colorPick.add("red");

        Scanner input = new Scanner(System.in);

        Random rnd = new Random();

        System.out.println("Welcome! Let's play some roulette");

        System.out.println("Enter the type of bet you would like to place (red|black|even|odd|high|low):");

            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("red"))

            {

                System.out.println("Enter in your bet amount:");

                betNum = input.nextDouble();

                numOne = 1 + rnd.nextInt(36);

                Collections.shuffle(colorPick);

                if (colorPick.get(0) == "black")

                {

                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Sorry, you've lost this bet.");
                    lostBet = 0 - betNum;
                    total+=lostBet;
                }

                else

                    {
                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Congratulations, you've won.");
                    betNum=betNum*2;
                    total+=betNum;
                }
            }


            else if (choice.equalsIgnoreCase("black"))

            {

                System.out.println("Enter in your bet amount:");

                betNum = input.nextDouble();

                numOne = 1 + rnd.nextInt(36);

                Collections.shuffle(colorPick);

                if (colorPick.get(0) == "red")

                {
                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Sorry, you've lost this bet.");
                    lostBet = 0 - betNum;
                    total+=lostBet;
                }
                else
                    {
                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Congratulations, you've won.");
                    betNum=betNum*2;
                    total+=betNum;
                }
            }

            else if (choice.equalsIgnoreCase("even"))
            {

                System.out.println("Enter in your bet amount:");

                betNum = input.nextDouble();

                numOne = 1 + rnd.nextInt(36);

                Collections.shuffle(colorPick);

                if (numOne % 2 == 0)
                {
                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Congratulations, you've won.");
                    betNum=betNum*2;
                    total+=betNum;

                }
                else
                    {
                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Sorry, you've lost this bet.");
                    lostBet = 0 - betNum;
                    total+=lostBet;
                    }
            }

            else if (choice.equalsIgnoreCase("odd"))
            {

                System.out.println("Enter in your bet amount:");

                betNum = input.nextDouble();

                numOne = 1 + rnd.nextInt(36);

                Collections.shuffle(colorPick);

                if (numOne % 2 != 0)
                {
                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Congratulations, you've won.");
                    betNum=betNum*2;
                    total+=betNum;
                }
                else {
                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Sorry, you've lost this bet.");
                    lostBet = 0 - betNum;
                    total+=lostBet;

                }
            }

            else if (choice.equalsIgnoreCase("low")) {

                System.out.println("Enter in your bet amount:");

                betNum = input.nextDouble();

                numOne = 1 + rnd.nextInt(36);

                Collections.shuffle(colorPick);

                if ((numOne > 1) & (numOne < 18))
                {
                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Congratulations, you've won.");
                    betNum=betNum*2;
                    total+=betNum;
                }
                else
                    {
                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Sorry, you've lost this bet.");
                    lostBet = 0 - betNum;
                    total+=lostBet;

                    }

            }

            else if (choice.equalsIgnoreCase("high")) {

                System.out.println("Enter in your bet amount:");

                betNum = input.nextDouble();

                numOne = 1 + rnd.nextInt(36);

                Collections.shuffle(colorPick);

                if ((numOne > 19) & (numOne < 36))
                {
                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Congratulations, you've won.");
                    betNum=betNum*2;
                    total+=betNum;


                }
                else
                    {
                    System.out.println("The ball landed on" + " " + numOne + " " + colorPick.get(0) + "\n" + "Sorry, you've lost this bet.");
                    lostBet = 0 - betNum;
                    total+=lostBet;

                }

            }
            System.out.println("\nYou currently have $"+total);
        }

    }





