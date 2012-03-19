/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jac444b.a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Testee
 */
public class HTTPUtility {
    private HTTPUtility() {
    }
    
    public static String GetIp() {
        return DownloadWebsite("http://automation.whatismyip.com/n09230945.asp");
    }
    
    public static String DownloadWebsite(String address) {
        StringBuilder sb = new StringBuilder(); 
        try {
            URL url = new URL(address);  
            InputStream is = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;
            
            while((line = reader.readLine()) != null) {
                sb.append(line);
            }
            
            reader.close();
            is.close();            
        }
        catch (MalformedURLException ex) {
            return ex.getLocalizedMessage();
        }
        catch (IOException ex) {
            return ex.getLocalizedMessage();
        }        
        return sb.toString();
    }
}
