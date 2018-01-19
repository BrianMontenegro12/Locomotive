// Train08.java
// Train case study, Stage #8


import java.awt.*;


public class BoxCar
{
   protected int xPos;
   protected int yPos;
   protected Color carColor;
   protected RailChassis rc;   
   
    public BoxCar(Color cC, int xP, int yP)
    {
        carColor = cC;
        xPos = xP;
        yPos = yP;
        rc = new RailChassis(xPos,yPos+85);
    }

    public void drawCar(Graphics g)
    {
      rc.drawRailChassis(g);
      drawBox(g);
    }
   
   private void drawBox(Graphics g)
   {
    g.setColor(carColor);
    g.fillRect(xPos,yPos,150,85);
   }
}

