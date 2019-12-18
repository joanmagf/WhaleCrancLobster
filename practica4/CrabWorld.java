import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class CrabWorld extends World
{

    public CrabWorld()
    {    
        super(600, 600, 1);
        Crab crab = new Crab();
        Lobster lob = new Lobster();
        Whale whale = new Whale();
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        int p = Greenfoot.getRandomNumber(getWidth());
        int q = Greenfoot.getRandomNumber(getHeight());
        int z = Greenfoot.getRandomNumber(getWidth());
        int t = Greenfoot.getRandomNumber(getHeight());
        int num = Greenfoot.getRandomNumber(20)+7;
        addObject(crab, x, y);
        addObject(lob, p, q);
        addObject(whale, z, t);
        crearWorms(num);
        
    }
    
    public void crearWorms(int num) {
        
        for (int i = 0; i < num; i++) {
            Worm worm = new Worm();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(worm, x , y);
        
        }
    }
}