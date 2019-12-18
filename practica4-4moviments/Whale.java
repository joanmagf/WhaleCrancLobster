import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Whale extends Actor
{
int puntsLob = 0;
int puntsCrab = 0;


    public void act() 
    {
        
        puntsLob = getPuntsLob();
        puntsCrab = getPuntsCrab();

        if (puntsLob > puntsCrab) {
           moveToLobster();
           
            
        } else if (puntsCrab > puntsLob) {
            moveToCrab();
            
        } else {
           moveRandom();
        }  
    
        
     Crab crab = (Crab)getOneObjectAtOffset(0, 0, Crab.class); //si whale toca al crab sel menja i guanya el lobster
        
        if (crab != null) { 
         
            crab.getWorld().showText(" ", crab.getX(), crab.getY());
            getWorld().removeObject(crab);
            Greenfoot.stop();
            getWorld().showText("Ha guanyat el LOBSTER!!", 300, 300);
            
        }
    
     Lobster lob = (Lobster)getOneObjectAtOffset(0, 0, Lobster.class); //si whale toca al lobster sel menja i guanya el crab
        
        if (lob != null) {
         
            lob.getWorld().showText(" ", lob.getX(), lob.getY());
            getWorld().removeObject(lob);
            Greenfoot.stop();
            getWorld().showText("Ha guanyat el CRAB!!", 300, 300);
            
        }
        
     Worm worm = (Worm)getOneObjectAtOffset(0, 0, Worm.class); //per a menjar-me els worms
        if (worm != null) {
            
            worm.getWorld().showText(" ", worm.getX(), worm.getY());
            getWorld().removeObject(worm);
            crearWorms(1);  
            
    
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
    
    public void moveRandom() {
     int x = Greenfoot.getRandomNumber(getWorld().getWidth());
     int y = Greenfoot.getRandomNumber(getWorld().getHeight());
     
     turnTowards(x, y);
     move(2);
     
    }
    
    public void moveToLobster() {
     Lobster l = (Lobster)getWorld().getObjects(Lobster.class).get(0);
     
     int posXlob = l.getX();
     int posYlob = l.getY();
     
     turnTowards(posXlob, posYlob);
     move(2);
        
    }
    
     public void moveToCrab() {
     Crab c = (Crab)getWorld().getObjects(Crab.class).get(0);
     
     int posXcrab = c.getX();
     int posYcrab = c.getY();
     
     turnTowards(posXcrab, posYcrab);
     move(2);
        
    }
    
    public int getPuntsCrab() {
     
        Crab crab = (Crab)getWorld().getObjects(Crab.class).get(0);
        int pCrab = crab.getPuntsCrab();
        return pCrab;
        
    }
    
    public int getPuntsLob() {
     
        Lobster lob = (Lobster)getWorld().getObjects(Lobster.class).get(0);
        int pLob =lob.getPuntsLob();
        return pLob;
        
    }
    
}
