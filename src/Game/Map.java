package Game;

import com.sun.istack.internal.Nullable;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
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
        for(int i=0;i<15;i++){
            int x=random.nextInt(sizeX);
            int y=random.nextInt(sizeY);
            if(tiles[x][y].getType()==Tile.GRASS)i--;
            generateTerrain(x,y,(sizeY+sizeX)/4);
        }
        alignment();
    }

    public void generateTerrain(int x,int y,int size){
        if(x<0||y<0||x>=sizeX||y>=sizeY||size==0||tiles[x][y].getType()==Tile.GRASS) return;
        tiles[x][y].setType(Tile.GRASS);
        if(random.nextInt(100)>50)generateTerrain(x+1,y,size-1);
        if(random.nextInt(100)>50)generateTerrain(x-1,y,size-1);
        if(random.nextInt(100)>50)generateTerrain(x+y%2,y-1,size-1);
        if(random.nextInt(100)>50)generateTerrain(x-1+y%2,y-1,size-1);
        if(random.nextInt(100)>50)generateTerrain(x+y%2,y+1,size-1);
        if(random.nextInt(100)>50)generateTerrain(x-1+y%2,y+1,size-1);
    }

    public void alignment(){
        for(int x=0;x<sizeX;x++)for(int y=0;y<sizeY;y++){
            if(tiles[x][y].getType()==Tile.WATER&&y>0&&x>0&&x<sizeX-1&&y<sizeY-1){
                int count=0;
                if(tiles[x+1][y].isType(Tile.GRASS))count++;
                if(tiles[x-1][y].isType(Tile.GRASS))count++;
                if(tiles[x+y%2][y-1].isType(Tile.GRASS))count++;
                if(tiles[x-1+y%2][y-1].isType(Tile.GRASS))count++;
                if(tiles[x+y%2][y+1].isType(Tile.GRASS))count++;
                if(tiles[x-1+y%2][y+1].isType(Tile.GRASS))count++;
                if(random.nextInt(6)<count)tiles[x][y].setType(Tile.GRASS);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JPanel panel=new panel();
        panel.setPreferredSize(new Dimension(801,800));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
    private static class panel extends JPanel{
        public void paintComponent(Graphics g){
            Map map=new Map();

            map.generate(1,400,400);
            for(int x=0;x<400;x++)for(int y=0;y<400;y++){
                Color color=Color.black;
                if(map.tiles[x][y].getType()==Tile.GRASS) color=Color.GREEN;
                if(map.tiles[x][y].getType()==Tile.WATER) color=Color.BLUE;
                g.setColor(color);
                g.fill3DRect(x*2+y%2,y*2,2,2,false);

            }
        }
    }


}
