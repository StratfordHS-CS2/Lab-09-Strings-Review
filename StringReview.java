/**
 * A brief description of StringReview
 * 
 * @author
 * @version
 */
public class StringReview
{
    public static void countUpString( int max )
    {
        // Output a string that counts up each time.
        // Example:
        // countUpString( 3 );
        // should output something like:
        // "We're number 0"
        // "We're number 1"
        // "We're number 2"
        // "We're number 3"
    }
    
    public static void countDownString( int start )
    {
        // Output a string that counts down each time.
        // Example:
        // countDownString( 3 );
        // should output something like:
        // "We're number 3"
        // "We're number 2"
        // "We're number 1"
        // "We're number 0"
    }
    
    public static String cheerName( String name )
    {
        // return a string cheering on the person's name
        // Example:
        // cheerName( "Avis" );
        // should return something like:
        // "Way to go Avis!"
    }
    
    public static String firstLast( String first, String last )
    {
        // return a string combining the first and last name with a
        // space between them.
        // Example:
        // firstLast( "Mr.", "Avis" );
        // should return exactly
        // "Mr. Avis"
    }
    
    public static String firstFive( String str )
    {
        // return a string containing the first 5 characters of str
        // If str does not have 5 characters then return "ERROR"
        // Example:
        // firstFive( "01234567" );
        // should return
        // "01234"
    }
    
    public static String middleString( String str, int start, int end )
    {
        // return a string that contains characters start through (and including) end
        // from str.
        // Example:
        // middleString( "0123456789", 3, 8 );
        // should return
        // "345678"
    }
    
    public static String spaceLocations( String str )
    {
        // return a string containing a list the locations of all of the spaces in str.
        // Example: "a long string" has spaces at "1 6"
    }
     
    public static void main( String[] args )
    {
        // you must add your own tests of each method here.
    }
}