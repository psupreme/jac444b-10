/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jac444b.a2;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.mapviewer.Waypoint;
import org.jdesktop.swingx.mapviewer.WaypointRenderer;

/**
 *
 * @author jsantos13
 */
public class CustomWaypointRenderer implements WaypointRenderer{
    public boolean paintWaypoint(Graphics2D g, JXMapViewer map, Waypoint wp) {
        WaypointExtension wwp =  (WaypointExtension)wp;

        //draw tab
        g.setPaint(new Color(0,0,255,200));
        Polygon triangle = new Polygon();
        triangle.addPoint(0,0);
        triangle.addPoint(11,11);
        triangle.addPoint(-11,11);
        g.fill(triangle);
        int width = (int) g.getFontMetrics().getStringBounds(wwp.getText(), g).getWidth();
        g.fillRoundRect(-width/2 -5, 10, width+10, 20, 10, 10);

        //draw text w/ shadow
        g.setPaint(Color.BLACK);
        g.drawString(wwp.getText(), -width/2-1, 26-1); //shadow
        g.drawString(wwp.getText(), -width/2-1, 26-1); //shadow
        g.setPaint(Color.WHITE);
        g.drawString(wwp.getText(), -width/2, 26); //text
        return false;
    }
}
