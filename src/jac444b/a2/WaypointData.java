/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jac444b.a2;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class WaypointData implements Serializable{
    private String text;
    private Double longitude;
    private Double latitude;
    
    WaypointData(String text, Double latitude, Double longitude)
    {
        this.text = text;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    
    public String getText(){
        return text;
    }
    public Double getLatitude(){
        return latitude;
    }
    public Double getLongitude(){
        return longitude;
    }
}
