public class Console implements Constants {

    private final InputWordsAndLetters inputWordsAndLetters = new InputWordsAndLetters();
    private final LetterChecker letterChecker = new LetterChecker(inputWordsAndLetters);
    public static int moveNumber = 0;
    public static int unlockedLetters = 0;

    public void startTheGame(){
        System.out.println(Constants.ENTERTheWord);
        inputWordsAndLetters.enterTheWord();
 //       ClearConsole();
        consoleSpacer(50);
        startingTheGame();
    }

    private void consoleSpacer(int numberOfLinesToSkip) {
        for (int i = 0; i < numberOfLinesToSkip; i++) {
            System.out.println();
        }
    }

    private void startingTheGame(){
        System.out.println(Constants.STRATINGTheGame);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        gameStarted(moveNumber);
    }

    public void gameStarted(int moveNumber) {
           if (!unlockedLettersChecker(unlockedLetters)) {
               System.out.println(Constants.WORD + String.valueOf(inputWordsAndLetters.getUserWordUnderscored()));
               System.out.println(Constants.ALPHABET + Alphabet.RussianALPHABET);
               System.out.println(Constants.STATUS);
               switch (moveNumber) {
                   case 0 -> System.out.println(Constants.MOVE0);
                   case 1 -> System.out.println(Constants.MOVE1);
                   case 2 -> System.out.println(Constants.MOVE2);
                   case 3 -> System.out.println(Constants.MOVE3);
                   case 4 -> System.out.println(Constants.MOVE4);
                   case 5 -> System.out.println(Constants.MOVE5);
                   case 6 -> System.out.println(Constants.MOVE6);
               }
               System.out.println(Constants.ENTERtheLETTER);
               inputWordsAndLetters.enterTheLetter();
               letterChecker.nextTurn();
               continuePlaying();
           } else {
               System.out.println(Console.YOUWin + Console.TheWordWas + String.valueOf(inputWordsAndLetters.getUserWORD()));
           }
    }

    private boolean unlockedLettersChecker(int unlockedLetters) {
        return unlockedLetters == inputWordsAndLetters.getUserWORD().length;
    }

    private void continuePlaying() {
        consoleSpacer(10);
        if (moveNumber < 7){
            gameStarted(moveNumber);
        } else {
        System.out.println(Constants.FINISHGame);
        System.out.println(Constants.YOULose + Console.TheWordWas + String.valueOf(inputWordsAndLetters.getUserWORD()));
        }
    }


    public static void ClearConsole(){
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system

            if(operatingSystem.contains("Windows")){
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
