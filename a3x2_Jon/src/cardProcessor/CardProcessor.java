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
		
		assert cardsToBeSorted.length <= 52: "make sure that the number of cards does not exceed 52!";
		
		Card[][] cardMatrix = generateCardMatrix(cardsToBeSorted); // sort the Cards in a 2 dimensional matrix

		int index = 0;
		
		// collect the arranged cards in descending rank and according to color

		for (int j = matrixColumns - 1; j >= 0; j--) {
			for (int i = 0; i < matrixRows; i++) {
				if (cardMatrix[i][j] != null) {
					cardsToBeSorted[index] = cardMatrix[i][j];
					index++; 
				}
			}
		}
		
		

	}// method()

	// arranges the cards in a 2 dimensional matrix according to suit (club,
	//  spade, heart, diamond) and rank value(ascending)
	
	private Card[][] generateCardMatrix(Card[] cardsToBeSorted) {

		Card[][] cardMatrix = new Card[matrixRows][matrixColumns];

		for (Card card : cardsToBeSorted) {

			cardMatrix[getColorIndex(card)][card.getRank().ordinal()] = card;
		}
		return cardMatrix;

	}
	
	//black cards first, then red cards
	private int getColorIndex(Card card) {
		switch (card.getSuit()) {
		case CLUB:
			return 0;
		case SPADES:
			return 1;
		case HEART:
			return 2;
		case DIAMOND:
			return 3;
		default: throw new IllegalArgumentException("Unknown card!");
			
		}
	}


}// class
