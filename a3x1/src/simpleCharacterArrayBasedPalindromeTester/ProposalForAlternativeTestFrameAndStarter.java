// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package simpleCharacterArrayBasedPalindromeTester;


import java.util.Scanner;
import stuffBeginnersDontHaveToUnderstand.Version;


//###
//### Wenn Sie einen eigenen TestFrame entwickeln - was ausdrücklich gut wäre,
//### dann sollten Sie den Klassennamen (mit "Refactoring") ändern
//### Z.B. in  "MyAlternativeTestFrame"
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
 * Your alternative TestFrameAndStarter for {@link PalindromeTester}.
 * 
// @author  (your name(s))  based on template from Michael Schaefers
// @version (a version number or a date)
 */
public class ProposalForAlternativeTestFrameAndStarter {
    
    /**
     * Method to start test.
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        // Führen Sie (bis auf eine mögliche Änderung des Klassennamens)
        // KEINE Änderungen oberhalb dieser Zeilen durch
        //
        // U.U. weist dieser TestFrame erst dann keine Syntax-Fehler mehr auf
        // wenn Sie den PalindromeTester (fehlerfrei) implementiert haben
        //###
        //###
        //###
        //###   HIER kommt Ihr Code zum Testen hin ;-)
        //###
        //###                    VVVV
        //###                    VVVV
        //###                    VVVV
        //###   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###      VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###         VVVVVVVVVVVVVVVVVVVVVVVVVV
        //###            VVVVVVVVVVVVVVVVVVVV
        //###               VVVVVVVVVVVVVV
        //###                  VVVVVVVV
        //###                     VV
        
        boolean result = false;
        final PalindromeTester palindromeTester = new PalindromeTester();
        
        // Nur ein paar einfache Vorschläge:
        // =================================
        
        // Version 1
        String theText_v1 = "blabla";                               // <<-- Der TestCase - zunächst als String
        char[] text_v1 = theText_v1.toLowerCase().toCharArray();    // String (geeignet) in char[] wandeln
      //result = palindromeTester.isPalindrome( text_v1 );
        //
        System.out.printf(
            "Der Text: \"%s\" ist %s Palindrom\n",
            String.copyValueOf( text_v1 ),                          // char[] in String wandeln
            result ? "ein" : "KEIN"
        );
        System.out.printf( "\n\n" );
        
        
        // Version 2
        char[] text_v2 = { 'l', 'a', 'l', 'i', 'l', 'u' };          // <<-- Der TestCase - direkt als char[]
      //result = palindromeTester.isPalindrome( text_v2 );
        //
        System.out.printf(
            "Der Text: \"%s\" ist %s Palindrom\n",
            String.copyValueOf( text_v2 ),                          // char[] in "üblichen" String wandeln
            result ? "ein" : "KEIN"
        );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "THIS IS THE END" );
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Führen Sie KEINE Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    }//method()
    
}//class
