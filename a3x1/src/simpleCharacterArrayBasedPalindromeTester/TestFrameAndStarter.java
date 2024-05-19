// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// Diesen Code müssen Sie NICHT(!) verstehen.
package simpleCharacterArrayBasedPalindromeTester;


import java.lang.reflect.*;
import java.util.Scanner;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * {@link TestFrameAndStarter} for Palindrome Tester
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class TestFrameAndStarter {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00002_002___2023_04_17__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    /**
     * The method {@link #getDecodedVersion()} delivers the code version as reground/readable String.
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){ return version.getDecodedVersion(); }
    // Obiges (ab VERSION) dient nur der Versionierung.
    
    
    
    
    
    /**
     * Method to start test
     * 
     * @param unused  is unused ;-)
     */
    public static void main( final String... unused ){
        try(
            final Scanner workAroundForSeriousUserInterface = new Scanner( System.in );
        ){
            System.out.printf( "Gebe ein(en) Wort/Text ein\n" );
            System.out.printf( "und tippe danach die Return-Teste um die Eingabe abzuschließen.\n" );
            System.out.printf( "=> " );
            //
            final String theText = workAroundForSeriousUserInterface.next();
            final char[] text = theText.toCharArray();
            //
            final PalindromeTester pt = new PalindromeTester();
            final String requestedMethodName = "isPalindrome";
            boolean isPalindromeState;
            try{
                final Class<?> classOfObjectUnderTest = pt.getClass();
                final Method isPalindromeFunction = classOfObjectUnderTest.getMethod( requestedMethodName, char[].class );
                final Object result = isPalindromeFunction.invoke( pt, text );
                isPalindromeState = (boolean)( result );
            }catch( final NoSuchMethodException | IllegalAccessException | InvocationTargetException ex ){
                throw new TestSupportException( String.format( "method \"%s\" can NOT be called properly", requestedMethodName ),  ex );
            }//try 
            
            
            System.out.printf(
                "Der Text: \"%s\" ist %s Palindrom\n",
                String.copyValueOf( text ),
                isPalindromeState ? "ein" : "KEIN"
            );
            System.out.printf( "\n\n" );
            System.out.printf( "THIS IS THE END" );
            
        }catch( final Throwable ex ){
            if( ! (( ex instanceof AssertionError ) || ( ex instanceof IllegalArgumentException ))){
                System.out.flush();
                System.err.printf( "###\n" );
                System.err.printf( "### Uuuupppss, was ist denn da passiert ????\n" );
                System.err.printf( "###\n" );
                System.err.printf( "\n" );
            }//if
            throw( ex );
        }//try
    }//method()
    
    
    
    
    
    
    
    
    
    
    //--------------------------------------------------------------------------
    
    /**
     * {@link TestSupportException} ...
     * 
     * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
     *          Px@Hamburg-UAS.eu
     * @version {@value #encodedVersion}
     */
    public static class TestSupportException extends RuntimeException {
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
        
        
        
        final private Throwable causingThrowable;
        final static private long serialVersionUID = version.getEncodedVersion();
        
        private TestSupportException( final String message,  final Throwable throwable ){   // package scope on purpose
            super( message );
            causingThrowable = throwable;
        }//constructor()
        private TestSupportException( final String message ){
            this( message, new Throwable( "NO causing throwable existent - directly thrown : "+message ));
        }//constructor()
        private TestSupportException(){
            this( "test support functionality broken" );
        }//constructor()
        
        @Override
        public Throwable getCause(){
            return causingThrowable;
        }//method()
        
    }//class
    
}//class
