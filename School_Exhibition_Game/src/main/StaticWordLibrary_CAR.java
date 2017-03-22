package main;





/**
 * Implementation of the logic for the Anagram Game application.
 */
final class StaticWordLibrary_CAR extends WordLibrary_CAR {

    private static final String[] WORD_LIST = {
        "bugs bunny",
        "babs",
        "charlie brown",
        "snoopy",
        "kid and kat",
        "dennis the menace",
        "dexter",
        "dee dee",
        "garfield",
        "odie",
        "doraemon",
        "barney rubble",
        "lilo",
        "stitch",
        "mickey mouse",
        "pluto",
        "goofy",
        "scooby doo",
        "shaggy",
        "tom and jerry",
        "yogi bear",
        "boo boo",
        "aladin",
        "phineas",
        "donald duck",
        "simba",
        "cinderella",
        "peter pan",
        "doris",
        "bolt",
        "oliver",
        "alice",
        "tarzan",
        "oggy",
        "chota bheem",
        "ben",
        "shin chan",
        "maddy"};

    private static final String[] SCRAMBLED_WORD_LIST = {
        "usbg nbnyu",
        "asbb",
        "eacihlr wonbr",
        "oyspno",
        "dki dan atk",
        "nsdine het ncemea",
        "xreedt",
        "ede ede",
        "fdelgari",
        "deoi",
        "areoomnd",
        "anybre beulrb",
        "lloi",
        "icshtt",
        "cemyik uesmo",
        "tuopl",
        "fogoy",
        "oysboc odo",
        "ggshya",
        "mto nda reyjr",
        "oiyg erba",
        "obo obo",
        "ladnia",
        "hnesaip",
        "nadlod ckud",
        "miabs",
        "nciredlela",
        "eterp anp",
        "sirdo",
        "oltb",
        "erviol",
        "licea",
        "anzrta",
        "gygo",
        "hotca behem",
        "enb",
        "hins hacn",
        "damdy"
    };
    
    final static WordLibrary_CAR DEFAULT = new StaticWordLibrary_CAR();

    /**
     * Singleton class.
     */
    private StaticWordLibrary_CAR() {
    }

    /**
     * Gets the word at a given index.
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return WORD_LIST[idx];
    }

    /**
     * Gets the word at a given index in its scrambled form.
     * @param idx index of required word
     * @return word at that index in its scrambled form
     */
    public String getScrambledWord(int idx) {
        return SCRAMBLED_WORD_LIST[idx];
    }

    /**
     * Gets the number of words in the library.
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return WORD_LIST.length;
    }

    /**
     * Checks whether a user's guess for a word at the given index is correct.
     * @param idx index of the word guessed
     * @param userGuess the user's guess for the actual word
     * @return true if the guess was correct; false otherwise
     */
    public boolean isCorrect(int idx, String userGuess) {
        return userGuess.equals(getWord(idx));
    }

}
