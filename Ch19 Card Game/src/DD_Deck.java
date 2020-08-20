import java.util.Arrays;
import java.util.Collections;
/**
 * @author Dolunay Dagci
 * Due Date: Sunday, April 21, 2019
 * Assignment: Ch19 Card Game
 * This class contains 52 cards, and a shuffler and a deal method.
 */
 class DD_Deck {

    private int cardsUsed; //# of cards used
    private DD_Card[] cards; //card reference object

    /**
     * Constructor
     */
    DD_Deck(){
        this.cards = new DD_Card[52]; //create 52 cards
        int cardCreated = 0;
        //create 52 cards of every suits and values
        for (DD_SUITS s : DD_SUITS.values()) {
            for (DD_VALUES v : DD_VALUES.values()) {
                cards[cardCreated] = new DD_Card(v, s); //create cards
                cardCreated++;
            }
        }
        cardsUsed = 0;
    }
    /**
     * Randomly shuffles the cards in the deck
     */
    void shuffle() {
       Collections.shuffle(Arrays.asList(cards)); //I am using Collections class's shuffle method
        cardsUsed = 0;
    }

    /**
     *
     * @return one card at a time
     */
    DD_Card deal() {
        if (cardsUsed == cards.length) //if all the cards are used, shuffle cards
            shuffle();
        cardsUsed++;
        return cards[cardsUsed - 1];
    }
}
