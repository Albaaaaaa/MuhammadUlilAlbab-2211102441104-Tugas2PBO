import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        GreenfootImage img = new GreenfootImage("sky.jpeg");

        this.addObject(new Bird(),100,100);

        Random rnd = new Random();
        setPaintOrder(Bird.class);
        for(int i = 0; i < 7; i++){
            this.addObject(new Awan(), rnd.nextInt(this.getWidth()-1), rnd.nextInt(this.getHeight()-1));
        }
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
