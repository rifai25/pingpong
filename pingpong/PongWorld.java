import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
public class PongWorld  extends World
{
/**
* Constructor for objects of class MyWorld.
* 
*/
public PongWorld()
{    
super(800, 600, 1); 
Scoreboard scoreboard = new Scoreboard("Player One: 0", "Player Two: 0");
addObject(scoreboard, 400, 20); 
addObject(new Ball(scoreboard), 400, 300);
addObject(new playerOne(), 10, 300);
addObject(new playerTwo(), 790, 300);
}
}
