import java.util.Scanner;

public class InputWordsAndLetters implements Constants{

    private char[] UserWORD;
    private char enteredLetter;
    private char[] userWordUnderscored;

    public void enterTheWord(){
        Scanner scanner = new Scanner(System.in);
        String UserWORDString = scanner.nextLine();
        UserWORD = UserWORDString.toLowerCase().toCharArray();
        userWordToUnderscore();
    }

    public void enterTheLetter(){
        Scanner scanner = new Scanner(System.in);
        String enteredLetterString = scanner.nextLine();
        if (enteredLetterString.length() == 1){
            enteredLetter = enteredLetterString.toLowerCase().charAt(0);
        } else {
            System.out.println(Constants.ERRORinLetterEntry);
        }
    }

    public void userWordToUnderscore (){
        int wordLength = UserWORD.length;
        userWordUnderscored = new char[wordLength];
//        char[] wordUnderscored = new char[wordLength];
        for (int i = 0; i < wordLength; i++) {
            userWordUnderscored[i] = '_';
        }
    }

    public char[] getUserWordUnderscored() {
        return userWordUnderscored;
    }
    public char[] getUserWORD() {
        return UserWORD;
    }
    public char getEnteredLetter() {
        return enteredLetter;
    }



}
