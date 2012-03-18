/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jac444b.a2;

import org.jdesktop.swingx.mapviewer.GeoPosition;

/**
 *
 * @author Clinton Bale
 * @version 1.0
 */
public class Country {
    private String _name;
    private String _code;
    private GeoPosition _location;
    
    public Country(String name, String code, GeoPosition location) {
        this._name = name;
        this._code = code;
        this._location = location;          
    }
    
    public String getName() {
        return _name;
    }
    public String getCode() {
        return _code;
    }
    public GeoPosition getLocation() {
        return _location;
    }
}
