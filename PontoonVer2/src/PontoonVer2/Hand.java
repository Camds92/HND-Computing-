package PontoonVer2;

import java.util.ArrayList;

public class Hand
{
    int totalValue;
    int noOfCards;
    ArrayList<Card> currentHand;

    public Hand()
    {
        currentHand = new ArrayList<Card>();
    }

    public int getTotalValue()
    {
        return totalValue;
    }

    public void setTotalValue(int totalValue)
    {
        this.totalValue = totalValue;
    }

    public int getNoOfCards()
    {
        return noOfCards;
    }

    public void setNoOfCards(Hand playerHand)
    {
        this.noOfCards = playerHand.currentHand.size();
    }

    public ArrayList<Card> getCurrentHand()
    {
        return currentHand;
    }

    public void setCurrentHand(ArrayList<Card> currentHand)
    {
        this.currentHand = currentHand;
    }

    public void addCard(Hand userHand, Card dealtCard)
    {
        userHand.currentHand.add(dealtCard);
        this.totalValue = this.totalValue + calculateCardValue(dealtCard);
        this.noOfCards++;
    }

    public void displayPlayerHand()
    {
        System.out.println("Cards in hand");
        for(Card i : currentHand)
        {
            System.out.println(i);
        }
        System.out.println("Your total hand value is: " +this.totalValue);
    }

    public String toString()
    {
        return currentHand.toString();
    }

    //Method to calculate what value a card holds
    public int calculateCardValue(Card cardDealt)
    {
        int cardValue = 0;

        if (cardDealt.toString().startsWith("Ace"))
        {
            cardValue = 1;
        }
        if (cardDealt.toString().startsWith("Two"))
        {
            cardValue = 2;
        }
        if (cardDealt.toString().startsWith("Three"))
        {
            cardValue = 3;
        }
        if (cardDealt.toString().startsWith("Four"))
        {
            cardValue = 4;
        }
        if (cardDealt.toString().startsWith("Five"))
        {
            cardValue = 5;
        }
        if (cardDealt.toString().startsWith("Six"))
        {
            cardValue = 6;
        }
        if (cardDealt.toString().startsWith("Seven"))
        {
            cardValue = 7;
        }
        if (cardDealt.toString().startsWith("Eight"))
        {
            cardValue = 8;
        }
        if (cardDealt.toString().startsWith("Nine"))
        {
            cardValue = 9;
        }
        if (cardDealt.toString().startsWith("Ten"))
        {
            cardValue = 10;
        }
        if (cardDealt.toString().startsWith("Jack"))
        {
            cardValue = 10;
        }
        if (cardDealt.toString().startsWith("Queen"))
        {
            cardValue = 10;
        }
        if (cardDealt.toString().startsWith("King"))
        {
            cardValue = 10;
        }

        return cardValue;
    }
}
