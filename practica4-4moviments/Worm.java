import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Worm extends Actor
{
    int contWorm = Greenfoot.getRandomNumber(100);
    
    public void act() 
   {
       getWorld().showText(" ", getX(), getY());
       contWorm = getContWorm();
   
       if (Greenfoot.getRandomNumber(100) < 5 && (contWorm > 1) ) { //per a que cada el 35% de les voltes decremente el contWorm
        contWorm --;
    }
        
    getWorld().showText(""+contWorm, getX(), getY());
   }
    
    public int getContWorm() {
        return contWorm;
    }

}