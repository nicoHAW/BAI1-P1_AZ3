// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;
import java.util.Arrays;
import java.util.Random;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * {@link TestFrameAndStarter} for ArrayProcessor.
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_001___2023_04_13__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    /**
     * method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        final int numberOfCards = (int)( 53 * Math.random() );
        final Card[] cardsToBeSorted = new Card[numberOfCards];
        Deck deck = new Deck();
        for( int i=0; i<numberOfCards; i++ ) cardsToBeSorted[i] = deck.deal();
        System.out.printf( "Before resp. unsorted:\n" );
        System.out.printf( "%s\n",  Arrays.toString( cardsToBeSorted ));
        System.out.printf( "\n" );
        //
        final CardProcessor cardProcessor = new CardProcessor();
        cardProcessor.sortCards(cardsToBeSorted);
        //
        System.out.printf( "Afterwards resp. (hopefully) sorted:\n" );
        System.out.printf( "%s\n",  Arrays.toString( cardsToBeSorted ));
    }//main()
    
}//class
