import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{

    int puntsLob = 0;
    int puntsCrab = 0;
    int contWorm = 0;
    int posXcrab = 0;
    int posYcrab = 0;
    
    public void act() 
    {
       getWorld().showText("", getX(), getY());
       posXcrab = getX();
       posYcrab = getY();
       
       move(3);
       if (Greenfoot.isKeyDown("a")) turn(-3);
       if (Greenfoot.isKeyDown("d")) turn(3);
       
       Worm worm = (Worm)getOneObjectAtOffset(0, 0, Worm.class); //per a menjar-te els worms
        if (worm != null) {
            
            worm.getWorld().showText(" ", worm.getX(), worm.getY());
            getWorld().removeObject(worm);
            crearWorms(1);  
            contWorm = worm.getContWorm();
            puntsCrab = puntsCrab + contWorm;
            
        }
        
        Lobster lob = (Lobster)getOneObjectAtOffset(0, 0, Lobster.class); //per a que el crab es menge al lob
        
        if (lob != null && this.puntsCrab > lob.puntsLob) {
         
            lob.getWorld().showText(" ", lob.getX(), lob.getY());
            getWorld().removeObject(lob);
            Greenfoot.stop();
            ganaCrab gana = new ganaCrab();
            getWorld().addObject(gana, 300, 300);
            
        }
        
        getWorld().showText(""+puntsCrab, getX(), getY());
        
        
    }   

    public void crearWorms(int num) {
        
        for (int i = 0; i < num; i++) {
            Worm worm = new Worm();
            int x = Greenfoot.getRandomNumber(getWorld().getWidth());
            int y = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(worm, x , y);
        
        }
    }
    
    public int getPuntsCrab() {
     return puntsCrab;   
    }   
    
    public int getXcrab() {
        return posXcrab;
    
    }
    public int getYcrab() {
        return posYcrab;
        
    }
    
}
