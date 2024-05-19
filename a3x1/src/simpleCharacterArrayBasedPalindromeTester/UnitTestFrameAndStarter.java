// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package simpleCharacterArrayBasedPalindromeTester;


import static org.junit.jupiter.api.Assertions.*;
//
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Stack;
import org.junit.jupiter.api.Test;

import simpleCharacterArrayBasedPalindromeTester.TestFrameAndStarter.TestSupportException;
import stuffBeginnersDontHaveToUnderstand.Version;


/**
 * (Unit-)TestFrame for Palindrome Tester
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          Px@Hamburg-UAS.eu
 * @version {@value #encodedVersion}
 */
public class UnitTestFrameAndStarter {
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
    
    
    
    
    
    //##########################################################################
    //###
    //###   taken from "TS class"
    //###
    /**
     * {@link TestSupportException} ...
     * 
     * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
     *          Px@Hamburg-UAS.eu
     * @version {@value #encodedVersion}
     */
    private static class TestSupportException extends RuntimeException {
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
        //
        final static private long serialVersionUID = version.getEncodedVersion();
        
        
        
        final private String errorMessage;
        final private Throwable causingThrowable;
        
        private TestSupportException( final String message,  final Throwable throwable ){   // package scope on purpose
            super( message );
            causingThrowable = throwable;
            if( null!=causingThrowable ){
                errorMessage = " (caused by: \"" + causingThrowable.toString() + "\")";
            }else{
                errorMessage = message;
            }//if
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
        
        @Override
        public String getMessage(){
            return errorMessage;
        }//method()
        
    }//class
    
    private static Object callFunction(
        final Object objectUnderTest,
        final String requestedMethodName,
        final Class<?>[] requestedParameterTypes,
        final Object[] actualParameter
    ){
        try{
            final Class<?> classOfObjectUnderTest = objectUnderTest.getClass();
            final Method method = classOfObjectUnderTest.getMethod( requestedMethodName, requestedParameterTypes );
            final Object result = method.invoke( objectUnderTest, actualParameter );
            return result;
        }catch( final NoSuchMethodException | IllegalAccessException ex ){
            throw new TestSupportException( String.format( "method \"%s\" can NOT be called properly", requestedMethodName ),  ex );
        }catch( final InvocationTargetException ex ){
            throw new TestSupportException( String.format( "method \"%s\" can NOT be called properly", requestedMethodName ),  ex.getCause() );
        }//try 
    }//method()
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
    
    
    
    
    //##########################################################################
    //###
    //###   the TEST itself
    //###
    
    @Test
    public void testSimple01(){
        final String theTextAsString = "lalilu";
        final char[] theTextAsCharArray = theTextAsString.toCharArray();
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ char[].class }, new Object[]{ theTextAsCharArray } ));
        assertEquals( false, computedResult );
    }//method()
    
    @Test
    public void testSimple02(){
        final String theTextAsString = "blabla";
        final char[] theTextAsCharArray = theTextAsString.toCharArray();
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ char[].class }, new Object[]{ theTextAsCharArray } ));
        assertEquals( false, computedResult );
    }//method()
    
    @Test
    public void testSimple03(){
        final String theTextAsString = "tritratrulala";
        final char[] theTextAsCharArray = theTextAsString.toCharArray();
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ char[].class }, new Object[]{ theTextAsCharArray } ));
        assertEquals( false, computedResult );
    }//method()
    
    @Test
    public void testSimple04(){
        final String theTextAsString = "ede";
        final char[] theTextAsCharArray = theTextAsString.toCharArray();
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ char[].class }, new Object[]{ theTextAsCharArray } ));
        assertEquals( true, computedResult );
    }//method()
    
    @Test
    public void testSimple05(){
        final String theTextAsString = "otto";
        final char[] theTextAsCharArray = theTextAsString.toCharArray();
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ char[].class }, new Object[]{ theTextAsCharArray } ));
        assertEquals( true, computedResult );
    }//method()
    
    @Test
    public void testSimple06(){
        final String theTextAsString = "reliefpfeiler";
        final char[] theTextAsCharArray = theTextAsString.toCharArray();
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ char[].class }, new Object[]{ theTextAsCharArray } ));
        assertEquals( true, computedResult );
    }//method()
    
    @Test
    public void testSeriousEvenPoRandomBased(){
        for( int runNo=0; runNo<13; runNo++ ){
            for( int l=1; l<21; l++ ){
                final StringBuilder sb = new StringBuilder();
                final Stack<Character> stack = new Stack<>();
                for( int i=0; i<l; i++ ){
                    final char c = (char)( 'a' + (char)( 26*Math.random() ));
                    stack.push( c );
                    sb.append( c );
                }//for
                while( !stack.isEmpty() )  sb.append( stack.pop() );
                final String theTextAsString = sb.toString();
                final char[] theTextAsCharArray = theTextAsString.toCharArray();
                
                final PalindromeTester pt = new PalindromeTester();
                final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ char[].class }, new Object[]{ theTextAsCharArray } ));
                assertEquals( true, computedResult );
            }//for
        }//for
    }//method()
    
    @Test
    public void testSeriousOddPoRandomBased(){
        for( int runNo=0; runNo<13; runNo++ ){
            for( int l=1; l<21; l++ ){
                final StringBuilder sb = new StringBuilder();
                final Stack<Character> stack = new Stack<>();
                for( int i=0; i<l; i++ ){
                    final char c = (char)( 'a' + (char)( 26*Math.random() ));
                    stack.push( c );
                    sb.append( c );
                }//for
                sb.append( (char)( 'a' + (char)( 26*Math.random() )));
                while( !stack.isEmpty() )  sb.append( stack.pop() );
                final String theTextAsString = sb.toString();
                final char[] theTextAsCharArray = theTextAsString.toCharArray();
                
                final PalindromeTester pt = new PalindromeTester();
                final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ char[].class }, new Object[]{ theTextAsCharArray } ));
                assertEquals( true, computedResult );
            }//for
        }//for
    }//method()    
    
    @Test
    public void testSeriousEvenNe(){
        for( int l=2; l<42; l+=2 ){
            for( int p=0; p<l; p++ ){
                final StringBuilder sb = new StringBuilder();
                for( int i=0; i<l; i++ ){
                    sb.append( i!=p ? "x" : "o" );
                }//for
                final String theTextAsString = sb.toString();
                final char[] theTextAsCharArray = theTextAsString.toCharArray();
                
                final PalindromeTester pt = new PalindromeTester();
                final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ char[].class }, new Object[]{ theTextAsCharArray } ));
                assertEquals( false, computedResult );
            }//for
        }//for
    }//method()
    
    @Test
    public void testSeriousOddNe(){
        for( int m=1; m<23; m++ ){
            final int l = 2*m+1;
            for( int p=0; p<l; p++ ){
                if( p!=m ){
                    final StringBuilder sb = new StringBuilder();
                    for( int i=0; i<l; i++ ){
                        sb.append( i!=p ? "x" : "o" );
                    }//for
                    final String theTextAsString = sb.toString();
                    final char[] theTextAsCharArray = theTextAsString.toCharArray();
                    
                    final PalindromeTester pt = new PalindromeTester();
                    final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ char[].class }, new Object[]{ theTextAsCharArray } ));
                    assertEquals( false, computedResult );
                }//if
            }//for
        }//for
    }//method()
    
}//class
