// Train08.java
// Train case study, Stage #8


import java.awt.*;
import java.applet.*;


public class RailChassis
{
    private int xPos;
    private int yPos;

    public RailChassis(int xP, int yP)
    {
        xPos = xP;
        yPos = yP;
    }

    public void drawRailChassis(Graphics g)
    {
          drawChassis(g);
          drawWheels(g);
          drawLink(g);
    }
   
   private void drawChassis(Graphics g)
   {
        g.setColor(Color.gray);
        g.fillRect(xPos,yPos,150,15);
   }
   
   private void drawWheels(Graphics g)
   {
        g.setColor(Color.black);
        g.fillOval(xPos+5,yPos+10,50,50);
        g.fillOval(xPos+95,yPos+10,50,50);  
   }
    
   private void drawLink(Graphics g)
   {
      g.setColor(Color.gray);
      g.fillRect(xPos-25,yPos+5,25,5);
   }
}

