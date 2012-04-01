package jac444b.a2;

import java.io.Serializable;

/**
 *
 * @author Jesse Santos
 * @version 1.0
 */
public class WaypointData implements Serializable {

    private String text;
    private Double longitude;
    private Double latitude;

    WaypointData(String text, Double latitude, Double longitude) {
        this.text = text;
        this.longitude = longitude;
        this.latitude = latitude;
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
     * @return The latitude of the waypoint
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @return The longitude of the waypoint
     */
    public Double getLongitude() {
        return longitude;
    }
}
