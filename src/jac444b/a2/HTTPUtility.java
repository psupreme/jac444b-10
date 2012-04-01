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
 * @author Clinton Bale
 * @version 1.0
 */
public class HTTPUtility {

    private HTTPUtility() {
    }

    /**
     * 
     * @return Your ip address.
     */
    public static String GetIp() {
        //Simply downloads your ip.
        return DownloadWebsite("http://automation.whatismyip.com/n09230945.asp");
    }

    /**
     * 
     * @param address
     * @return The websites' HTML data.
     */
    public static String DownloadWebsite(String address) {
        StringBuilder sb = new StringBuilder();
        try {
            //Fetches data from the URL.
            URL url = new URL(address);
            InputStream is = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = null;

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            reader.close();
            is.close();
        } catch (MalformedURLException ex) {
            return ex.getLocalizedMessage();
        } catch (IOException ex) {
            return ex.getLocalizedMessage();
        }
        return sb.toString();
    }
}
