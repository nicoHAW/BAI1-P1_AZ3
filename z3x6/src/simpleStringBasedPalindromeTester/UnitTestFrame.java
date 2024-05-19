package simpleStringBasedPalindromeTester;


import static org.junit.jupiter.api.Assertions.*;
//
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


/**
 * TestFrame for Palindrome Tester
 * 
 * @author   Michael Schaefers ;  P1@Hamburg-UAS.eu 
 * @version  2021/05/01
 */
public class UnitTestFrame{
    
    //##########################################################################
    //###
    //###   taken from "TS class"
    //###
    
    private static class TestSupportException extends RuntimeException {
        
        final private String errorMessage;
        final private Throwable causingThrowable;
        final static private long serialVersionUID = 2017_11_05_001L;
        
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
    
    final static private int commonLimit = 4_000;                               // timeout resp. max. number of ms for test
    
    
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testSimple01(){
        final String theText = "lalilu";
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ String.class }, new Object[]{ theText } ));
        assertEquals( false, computedResult );
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testSimple02(){
        final String theText = "blabla";
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ String.class }, new Object[]{ theText } ));
        assertEquals( false, computedResult );
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testSimple03(){
        final String theText = "tritratrulala";
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ String.class }, new Object[]{ theText } ));
        assertEquals( false, computedResult );
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testSimple04(){
        final String theText = "ede";
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ String.class }, new Object[]{ theText } ));
        assertEquals( true, computedResult );
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testSimple05(){
        final String theText = "otto";
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ String.class }, new Object[]{ theText } ));
        assertEquals( true, computedResult );
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testSimple06(){
        final String theText = "reliefpfeiler";
        final PalindromeTester pt = new PalindromeTester();
        final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ String.class }, new Object[]{ theText } ));
        assertEquals( true, computedResult );
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
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
                final PalindromeTester pt = new PalindromeTester();
                final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ String.class }, new Object[]{ sb.toString() } ));
                assertEquals( true, computedResult );
            }//for
        }//for
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
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
                final PalindromeTester pt = new PalindromeTester();
                final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ String.class }, new Object[]{ sb.toString() } ));
                assertEquals( true, computedResult );
            }//for
        }//for
    }//method()    
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testSeriousEvenNe(){
        for( int l=2; l<42; l+=2 ){
            for( int p=0; p<l; p++ ){
                final StringBuilder sb = new StringBuilder();
                for( int i=0; i<l; i++ ){
                    sb.append( i!=p ? "x" : "o" );
                }//for
                final PalindromeTester pt = new PalindromeTester();
                final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ String.class }, new Object[]{ sb.toString() } ));
                assertEquals( false, computedResult );
            }//for
        }//for
    }//method()
    
    @Test
    @Timeout(value=commonLimit,unit=TimeUnit.MILLISECONDS)
    public void testSeriousOddNe(){
        for( int m=1; m<23; m++ ){
            final int l = 2*m+1;
            for( int p=0; p<l; p++ ){
                if( p!=m ){
                    final StringBuilder sb = new StringBuilder();
                    for( int i=0; i<l; i++ ){
                        sb.append( i!=p ? "x" : "o" );
                    }//for
                    final PalindromeTester pt = new PalindromeTester();
                    final boolean computedResult = (boolean)( callFunction( pt, "isPalindrome", new Class[]{ String.class }, new Object[]{ sb.toString() } ));
                    assertEquals( false, computedResult );
                }//if
            }//for
        }//for
    }//method()
    
}//class
