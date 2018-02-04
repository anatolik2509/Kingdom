package Game;

import java.util.ArrayList;

/**
 * Created by Stem on 04.02.2018.
 */
public class Tile {
    private int type;

    public static final int WATER=0;
    public static final int GRASS=1;
    public static final int GRASS_HILLS=2;
    public static final int MOUNTAINS=3;
    public static final int SAND=4;
    public static final int SAND_HILLS=5;
    public static final int SNOW=6;
    public static final int SNOW_HILLS=7;
    public static final int RIVER=8;

    private ArrayList<gameObject>gameObjects;



    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public ArrayList<gameObject> getGameObjects() {
        return gameObjects;
    }

    public Tile(int type){
        this.type=type;
    }
}
