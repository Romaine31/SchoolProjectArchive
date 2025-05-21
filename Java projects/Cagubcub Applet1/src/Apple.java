/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
JOHN ROMAINE CAGubCUB
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Raine
 */
public class Apple extends Applet {
    @Override
    public void paint(Graphics z){
        //bg
            Color lightblue = new Color (153, 255, 255);
            z.setColor(lightblue);
            z.fillRect(0, 0, 2000, 1200);
            z.setColor(Color.GREEN);
            z.fillRect(0, 700, 2000, 1000);
            z.setColor(Color.yellow);
            z.fillOval(200, 80, 100, 100);
        //house
            z.setColor(Color.gray);
            z.fillRect(1060, 300, 500, 500);
            int x[]={1060, 1560, 1310};
            int y[]={300, 300, 100};
            z.fillPolygon(x, y, 3);
            z.setColor(Color.orange);
            z.fillRect(1070, 500, 200, 290);
        //car
            z.setColor(Color.red);
            z.fillRect(200, 600, 700, 180);
            int q[] = {300, 800, 750, 350};
            int w[] = {600, 600, 500, 500};
            z.fillPolygon(q, w, 4);
            z.setColor(Color.black);
            z.fillOval(300, 700, 150, 150);
            z.fillOval(700, 700, 150, 150);
        //garden  JOHN ROMAINE CAGUBCUB
            Color brown = new Color (153,76,0);
            z.setColor(brown);
            z.drawLine(1600, 700, 1600, 650);
            z.drawLine(1700, 700, 1700, 650);
            z.drawLine(1700, 700, 1700, 650);
            z.drawLine(1800, 700, 1800, 650);
            z.setColor(Color.magenta);
            z.fillOval(1585, 635, 30, 30);
            z.fillOval(1685, 635, 30, 30);
            z.fillOval(1785, 635, 30, 30);
    }
}






































//JOHN ROMAINE CAGUBCUB