import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Whale extends Actor
{
int puntsLob = 0;
int puntsCrab = 0;

    public void act() 
    {
        
        move(4);
        if(getWorld().getObjects(Lobster.class).isEmpty()) {
         return;   
        }
        Lobster lobsterObj = (Lobster)getWorld().getObjects(Lobster.class).get(0);
        
        if (getWorld().getObjects(Crab.class).isEmpty()) {
        return;
        }
        Crab crabObj = (Crab)getWorld().getObjects(Crab.class).get(0);
        
        
        
        if (lobsterObj.puntsLob > crabObj.puntsCrab) {
           turnTowards(lobsterObj.getXlob(), lobsterObj.getYlob());
           
        } else if (crabObj.puntsCrab > lobsterObj.puntsLob) {
           turnTowards(crabObj.getXcrab(), crabObj.getYcrab());
           
        } else {
            if (Greenfoot.getRandomNumber(100) < 10) {
           moveRandom();
        }
        }  
            
     Crab c = (Crab)getOneObjectAtOffset(0, 0, Crab.class); //si whale toca al crab sel menja i guanya el lobster
        
        if (c != null) { 
         
            c.getWorld().showText(" ", c.getX(), c.getY());
            getWorld().removeObject(c);
            Greenfoot.stop();
            ganaLobster gana = new ganaLobster();
            getWorld().addObject(gana, 300, 300);
            
        }
    
     Lobster l = (Lobster)getOneObjectAtOffset(0, 0, Lobster.class); //si whale toca al lobster sel menja i guanya el crab
        
        if (l != null) {
         
            l.getWorld().showText(" ", l.getX(), l.getY());
            getWorld().removeObject(l);
            Greenfoot.stop();
            ganaCrab gana = new ganaCrab();
            getWorld().addObject(gana, 300, 300);
            
        }
        
     Worm worm = (Worm)getOneObjectAtOffset(0, 0, Worm.class); //per a menjar-me els worms
        
        if (worm != null) {
            
            worm.getWorld().showText(" ", worm.getX(), worm.getY());
            getWorld().removeObject(worm);
            crearWorms(1); 

        }
        /*
        Greenfoot image = getImage();
        int imgX = image.getHeight();
        int imgY = image.getWidth();
        */
        
        
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
     
     
    }

}
