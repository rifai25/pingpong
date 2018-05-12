import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PongWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PongWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Scoreboard scoreboard = new Scoreboard("Player One: 0", "Player Two: 0");
        addObject(scoreboard, 400, 550); 
        addObject(new Ball(scoreboard), 400, 300);
        addObject(new playerOne(), 10, 300);
        addObject(new playerTwo(), 790, 300);
       
        
        
        
    }
}
