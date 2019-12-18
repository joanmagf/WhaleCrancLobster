import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ganaCrab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ganaCrab extends Actor
{
    /**
     * Act - do whatever the ganaCrab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
     public void addedToWorld(World CrabWorld) {
     GreenfootImage image = getImage();
     image.scale(450, 65);
     setImage(image);
     
    }
}
