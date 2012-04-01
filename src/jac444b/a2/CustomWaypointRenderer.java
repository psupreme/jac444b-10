package jac444b.a2;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.mapviewer.Waypoint;
import org.jdesktop.swingx.mapviewer.WaypointRenderer;

/**
 *
 * @author Jesse Santos
 * @version 1.0
 */
public class CustomWaypointRenderer implements WaypointRenderer {

    /**
     * 
     * @param g
     * @param map
     * @param wp
     * @return Success?
     */
    public boolean paintWaypoint(Graphics2D g, JXMapViewer map, Waypoint wp) {
        WaypointExtension wwp = (WaypointExtension) wp;
        String[] lines = wwp.getText().split("\n");
        int width = -1;
        int height = -1;
        //Get the maximum line length
        for (String line : lines) {
            width = Math.max(width, (int) g.getFontMetrics().getStringBounds(line, g).getWidth());
            height = Math.max(height, (int) g.getFontMetrics().getStringBounds(line, g).getHeight());
        }
        height *= lines.length;

        //draw tab
        g.setPaint(new Color(0, 0, 255, 200));
        Polygon triangle = new Polygon();
        triangle.addPoint(0, 0);
        triangle.addPoint(11, 11);
        triangle.addPoint(-11, 11);
        g.fill(triangle);
        g.fillRoundRect(-width / 2 - 5, 10, width + 10, height, 10, 10);

        //draw text w/ shadow
        int y = 0;
        for (String line : lines) {
            g.setPaint(Color.BLACK);
            g.drawString(line, -width / 2 - 1, 20 + y); //shadow
            g.drawString(line, -width / 2 - 1, 20 + y); //shadow
            g.setPaint(Color.WHITE);
            g.drawString(line, -width / 2, 21 + y); //text
            y += (int) g.getFontMetrics().getStringBounds(line, g).getHeight();
        }
        return false;
    }
}
