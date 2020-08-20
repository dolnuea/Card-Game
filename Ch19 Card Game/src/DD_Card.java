/**
 * @author Dolunay Dagci
 * Due Date: Sunday, April 21, 2019
 * Assignment: Ch19 Card Game
 * This class represents a card from a deck of cards.
 * A card has a suit and a face value.  Suits are in order from low to high: Clubs, Diamonds, Hearts and Spades.
 * The card values from low to high: 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, and Ace.
 * Suits and Values are in separate enum classes.
 */
public class DD_Card  {
    //fields of suits & values
    private DD_SUITS suit;
    private DD_VALUES value;

    /**
     * Constructor
     * @param value from VALUES enum
     * @param suit from SUITS enum
     */
    DD_Card(DD_VALUES value, DD_SUITS suit) {
        this.value = value;
        this.suit = suit;
    }


    /**
     *
     * @return String representation of cards
     * the rank is given first followed by the suit
     */
    public String toString() {
        return value.toString() + " of " + suit.toString();
    }
}