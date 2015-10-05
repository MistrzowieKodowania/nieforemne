import greenfoot.*;
import java.awt.Color;

public class Rysunek extends Actor
{
    int startX, startY, endX, endY, ile;
    MouseInfo myszKomp;
    int mx;
    int my;
    int[] xWiel = new int[1000];
    int[] yWiel = new int[1000];
    GreenfootImage rys;
    int k = 0;
    public Rysunek()
    {    
        xWiel[0]=300;
        yWiel[0]=100;
        setImage(new GreenfootImage(600,400));
        rys = getImage();
    
    }
    
    public void rysuj(int myszX, int myszY){
        k++;
        xWiel[k]=myszX;
        yWiel[k]=myszY;
        
       if(k>=2){
        rys.setColor(Color.RED);
        rys.clear();
        rys.fillPolygon(xWiel, yWiel, k+1);
        
        }
    }
}
