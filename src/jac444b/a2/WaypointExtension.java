/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jac444b.a2;

import org.jdesktop.swingx.mapviewer.GeoPosition;
import org.jdesktop.swingx.mapviewer.Waypoint;

/**
 *
 * @author jsantos13
 */
public class WaypointExtension extends Waypoint{
    private String text;
    
    public WaypointExtension(String text, GeoPosition coords){
        super(coords.getLatitude(), coords.getLongitude());
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
}
