import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ganaLobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ganaLobster extends Actor
{
    /**
     * Act - do whatever the ganaLobster wants to do. This method is called whenever
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
