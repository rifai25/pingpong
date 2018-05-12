import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Over extends World
{

    /**
     * Constructor for objects of class Over.
     * 
     */
    public Over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ulang ulang = new Ulang();
        addObject(ulang,91,527);
        keluar keluar2 = new keluar();
        addObject(keluar2,742,523);
        keluar2.setLocation(732,523);
    }
}
