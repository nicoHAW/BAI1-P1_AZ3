// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package patternBasedArrayProcessor;


/**
 * ArrayProcessor - see task
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 *
 */
public class ArrayProcessor {

    //###
    //###
    //###
    //###         HIER kommt Ihr Code hin ;-)
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
    public long process( long[][] theArray ){

        int xLength = theArray.length;
        int yLength= theArray[0].length;

        for (int yAchse = 0; yAchse < theArray.length; yAchse++) {
            for (int xAchse = 0; xAchse < theArray[yAchse].length; yAchse++) {

                boolean ArrayFits = testFitting(yAchse, xAchse, theArray);

                if(ArrayFits) {
                    long sum = addArray(yAchse, xAchse, theArray);
                }

            }//forXAchse
        }//forYAchse

        return 0;   // <<<=== Diese Zeile ist falsch!   bzw. nur ein Platzhalter um den Compiler gluecklich zu machen. Die Zeile muss sinnvoll ersetzt werden.
    }//method()


    private boolean testFitting(int xPosition, int yPosition, long[][] theArray) {

        for (int yAchse = 0; yAchse < theArray.length; yAchse++) {
            
        }
            for (int xAchse = 0; xAchse < theArray[yAchse].length; yAchse++) {


                return false;
            }//testFitting



            private long addArray(int xPosition, int yPosition) {
                return 0;
            }//addArray



            //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            // Führen Sie Änderungen oberhalb dieser Zeilen durch.
            //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

        }//class
