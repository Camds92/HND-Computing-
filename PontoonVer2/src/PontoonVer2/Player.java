package PontoonVer2;

import java.util.Scanner;

public class Player
{
    private String playerName;
    private Hand playerHand;

    public Player()
    {
        setPlayerName();
        playerHand = new Hand();
    }

    public Player(String playerName)
    {
        this.playerName = playerName;
        playerHand = new Hand();
    }

    public String getPlayerName()
    {
        return playerName;
    }

    public void setPlayerName()
    {
        Scanner kboard = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        this.playerName = kboard.next();
        kboard.close();
    }

    public void displayPlayer()
    {
        System.out.println(playerName);
    }

    public Hand getPlayerHand()
    {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand)
    {
        this.playerHand = playerHand;
    }

    public void addToHand(Hand currentHand, Card newCard)
    {
        this.playerHand.addCard(currentHand, newCard);
        setPlayerHand(playerHand);
    }
}
