import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;

// Train08.java
// Train case study, Stage #8
// This final stage places every class in its own file.


public class Train08
{
    public static void main(String args[])
    {
      DrawingPanel draw = new DrawingPanel(1200,1200);
      Graphics g = draw.getGraphics();
      int startX = 100;
      int startY = 250;
      LocomotiveCar lC = new LocomotiveCar(Color.blue,startX+(0*175),startY);
      FreightCar fC1 = new FreightCar(Color.gray,startX+(1*175),startY);
      FreightCar fC2 = new FreightCar(Color.gray,startX+(2*175),startY); 
      PassengerCar pC1 = new PassengerCar(Color.green,startX+(3*175),startY);
      PassengerCar pC2 = new PassengerCar(Color.green,startX+(4*175),startY); 
      CabooseCar cC = new CabooseCar(Color.red,startX+(5*175),startY);        
      
      lC.drawCar(g);
      fC1.drawCar(g);
      fC2.drawCar(g);
      pC1.drawCar(g);
      pC2.drawCar(g);
      cC.drawCar(g);
      
  }
}


