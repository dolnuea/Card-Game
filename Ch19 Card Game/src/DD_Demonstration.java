/**
 * @author Dolunay Dagci
 * Due Date: Sunday, April 21, 2019
 * Assignment: Ch19 Card Game
 * This class creates a deck of cards, creates two CardPlayer objects, deals 5 cards to each CardPlayer object,
 * one at a time, and  displays both hands.
 */
public class DD_Demonstration {

    public static void main(String[] args) {
        DD_CardPlayer player1 = new DD_CardPlayer(); //player 1
        DD_CardPlayer player2 = new DD_CardPlayer(); //player 2
        DD_Deck deck = new DD_Deck(); //deck reference object

        deck.shuffle(); //shuffle cards

        for (int i = 0; i < 5; i++) { //deal 5 cards to players
            player1.getCard(deck); //deal one card at a time to player1
            player2.getCard(deck); //deal one card at a time to player2
        }
            //Display hands of players
            player1.showCards("Roxy Lola");
            System.out.println();
            player2.showCards("Captain Cotton Candy");
        }
    }
