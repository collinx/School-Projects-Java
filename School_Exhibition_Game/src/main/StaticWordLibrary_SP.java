package main;





/**
 * Implementation of the logic for the Anagram Game application.
 */
final class StaticWordLibrary_SP extends WordLibrary_SP {

    private static final String[] WORD_LIST = {
       "charging",
        "blocking",
        "fast break",
        "box out",
        "layup",
        "pivot",
        "endzone",
        "quarter",
        "linebacker",
        "place kicker",
        "wide receiver",
        "interception",
        "scrimmage",
        "out of bounds",
        "half time",
        "coin toss",
        "touchdown",
        "punt",
        "olympics",
        "overtime",
        "free throw",
        "backboard",
        "possession",
        "wheelchair",
        "offense",
        "dribbling",
        "jump shot",
        "rebound",
        "naismith",
        "travelling",
        "tight end",
        "foul",
        "basketball",
        "zone",
        "cricket",
        "volleyball",
        "handball",
        "table tennis" };

    private static final String[] SCRAMBLED_WORD_LIST = {
        
        "grgiahcn",
        "oclkngio",
        "atsf rkeab",
        "xbo uot",
        "pyual",
        "vtoip",
        "ndeoezn",
        "artqeru",
        "neilckearb",
        "acple ckkire",
        "deiw eeiervrc",
        "ertniepcoin",
        "maegmiscr",
        "uto fo onusdb",
        "afhl imet",
        "onic sots",
        "uhcotonwd",
        "tunp",
        "micpslyo",
        "eoeritvm",
        "eref horwt",
        "oaabbkcdr",
        "pssssoeoin",
        "eelirhchwa",
        "fofeens",
        "bbdiirngl",
        "upmj ohst",
        "onuderb",
        "mihtains",
        "lignleavtr",
        "ihgtt ned",
        "oulf",
        "asbktealbl",
        "eozn",
        "ccketir",
        "lleovyallb",
        "anhdallb",
        "balet eninst" };
    
    final static WordLibrary_SP DEFAULT = new StaticWordLibrary_SP();

    /**
     * Singleton class.
     */
    private StaticWordLibrary_SP() {
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
