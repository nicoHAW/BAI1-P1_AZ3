package simpleStringBasedPalindromeTester;

import java.util.Scanner;


/**
 * TestFrame for Palindrome Tester
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class ProposalForYourTestFrame{
        
    /**
     * Method to start test.
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        // Fuehren Sie (bis auf eine moegliche Aenderung des Klassennamens)
        // KEINE Aenderungen oberhalb dieser Zeilen durch
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
        
        // Nur ein einfacher Vorschlag:
        // ============================
        
        String theText = "blabla";
      //result = palindromeTester.isPalindrome( theText );                      // Kommentar entfernen, sobald isPalindrome implementiert
        //
        System.out.printf(
            "Der Text: \"%s\" ist %s Palindrom\n",
            theText,
            result ? "ein" : "KEIN"
        );
        System.out.printf( "\n\n" );
        
        
        System.out.printf( "THIS IS THE END" );
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Fuehren Sie KEINE Aenderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    }//method()
    
}//class
