// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;
import java.util.Arrays;
import stuffBeginnersDontHaveToUnderstand.Version;



//###
//### Wenn Sie einen eigenen TestFrame entwickeln - was ausdrücklich gut wäre,
//### dann sollten Sie den Klassennamen (mit "Refactoring") ändern
//### Z.B. in  MyAlternativeTestFrame
//###
//### Ein Nachteil des gestellten TestFrames besteht darin, dass er interaktiv ist
//### und damit für reproduzierbare Testläufe eigentlich NICHT geeignet ist.
//### "Hier" sollten Sie Tests entwickeln, die leicht reproduzierbar sind,
//### damit Sie im Falle eines gefundenen Fehlers auch (leicht) testen können, dass Sie
//###   1.) den Fehler wirklich korrigiert und
//###   2.) keine neuen Fehler bei bereits sicheren Code eingebaut
//### haben.
//###
/**
 * Your alternative TestFrame for {@link PrimeFactorPrinter911}.
 * 
//@author  (your name(s))  based on template from Michael Schaefers
//@version (a version number or a date)
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class ProposalForAlternativeTestFrameAndStarter {
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
     * Method to start test.
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        
        // Das folgende 2-dimensionale Array ist bewusst "ungesund", also NICHT echt 2-dimensional.
        // Das macht hier Sinn, da der testCaseVector gedanklich eine Zusammenstellung (Array)
        // unterschiedlicher Testcases ist, die wiederum Zusammenstellungen (Arrays) von Karten sind.
        final Card[][] testCaseVector = {
            { D2, DA, HA, SA, CA },
            { C2, S3, H4, D5, CA, SA, HA, DA },
            { DJ } /*,
            ... bzw. weitere TestCases
            */
        };
        
        for( final Card[] testCase : testCaseVector ){
            System.out.printf( "Before resp. unsorted:\n" );
            System.out.printf( "%s\n",  Arrays.toString( testCase ));
            System.out.printf( "\n" );
            //
            final CardProcessor cardProcessor = new CardProcessor();
            cardProcessor.sortCards( testCase );
            //
            System.out.printf( "Afterwards resp. (hopefully) sorted:\n" );
            System.out.printf( "%s\n",  Arrays.toString( testCase ));
            System.out.printf( "\n\n\n" );
        }//for
        
        System.out.printf( "THE END" );
        System.out.flush();
    }//method()
    
}//class
