import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Homepage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Homepage extends World
{

    /**
     * Constructor for objects of class Homepage.
     * 
     */
    public GreenfootSound music = new GreenfootSound("vvv.mp3");
    public void started()
    {
        music.setVolume(40);
        music.play();
    }
    
    public void stopped ()
    {
        music.stop();
        music.play();
    }
    
    public Homepage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Exit exit = new Exit();
        addObject(exit,400,300);
        Start start = new Start();
        addObject(start,100,10);
        start.setLocation(100,500);
        Help help = new Help();
        addObject(help,761,335);
        help.setLocation(400,500);
        exit.setLocation(700,500);
        Start start2 = new Start();
        addObject(start2,191,414);
        removeObject(start);
        start2.setLocation(70,483);
        start2.setLocation(78,480);
        Help help2 = new Help();
        addObject(help2,179,542);
        removeObject(help);
        help2.setLocation(165,518);
        help2.setLocation(173,531);
        start2.setLocation(70,427);
        help2.setLocation(69,502);
        Exit exit2 = new Exit();
        addObject(exit2,74,572);
        exit2.setLocation(67,566);
        removeObject(exit);
        exit2.setLocation(71,564);
        help2.setLocation(69,497);
        exit2.setLocation(67,562);
        start2.setLocation(67,414);
        help2.setLocation(66,486);
        exit2.setLocation(66,554);
        exit2.setLocation(165,552);
        help2.setLocation(88,556);
        exit2.setLocation(223,558);
        help2.setLocation(143,550);
        start2.setLocation(55,549);
        help2.setLocation(144,552);
        exit2.setLocation(251,551);
        help2.setLocation(156,550);
        exit2.setLocation(255,549);
        help2.setLocation(156,548);
        Start star2 = new Start();
        addObject(start2,361,398);
        removeObject(start);
        start2.setLocation(114,492);
        start2.setLocation(89,504);
        help2.setLocation(189,539);
        exit2.setLocation(269,548);
        help2.setLocation(185,547);
        start2.setLocation(86,515);
        help2.setLocation(191,547);
        exit2.setLocation(560,486);
        exit2.setLocation(261,549);
        help2.setLocation(192,511);
        exit2.setLocation(192,569);
        help2.setLocation(190,487);
        exit2.setLocation(192,555);
        help2.setLocation(758,566);
    }
        
        
}
