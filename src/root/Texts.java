package root;

import root.Language;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Texts {
    private static String[] text;

    public static final int COUNT=11;
    public static final int GAME = 0;
    public static final int SETTINGS = 1;
    public static final int EXIT = 2;
    public static final int YES = 3;
    public static final int NO = 4;
    public static final int EXIT_QUESTION = 5;
    public static final int NEW_GAME=6;
    public static final int FULL_SCREEN=7;
    public static final int ON=8;
    public static final int OFF=9;
    public static final int LANGUAGE=10;



    public static String getWord(int word){
        return text[word];
    }
    public static void installLanguage(int Language)throws IOException{
        String[]l={"eng","rus"};
        text=new String[COUNT];
        Scanner sc=new Scanner(new File("src/lib/"+l[Language]+".txt"));
        for (int i=0;i<text.length;i++){
            text[i]=sc.nextLine();
        }
    }
}
