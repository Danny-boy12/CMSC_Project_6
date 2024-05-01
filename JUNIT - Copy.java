import static org.junit.Assert.*;
import org.junit.Test;

public class JUNIT {
//java doc
	/**
	*this class creates a JUnit test against .length(),charAt, substring(), and indexOf().
	*to test length, a string was created which equaled "Hello" and an assert method was used to determine the lenght of the
	*string is equal to 5
	* 
	*
	*/
	
	/**to test length, a string was created which equaled "Hello" and an assert method was used to determine the lenght of the
	*string is equal to 5
	 */
    @Test
    public void testLength() {
        String string1 = "Hello";
        assertEquals(5, string1.length());
    }
    /**to test charAt() a new string was created also called "hello" and 5 assert functions where used to  
     * determine if the character is equal to its position in the string
	 */
    @Test
    public void testCharAt() {
        String str2 = "Hello";
        assertEquals('H', str2.charAt(0));
        assertEquals('e', str2.charAt(1));
        assertEquals('l', str2.charAt(2));
        assertEquals('l', str2.charAt(3));
        assertEquals('o', str2.charAt(4));
    }

    /**to test substring a new string was used: Hello World. then assert was used to test that 
     * the space in the string was not included and the second assert determines that the index
     * does not go out of bounds
	 */
    @Test
    public void testSubstring() {
        String str3 = "Hello World";
        assertEquals("Hello", str3.substring(0, 5));
        assertEquals("World", str3.substring(6));
    }
/**
 * first assert determines that world is started at the 6th index.
 */
    @Test
    public void testIndexOf() {
        String str4 = "Hello World";
        assertEquals(6, str4.indexOf("World"));
        assertEquals(-1, str4.indexOf("Java"));
    }
}

