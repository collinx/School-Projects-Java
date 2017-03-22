package main;




import java.util.Arrays;
import junit.framework.TestCase;

/**
 * Test of the functionality of {@link WordLibrary_CAR}.
 */
public class WordLibraryTest_CAR extends TestCase {
    WordLibrary_CAR wordLibrary;

    public WordLibraryTest_CAR(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
        wordLibrary = WordLibrary_CAR.getDefault();
    }
    
    

    /**
     * Test of {@link WordLibrary_CAR#isCorrect}.
     */
    public void testIsCorrect() {
        for (int i = 0; i < wordLibrary.getSize(); i++) {
            String clearWord = wordLibrary.getWord(i);
            String scrambledWord = wordLibrary.getScrambledWord(i);
            assertTrue("Scrambled word \"" + scrambledWord +
                       "\" at index: " + i +
                       " does not represent the word \"" + clearWord + "\"",
                       isAnagram(clearWord, scrambledWord));
        }
    }

    /**
     * Tests whether given anagram represents the word.
     * @param clearWord The word in clear text
     * @param scrambledWord Scrambled version of the word
     * @return true if the scrambledWord is correct anagram of clearWord
     */
    private boolean isAnagram(String clearWord, String scrambledWord) {
        char[] clearArray = clearWord.toCharArray();
        char[] scrambledArray = scrambledWord.toCharArray();
        Arrays.sort(clearArray);
        Arrays.sort(scrambledArray);
        return Arrays.equals(clearArray, scrambledArray);
    }

}
