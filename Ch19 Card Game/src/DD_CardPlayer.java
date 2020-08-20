/**
 * @author Dolunay Dagci
 * Due Date: Sunday, April 21, 2019
 * Assignment: Ch19 Card Game
 * The class represents a hand of cards.
 */
 class DD_CardPlayer {

    //card capacity for each hand is 5 cards
    private DD_Card[] hand = new DD_Card[5];
    private int playerCardsCount = 0; //count for cards

    /**
     * The method getCard gives a card dealt from the Deck
     * @param deck reference of deck of cards
     */
     void getCard(DD_Deck deck) {
        hand[playerCardsCount++ ] = deck.deal(); //deal card to player from Deck Of Cards
    }

    /**
     * This method showCards prints the hand of the player
     */
    void showCards(String player_name) {
        System.out.printf("%s's hand:\n", player_name); //I've added the username of the player as an extra
        for (DD_Card card : hand) {
            System.out.println(card.toString()); //print every card
        }
    }
}
