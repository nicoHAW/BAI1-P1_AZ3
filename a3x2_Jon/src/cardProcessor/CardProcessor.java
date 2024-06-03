package cardProcessor;

import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;

/**
 * CardProcessor - sort cards in-place - see task
 * 
 * @author (your name(s))
 * @version (a version number or a date)
 */
public class CardProcessor {
    final static int matrixRows = 4;
    final static int matrixColumns = 13;

    public void sortCards(final Card[] cardsToBeSorted) {

        assert cardsToBeSorted.length <= 52 : "make sure that the number of cards does not exceed 52!";

        Card[][] cardMatrix = generateCardMatrix(cardsToBeSorted); // sort the Cards in a 2 dimensional matrix

        int index = 0;

        // collect the arranged cards in descending rank and according to color

        for (int col = matrixColumns - 1; col >= 0; col--) { 
            for (int row = 0; row < matrixRows; row++) {
                
                    int colorIndex = getColorIndex(row);
                    if (cardMatrix[colorIndex][col] != null) {
                        cardsToBeSorted[index] = cardMatrix[colorIndex][col];
                        index++;    
                    
                }
            }
        }
        
        

    }// method()

    // arranges the cards in a 2 dimensional matrix according to suit (club,
    // spade, heart, diamond) and rank value(ascending)

    private Card[][] generateCardMatrix(Card[] cardsToBeSorted) {

        Card[][] cardMatrix = new Card[matrixRows][matrixColumns];

        for (Card card : cardsToBeSorted) {

            cardMatrix[card.getSuit().ordinal()][card.getRank().ordinal()] = card;
        }
        return cardMatrix;

    }

    
    // black cards first, then red cards
    private int getColorIndex(int tempRowIndex) {
        switch (tempRowIndex) {
        case 0:
            return 0;
        case 3:
            return 1;
        case 2:
            return 2;
        case 1:
            return 3;
        default:
            return -1;
        }
    }

}// class
