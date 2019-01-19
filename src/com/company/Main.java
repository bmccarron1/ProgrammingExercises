package com.company;
import java.util.Scanner;
import java.io.IOException;
public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        System.out.println("Hi welcome to game, are you ready? 1=yes 2=no 3=quit");

        Scanner scan = new Scanner(System.in);

        boolean gameRunning = true;

        while (gameRunning) {

            String s = scan.nextLine();

            switch (s) {

                case "1":

                    System.out.println("You are waking up in a strange foreign place, what do you do? 1=explore 2=stay put 3=quit");

                    s = scan.nextLine();


                    switch (s) {


                        case "1":
                            System.out.println("You begin to wander around this unfamiliar place");
                            break;

                        case "2":
                            System.out.println("You stay put, when suddenly, you get hit in the head with a rock, what do you do? 1=Run!, 2=Throw rock back, 3=cry, 4=quit");
                            break;

                        case "3":
                            gameRunning = false;
                            break;

                        default:
                            break;

                    }


                    break;

                case "2":





                        System.out.println("You got this! 1=Continue on the game 2=quit");

                        s = scan.nextLine();


                        switch (s) {


                            case "1":

                                System.out.println("You are waking up in a strange foreign place, what do you do? 1=explore 2=stay put 3=quit");

                                s = scan.nextLine();


                                switch (s) {


                                    case "1":
                                        System.out.println("You begin to wander around this unfamiliar place");
                                        break;

                                    case "2":

                                        System.out.println("You take a seat on the grass, when suddenly, you get hit with a rock! What do you do? 1=Run away! 2=Throw a rock back 3=cry 4=quit");

                                        s = scan.nextLine();


                                        switch (s) {


                                            case "1":
                                                System.out.println("You start running down a dark road when suddenly you come across a dark cave and you hear a roar from inside. What do you do? 1=go explore the cave 2=go back! 3=quit");
                                                break;

                                            case "2":
                                                System.out.println("You throw a rock, when suddenly a dragon comes back! He begins to throw a lot rocks back! What do you do? 1=Hide, 2=Try and defend yourself, 3=cry 4=quit");
                                                break;

                                            case "3":
                                                System.out.println("You begin to cry, and then more rocks are thrown at you! What do you do next? 1=Cry more 2=Throw rocks back!!! 3=Just quit already :(");
                                                break;

                                            case "4":
                                                gameRunning = false;
                                                break;

                                            default:
                                                break;

                                        }

                                    case "3":
                                        gameRunning = false;
                                        break;

                                    default:
                                        break;

                                }


                            case "2":
                                gameRunning = false;
                                break;



                            default:
                                break;

                        }


                    case "3":
                        gameRunning = false;
                        break;

                    default:
                        System.out.println("Not an option, sorry!");
                        break;

                }

            }

        }
    }

