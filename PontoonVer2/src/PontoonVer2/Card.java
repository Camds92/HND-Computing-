package PontoonVer2;

public class Card
{
    private Face faceName;
    private Suit suit;

    public Card(Suit suitType, Face face)
    {
        faceName = face;
        suit = suitType;
    }

    public String toString()
    {
        return faceName +  " of " + suit;
    }
}
