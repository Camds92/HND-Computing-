package PontoonVer2;

import java.util.Collections;
import java.util.LinkedList;

public class Deck
{
    final private LinkedList<Card> deck = new LinkedList<Card>();

    public Deck()
    {
        for(Suit suit : Suit.values())
        {
            for(Face face : Face.values())
            {
               deck.add(new Card(suit, face));
            }
        }
    }

    public String toString()
    {
        return deck.toString();
    }

    public LinkedList<Card> getDeck()
    {
        return deck;
    }

    public void shuffleDeck()
    {
        Collections.shuffle(deck);
        System.out.println("Deck has been shuffled!");
    }

    //Method to test creating deck works
    public void displayDeck()
    {
        for(Card i : deck)
        {
            System.out.println(i);
        }
    }

    public Card drawCard()
    {
       return deck.pollFirst();
    }


}
