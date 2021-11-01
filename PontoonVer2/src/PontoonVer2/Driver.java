package PontoonVer2;

import java.util.Scanner;

public class Driver
{

    public static void Game()
    {
        //Initialises the Objects
        Scanner kboard = new Scanner(System.in);
        Deck deck = new Deck();
        Player p1 = new Player("Cameron");
        Player dealer = new Player("Dealer");


        //Initialises local variables
        String userChoice;

        System.out.println("The game has begun!!");

        //Shuffles the deck
        deck.shuffleDeck();

        //Adds a card from the deck to the hand
        p1.getPlayerHand().addCard(p1.getPlayerHand(), deck.drawCard());
        p1.getPlayerHand().addCard(p1.getPlayerHand(), deck.drawCard());

        //Displays the users hand
        p1.getPlayerHand().displayPlayerHand();

        System.out.println("Would you like to draw another card? Y/N");
        userChoice = kboard.nextLine();

        while (userChoice.equalsIgnoreCase("y") && p1.getPlayerHand().totalValue <= 21)
        {
            //Adds a card from the deck to the hand
            //And displays the users hand
            p1.getPlayerHand().addCard(p1.getPlayerHand(), deck.drawCard());
            p1.getPlayerHand().displayPlayerHand();

            if (p1.getPlayerHand().totalValue <= 21)
            {
                System.out.println("Do you wish to draw another card? Y/N");
                userChoice = kboard.nextLine();
            }
            else if(p1.getPlayerHand().totalValue > 21)
            {
                System.out.println("You are Bust!!");
                break;
            }//end if statement
        }//end while statement

        if (p1.getPlayerHand().totalValue > 21)
        {
            System.out.println("Game Over!!");
        }
        else
        {
            while(dealer.getPlayerHand().totalValue <= 16 )
            {
                dealer.getPlayerHand().addCard(dealer.getPlayerHand(), deck.drawCard());

                if(dealer.getPlayerHand().totalValue > 21)
                {
                    System.out.println("Dealer has bust!!");
                    break;
                }//end inner if statement
            }//end while statement

            if(p1.getPlayerHand().totalValue > dealer.getPlayerHand().totalValue)
            {
                System.out.println("The house has: " +dealer.getPlayerHand().totalValue);
                System.out.println("You have: " +p1.getPlayerHand().totalValue);
                System.out.println("You have beaten the house!!");
            }
            else if(dealer.getPlayerHand().totalValue > 21)
            {
                System.out.println("You Win!!");
            }
            else
            {
                System.out.println("The house has: " +dealer.getPlayerHand().totalValue);
                System.out.println("You have: " +p1.getPlayerHand().totalValue);
                System.out.println("The house wins!! You lose!!");
            }//end inner if statement
        }//end outer if statement
    }//end game method

    public static void main(String[] args)
    {
        Scanner kboard = new Scanner(System.in);
        int gameCount = 0; //Stores the amount of games played
        int userChoice; //Stores the users choice

        System.out.println("Welcome to Pontoon!!");

        Game();
        gameCount++;

        System.out.println("Would you like to play another game? 1. Play another Game OR 2. Quit playing");
        userChoice = kboard.nextInt();

        while (userChoice != 2)
        {
            if (userChoice == 1)
            {
                Game();
                gameCount++;
            }
            else if (userChoice != 1 || userChoice != 2)
            {
                System.out.println("Invalid input!");
            }//end if statement

            System.out.println("Would you like to play another game? 1. Play another Game OR 2. Quit playing");
            userChoice = kboard.nextInt();
        }//end while statement

        System.out.println("You have played " + gameCount + " games");
        System.out.println("Thank you for playing!");
        kboard.close();
    }//end main method
}//end class
