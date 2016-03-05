import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Ground extends World
{
    Olowek pencil=new Olowek();
    MouseInfo myszKomp;
    int mx, my, startX, startY;
    int ileKlikniec=0;
    Rysunek rys = new Rysunek();
    
    public Ground()
    {    
        super(600,400,1);
        addObject (pencil,300,100);
        getBackground().setColor(Color.black);
        addObject (rys,300,200);
        showText("Klikaj kolejne wierzchołki wielokąta", 300, 50);
    }

    public void act() 
    {
     if(Greenfoot.mouseClicked(null)){
       startX=pencil.getX();
       startY=pencil.getY();
       myszKomp = Greenfoot.getMouseInfo();
       mx = myszKomp.getX();
       my = myszKomp.getY();
       getBackground().drawLine(startX,startY,mx,my);
       pencil.setLocation(mx,my);
       rys.rysuj(mx,my);
       ileKlikniec++;
       if(ileKlikniec==3) showText("", 300, 50);  
       }
       
    }
}