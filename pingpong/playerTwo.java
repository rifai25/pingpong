package pingpong;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playerTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playerTwo extends Paddles
{
    /**
     * Act - do whatever the playerTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-10);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+10);
        }
    }    
}
