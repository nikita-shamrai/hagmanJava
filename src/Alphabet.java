public class Alphabet {
    public static String RussianALPHABET = alphabetBuilder();

    private static String alphabetBuilder(){
        StringBuilder alphabetBuild = new StringBuilder();
        for (int i = 'а'; i <='я' ; i++) {
            alphabetBuild.append((char)i).append(" ");
        }
        return alphabetBuild.toString();
    }

    public static void alphabetLetterCross(char letter){
        char[] alphabetCharArray = RussianALPHABET.toCharArray();
        for (int i = 0; i < alphabetCharArray.length; i++) {
            if (alphabetCharArray[i] == letter) {
                alphabetCharArray [i] = '-';
            }
        }
        RussianALPHABET = String.valueOf(alphabetCharArray);

    }
}
