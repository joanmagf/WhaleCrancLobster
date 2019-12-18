import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lobster extends Actor
{
    public static final int W = 0;
    public static final int S = 1;
    public static final int D = 2;
    public static final int A = 3;
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
       
       if(Greenfoot.isKeyDown("w")) {
           setDirection(W);
        }
        
       if(Greenfoot.isKeyDown("s")) {
           setDirection(S);
        }
        
       if(Greenfoot.isKeyDown("d")) {
           setDirection(D);
        }
        
       if(Greenfoot.isKeyDown("a")) {
           setDirection(A);
        }
       
       Worm worm = (Worm)getOneObjectAtOffset(0, 0, Worm.class); //per a menjar-me els worms
        if (worm != null) {
            
            worm.getWorld().showText(" ", worm.getX(), worm.getY());
            getWorld().removeObject(worm);
            crearWorms(1);  
            contWorm = worm.getContWorm();
            puntsLob = puntsLob + contWorm;
    
        }
        
        Crab crab = (Crab)getOneObjectAtOffset(0, 0, Crab.class);
        
        if (crab != null && puntsLob > puntsCrab) { //per a que el lob es menge al crab
         
            crab.getWorld().showText(" ", crab.getX(), crab.getY());
            getWorld().removeObject(crab);
            Greenfoot.stop();
            getWorld().showText("Ha guanyat el LOBSTER!!",300, 300);
            
        }
        getWorld().showText(""+puntsLob, getX(), getY());
        
    }   
    
    public void setDirection(int direction) {
        switch(direction) {
            case W:
            setRotation(270);
            move(2);
            break;
            
            case S:
            setRotation(90);
            move(2);
            break;
            
            case D:
            setRotation(0);
            move(2);
            break;
            
            case A:
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
    public int getPuntsLob() {
     return puntsLob;   
    }
    
}
