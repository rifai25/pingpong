import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    public int deltaX = (Greenfoot.getRandomNumber(8) + 5);
    public int deltaY = (Greenfoot.getRandomNumber(8) + 5);
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
        flugschlaeger();
    }
        
public void wallCollision()
    {
        if ( getX() < 10 || getX() >790)
        {
            deltaX = -deltaX;
        }
          if ( getY() < 10 || getY() >590)
        {
            deltaY = -deltaY;
        }
    }    
    
public void paddleCollision()
    {
        if (getOneIntersectingObject(playerOne.class) !=null)
        {
            deltaX = -deltaX;
        }
        if (getOneIntersectingObject(playerTwo.class) !=null)
        {
            deltaX = -deltaX;
        }
    }
    
public void scorePoints()
{
        if (getX()<10)
        {
            player2Count++;
            if (player2Count > 4)
            {
                setLocation(400, 250);
                GreenfootImage img = new GreenfootImage(250, 50);
                
                Font font = new Font("Helvetica", 25);
                img.setFont(font);
                img.drawString("Player Two Wins!", 30, 45);
                Greenfoot.setWorld(new Over2());
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
            if (player1Count > 4)
            {
                setLocation(400,250);
                GreenfootImage img = new GreenfootImage(250,50);
                
                Font font = new Font("Helvetica", 25);
                img.setFont(font);
                img.drawString("Player One Wins!", 30, 45);
                Greenfoot.setWorld(new Over());
                
            }else
            {
                setLocation(400, 300);
                score.setText("Player One: " + player1Count, "Player Two: " + player2Count);
                Greenfoot.delay(25);
            }
        }
    }
    public void flugschlaeger(){
        if(foundplayerOne()){
            setRotation(getRotation() - 180);
            Greenfoot.playSound("ping.wav");
            
        }
        else if(foundplayerTwo()){
            setRotation(getRotation() + 180);
            Greenfoot.playSound("pong.wav");
            
        }
    } 
    
       public boolean foundplayerOne()
    {
       Actor sl= getOneIntersectingObject(playerOne.class);
       if (sl != null) 
       {
         return true;
       }
       else 
       {       
          return false;   
       }
    }
    
    public boolean foundplayerTwo()
    {
       Actor sr= getOneIntersectingObject(playerTwo.class);
       if (sr != null) 
       {
         return true;
       }
       else 
       {       
          return false;   
       }
    }
}
