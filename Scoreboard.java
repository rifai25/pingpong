import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    //create an image for Scoreboard class and draw text
public Scoreboard(String player1, String player2)
{
GreenfootImage img = new GreenfootImage (800, 40);

Font font = new Font("Helvetica", 30);
img.setFont(font);
img.drawString(player1, 150, 35);
img.drawString(player2, 500, 35);
setImage(img);
}
public void setText(String player1, String player2)
{
GreenfootImage img = getImage();
img.clear();
img.drawString(player1, 150, 35);
img.drawString(player2, 500, 35);
}    
}
