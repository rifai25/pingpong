import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tentang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tentang extends World
{
     public GreenfootSound music = new GreenfootSound("vvv.mp3");
    public void started()
    {
        music.setVolume(60);
        music.play();
    }
    
    public void stopped ()
    {
        music.stop();
        music.play();
    }

    /**
     * Constructor for objects of class Tentang.
     * 
     */
    public Tentang()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    private void prepare()
    { 
        Back back = new Back();
        addObject(back,730,63);
    }
}