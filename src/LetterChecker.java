public class LetterChecker {

    private final InputWordsAndLetters inputWordsAndLetters;


    public LetterChecker(InputWordsAndLetters inputWordsAndLetters) {
        this.inputWordsAndLetters = inputWordsAndLetters;
    }

    public void nextTurn() {
        char currentLetter = inputWordsAndLetters.getEnteredLetter();
        char[] currentWord = inputWordsAndLetters.getUserWORD();
        boolean letterIsNotPresent = true;
        for (int i = 0; i < currentWord.length; i++) {
            if (currentLetter == currentWord[i]){
                inputWordsAndLetters.getUserWordUnderscored()[i] = currentLetter;
                Alphabet.alphabetLetterCross(currentLetter);
                letterIsNotPresent = false;
                Console.unlockedLetters++;
            }
        }
        if (letterIsNotPresent){
            Alphabet.alphabetLetterCross(currentLetter);
            Console.moveNumber++;
        }
    }



}
