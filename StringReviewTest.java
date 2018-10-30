import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.InputStream;

/**
 * Tests for the lab Lab-09-Strings-Review
 *
 * @author  Dave Avis
 * @version 10.25.2018
 */
public class StringReviewTest
{
    /**
     * Default constructor for test class StringReviewTest
     */
    public StringReviewTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Tests countUpString()
     * Looks to see that all of the numbers are present.  Not very sophisitcated.
     */
    @Test
    public void countUpStringTest()
    {
        OutputStream os;
        PrintStream origOut;
        InputStream origIn;
        String ls;

        origIn = System.in;
        origOut = System.out;

        os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        ls = System.getProperty("line.separator");

        int max = 5;
        boolean passed = true;
        StringReview.countUpString( max );
        String output = os.toString().trim();
        for( int i = 0; i <= max; i++ )
        {
            if( ! output.contains( Integer.toString(max) ) )
            {
                passed = false;
            }
        }
        assertTrue( "countUpString failed: ", passed );

        System.setOut(origOut);
        System.setIn(origIn);
    }

    /**
     * Tests countDownString()
     * Looks to see that all of the numbers are present.  Not very sophisitcated.
     */
    @Test
    public void countDownStringTest()
    {
        OutputStream os;
        PrintStream origOut;
        InputStream origIn;
        String ls;

        origIn = System.in;
        origOut = System.out;

        os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        ls = System.getProperty("line.separator");

        int max = 5;
        boolean passed = true;
        StringReview.countDownString( max );
        String output = os.toString().trim();
        for( int i = max; i >= 0; i-- )
        {
            if( ! output.contains( Integer.toString(max) ) )
            {
                passed = false;
            }
        }
        assertTrue( "countDownString failed: ", passed );

        System.setOut(origOut);
        System.setIn(origIn);
    }

    /**
     * Tests cheerName()
     * Looks to see if the passed name is present.
     */
    @Test
    public void cheerNameTest()
    {
        assertTrue( "cheerName failed: ", StringReview.cheerName("Avis").contains("Avis") );
    }

    /**
     * Tests firstLast()
     * Looks to see if the returned name is exactly (first + " " + last)
     */
    @Test
    public void firstLastTest()
    {
        assertEquals( "firstLast failed: ", "Mr. Avis", StringReview.firstLast("Mr.", "Avis") );
    }

    /**
     * Tests firstFive()
     * Checks both a passing and error condition.
     */
    @Test
    public void firstFiveTest()
    {
        assertEquals( "firstFive failed: ", "01234", StringReview.firstFive("0123456789") );
        assertEquals( "firstFive failed: ", "ERROR", StringReview.firstFive("012").toUpperCase() );
    }

    /**
     * Tests cheerName()
     * 
     */
    @Test
    public void middleStringTest()
    {
        assertEquals( "middleString failed: ", "2345", StringReview.middleString("0123456789", 2, 5) );
    }

    /**
     * Tests cheerName()
     * Having a space or no space at the end is fine.
     */
    @Test
    public void spaceLocationsTest()
    {
        assertEquals( "spaceLocations failed: ", "1 6 11 18", StringReview.spaceLocations("A very long string here.").trim() );
    }

    /**
     * Tests the main() method to check for any output.
     */
    @Test
    public void mainTest()
    {
        OutputStream os;
        PrintStream origOut;
        InputStream origIn;
        String ls;

        origIn = System.in;
        origOut = System.out;

        os = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(os);
        System.setOut(ps);
        ls = System.getProperty("line.separator");

        int max = 5;
        boolean passed = true;
        String[] args = {};
        StringReview.main( args );
        String output = os.toString().trim();
        assertTrue( "main method produced no output: ", output.length() > 0 );

        System.setOut(origOut);
        System.setIn(origIn);
    }
}
