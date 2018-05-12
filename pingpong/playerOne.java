import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playerOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playerOne extends Paddles
{
    /**
     * Act - do whatever the playerOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-10);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+10);
        }
    }    
}
