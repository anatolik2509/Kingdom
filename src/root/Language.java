package root;

import java.io.IOException;

public class Language {
    public static final int ENGLISH=0;
    public static final int RUSSIAN=1;




    public static int selectedLanguage=ENGLISH;
    public static void selectLanguage(int Language){
        selectedLanguage=Language;
        try {
            Texts.installLanguage(Language);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
