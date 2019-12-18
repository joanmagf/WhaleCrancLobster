import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{

    public static final int UP = 0;
    public static final int DOWN = 1;
    public static final int RIGHT = 2;
    public static final int LEFT = 3;
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
       
       if(Greenfoot.isKeyDown("up")) {
           setDirection(UP);
        }
        
       if(Greenfoot.isKeyDown("down")) {
           setDirection(DOWN);
        }
        
       if(Greenfoot.isKeyDown("right")) {
           setDirection(RIGHT);
        }
        
       if(Greenfoot.isKeyDown("left")) {
           setDirection(LEFT);
        }
       
       Worm worm = (Worm)getOneObjectAtOffset(0, 0, Worm.class); //per a menjar-te els worms
        if (worm != null) {
            
            worm.getWorld().showText(" ", worm.getX(), worm.getY());
            getWorld().removeObject(worm);
            crearWorms(1);  
            contWorm = worm.getContWorm();
            puntsCrab = puntsCrab + contWorm;
            
        }
        
        Lobster lob = (Lobster)getOneObjectAtOffset(0, 0, Lobster.class); //per a que el crab es menge al lob
        
        if (lob != null && puntsCrab > puntsLob) {
         
            lob.getWorld().showText(" ", lob.getX(), lob.getY());
            getWorld().removeObject(lob);
            Greenfoot.stop();
            getWorld().showText("Ha guanyat el CRAB!!" , 300, 300);
            
        }
        
        getWorld().showText(""+puntsCrab, getX(), getY());
        
        
    }   
    
    public void setDirection(int direction) {
        switch(direction) {
            case UP:
            setRotation(270);
            move(2);
            break;
            
            case DOWN:
            setRotation(90);
            move(2);
            break;
            
            case RIGHT:
            setRotation(0);
            move(2);
            break;
            
            case LEFT:
            setRotation(180);
            move(2);
            break;
           
            
        }

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

}
