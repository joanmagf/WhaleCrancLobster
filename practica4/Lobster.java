import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lobster extends Actor
{

    int puntsCrab = 0;
    int puntsLob = 0;
    int contWorm = 0;
    int posXlob = 0;
    int posYlob = 0;
    
    public void act() 
    {
        getWorld().showText("", getX(), getY());
        posXlob = getX();
        posYlob = getY();
        move(3);
        
        if (Greenfoot.isKeyDown("left")) turn(-3);
        if (Greenfoot.isKeyDown("right")) turn(3);
       
       Worm worm = (Worm)getOneObjectAtOffset(0, 0, Worm.class); //per a menjar-me els worms
        if (worm != null) {
            
            worm.getWorld().showText(" ", worm.getX(), worm.getY());
            getWorld().removeObject(worm);
            crearWorms(1);  
            contWorm = worm.getContWorm();
            puntsLob = puntsLob + contWorm;
    
        }
        
        Crab crab = (Crab)getOneObjectAtOffset(0, 0, Crab.class);
        
        if (crab != null && this.puntsLob > crab.puntsCrab) { //per a que el lob es menge al crab
         
            crab.getWorld().showText(" ", crab.getX(), crab.getY());
            getWorld().removeObject(crab);
            Greenfoot.stop();
            ganaLobster gana = new ganaLobster();
            getWorld().addObject(gana, 300, 300);
            
            
        }
        getWorld().showText(" "+puntsLob, getX(), getY());
        
    }   
      
    public void crearWorms(int num) {
        
        for (int i = 0; i < num; i++) {
            Worm worm = new Worm();
            int x = Greenfoot.getRandomNumber(getWorld().getWidth());
            int y = Greenfoot.getRandomNumber(getWorld().getHeight());
            getWorld().addObject(worm, x , y);

        }
    }
    public int getPuntsLob() {
     return puntsLob;   
    }
    
    public int getXlob() {
     return posXlob;   
    }
    
    public int getYlob() {
     return posYlob;   
    }
    
}
