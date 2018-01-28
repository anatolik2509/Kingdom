package root;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;

public class SpriteAnimation implements Runnable{
    private ImageView animation;
    private int width;
    private int heigth;
    private int sprites;
    private int sprite=0;
    private long milis;
    private Thread thread;
    private boolean working=true;
    public SpriteAnimation(ImageView animation,int width,int height,int sprites,long milis){
        this.animation=animation;
        this.width=width;
        this.heigth=height;
        this.sprites=sprites;
        this.milis=milis;
        thread=new Thread(this);
        thread.start();

    }

    @Override
    public void run() {
        while(working&&Main.game.isShowing()){
            try{
                thread.sleep(milis);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            animation.setViewport(new Rectangle2D(width*sprite,0,width,heigth));
            sprite++;
            if(sprite==sprites)sprite=0;
        }
    }

    public void close(){
        working=false;
    }
}
