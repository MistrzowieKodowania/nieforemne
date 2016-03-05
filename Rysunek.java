import greenfoot.*;
import java.awt.Color;

public class Rysunek extends Actor
{
    GreenfootImage rys;
    int[] xWiel = new int[1000];
    int[] yWiel = new int[1000];
    int ileWierzcholkow = 0;
    public Rysunek()
    {    
        xWiel[0]=300;
        yWiel[0]=100;
        ileWierzcholkow++;
        setImage(new GreenfootImage(600,400));
        rys = getImage();
        rys.setColor(Color.RED);
    }
    
    public void rysuj(int myszX, int myszY){
        xWiel[ileWierzcholkow]=myszX;
        yWiel[ileWierzcholkow]=myszY;
        ileWierzcholkow++;
       if(ileWierzcholkow>=3){
        rys.clear();
        rys.fillPolygon(xWiel, yWiel, ileWierzcholkow);
        
        }
        
    }
}
