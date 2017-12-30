public class Texts {
    private static String[][] words = {
            {"Game","Игра"},
            {""}
    };

    public static final int GAME = 0;

    public static String getWord(int word){
        return words[word][Language.selectedLanguage];
    }
}
