package Game;

import com.sun.istack.internal.Nullable;

import java.util.Random;

/**
 * Created by Stem on 04.02.2018.
 */
public class Map {
    public Tile[][] tiles;
    public int sizeX;
    public int sizeY;

    Random random;


    public void generate(long seed,int sizeX,int sizeY){
        this.sizeX=sizeX;
        this.sizeY=sizeY;
        random=new Random(seed);
        tiles=new Tile[sizeX][sizeY];
        for(int x=0;x<sizeX;x++)for (int y=0;y<sizeY;y++){
            tiles[x][y]=new Tile(Tile.WATER);
        }
    }

    public void generateTerrain(int x,int y,int size){
        if(x<0||y<0||x>=sizeX||y>=sizeY||size==0) return;
        if(random.nextInt(100)>74)generateTerrain(x+1,y,size-1);
        if(random.nextInt(100)>74)generateTerrain(x-1,y,size-1);
        if(random.nextInt(100)>74)generateTerrain(x,y-1,size-1);
        if(random.nextInt(100)>74)generateTerrain(x-1,y-1,size-1);
        if(random.nextInt(100)>74)generateTerrain(x,y+1,size-1);
        if(random.nextInt(100)>74)generateTerrain(x-1,y+1,size-1);

    }


}
