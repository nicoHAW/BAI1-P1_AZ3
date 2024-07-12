// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package patternBasedArrayProcessor;

import java.util.Arrays;

/**
 * ArrayProcessor - see task
 * 
 * @author   (Nico ) 
 * @version  (a version number or a date)
 *
 */
public class ArrayProcessor {
    

    public long process( long[][] theArray ){
        
        
        
        
        boolean[][] myArray = {
                {false, true, true},
                {true, false, false, true},
                {true, false, false, true},
                {false, true, true},
                };
        
        
        System.out.println(Arrays.deepToString(myArray));
        
        
        
        return 0;   // <<<=== Diese Zeile ist falsch!   bzw. nur ein Platzhalter um den Compiler gluecklich zu machen. Die Zeile muss sinnvoll ersetzt werden.
    }//method()
    
    
    
    
    
    
    
    
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // Führen Sie Änderungen oberhalb dieser Zeilen durch.
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
}//class
