import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
public class Ball extends Actor
{
    public int deltaX = (Greenfoot.getRandomNumber(5) + 8);
    public int deltaY = (Greenfoot.getRandomNumber(5) + 8);
    private int player1Count;
    private int player2Count;
    private Scoreboard score;
    
    public Ball(Scoreboard scoreboard)
    {
        score = scoreboard;
    }
    public void act() 
    {
        setLocation(getX() + deltaX, getY() + deltaY);
        wallCollision();
        paddleCollision();
        scorePoints();
    }  
    public void wallCollision()
    {
        if ( getX() < 10 || getX() > 790)
        {
            deltaX = -deltaX;
        }
        if ( getY() < 10 || getY() > 590)
        {
            deltaY = -deltaY;
        }
    }
    
    public void paddleCollision()
    {
        if (getOneIntersectingObject(playerOne.class) != null)
        {
            deltaX = -deltaX;
        }
        if (getOneIntersectingObject(playerTwo.class) != null)
        {
            deltaX = -deltaX;
        }
    }
    
    public void scorePoints()
    {
        if (getX()<10)
        {
            player2Count++;
            if (player2Count > 5)
            {
                setLocation(400, 250);
                GreenfootImage img = new GreenfootImage(250, 50);
               
                Font font = new Font("Helvetica", Font.BOLD, 25);
                
                img.drawString("Player Two Wins!", 30, 45);
                setImage(img);
                Greenfoot.stop();
            }else
            {
                setLocation(400, 300);
                score.setText("Player One: " + player1Count, "Player Two: " + player2Count);
                Greenfoot.delay(25);
            }
        }
        if (getX()>790)
        {
            player1Count++;
            if (player1Count > 5)
            {
                setLocation(400, 250);
                GreenfootImage img = new GreenfootImage(250, 50);
                
                Font font = new Font("Helvetica", Font.BOLD, 25);
                
                img.drawString("Player One Wins!", 30, 45);
                setImage(img);
                Greenfoot.stop();
            }else
            {
                setLocation(400, 300);
                score.setText("Player One: " + player1Count, "Player Two: " + player2Count);
                Greenfoot.delay(25);
            }
        }
    }
}
