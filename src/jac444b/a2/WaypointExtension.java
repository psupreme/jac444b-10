package jac444b.a2;

import org.jdesktop.swingx.mapviewer.GeoPosition;
import org.jdesktop.swingx.mapviewer.Waypoint;

/**
 *
 * @author Jesse Santos
 * @version 1.0
 */
public class WaypointExtension extends Waypoint {

    private String text;

    /**
     * 
     * @param text
     * @param coords
     */
    public WaypointExtension(String text, GeoPosition coords) {
        super(coords.getLatitude(), coords.getLongitude());
        this.text = text;
    }

    /**
     * 
     * @return The text of the waypoint
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }
}
