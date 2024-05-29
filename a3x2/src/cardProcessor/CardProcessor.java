package cardProcessor;


import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;



/**
 * CardProcessor - sort cards in-place - see task
 * 
 * @author  Nico Pätzel 
 * @version Version 1 - 28.05.2024
 */
public class CardProcessor {

    int cardSuites = 4;
    int cardRanks = 13;

    public Card[][] generateCardMatrix(Card[] givenCards) {

        int cardsInDeck = givenCards.length;


        //   Deck cardDeck = new Deck();  <- not necessary

        Card[][] cardDeckMatrix = new Card[cardSuites][cardRanks];

        for (int i=0; i<cardsInDeck; i++) { 
            //   Card currentCard = cardDeck.deal(); <- not necessary
            Card currentCard = givenCards[i];
            Suit currentSuit = currentCard.getSuit();
            int currentSuitValue = currentSuit.ordinal();
            Rank currentRank = currentCard.getRank();
            int currentRankValue = currentRank.ordinal();

            cardDeckMatrix[currentSuitValue][currentRankValue] = currentCard;

        } // for

        return cardDeckMatrix;

    } //method


    public void sortCards( final Card[] cardsToBeSorted ){
        // 


        Card[][] cardDeckMatrix = generateCardMatrix(cardsToBeSorted);

        /* Is this somehhow possible?
         * 
         * Card[][] cardDeckMatrix;
         * generateCardMatrix(cardsToBeSorted);
         * cardDeckMatrix = cardsToBeSorted;
         */
        int position = 0;
        for (int j=cardRanks-1;j!=0; j--) {
            for (int i=cardSuites-1; i!=0; i--) {
                if (cardDeckMatrix[i][j] != null) {
                    cardsToBeSorted[position] = cardDeckMatrix[i][j];
                    position++;
                } //if
            } //for
        } //for
    }//method()
}//class
