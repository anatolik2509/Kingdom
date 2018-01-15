package root;

import root.Language;

public class Texts {
    private static String[][] words = {
            {"Game","Игра"},
            {"Settings","Настройки"},
            {"Exit","Выход"},
            {"Yes","Да"},
            {"No","Нет"},
            {"Do you really want to exit?","Вы действительно хотите выйти?"}
    };

    public static final int GAME = 0;
    public static final int SETTINGS = 1;
    public static final int EXIT = 2;
    public static final int YES = 3;
    public static final int NO = 4;
    public static final int EXIT_QUESTION = 5;

    public static String getWord(int word){
        return words[word][Language.selectedLanguage];
    }
}
