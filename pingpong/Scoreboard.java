import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
public class Scoreboard extends Actor
{  
public Scoreboard(String player1, String player2)
{
GreenfootImage img = new GreenfootImage (800, 40);

Font font = new Font("Helvetica", Font.BOLD, 20);

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

