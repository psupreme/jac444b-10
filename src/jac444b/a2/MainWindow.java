/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jac444b.a2;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.MouseEvent;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.mapviewer.GeoPosition;
import org.jdesktop.swingx.mapviewer.Waypoint;
import org.jdesktop.swingx.mapviewer.WaypointPainter;
import org.jdesktop.swingx.mapviewer.WaypointRenderer;

/**
 *
 * @author Testee
 */
public class MainWindow extends javax.swing.JFrame {

    private void AddWaypoint(WaypointExtension wp) {
        waypoints.add(wp);
        WaypointPainter painter = new WaypointPainter();
        painter.setWaypoints(waypoints);
        //create a renderer
        painter.setRenderer(new CustomWaypointRenderer());
        jxMap.getMainMap().setOverlayPainter(painter);
        jxMap.getMainMap().repaint();

        listWaypoints.removeAll();
        for (Iterator<Waypoint> it = waypoints.iterator(); it.hasNext();) {
            Waypoint w = it.next();
            listWaypoints.add(w.getPosition().getLatitude() + " " + w.getPosition().getLongitude());
        }
    }
    
    private void AddWaypointByIP(String ipAddress, boolean addMarker, boolean showMetaData)
    {
        //Get the json data
        String info = HTTPUtility.DownloadWebsite("http://freegeoip.net/json/" + ipAddress);
        //Remove the braces and get the elements
        String[] values = info.replace("{", "").replace("}", "").split(",");
        //A dictionary to store all geoIp data
        Map<String, String> geoipData = new HashMap<String, String>();
        //Simple parsing for json elements
        for (String element : values) {
            //Get the data on both sides of the :
            String[] keyValue = element.replace("\"", "").split(":");
            //Stick it in the dictionary
            geoipData.put(keyValue[0].trim(), keyValue[1].trim());
        }
        //Get the table model to start adding elements
        DefaultTableModel tableModel = (DefaultTableModel) tableGeoIP.getModel();
        //Remove all the rows in the table (clear it)
        while (tableGeoIP.getRowCount() > 0) {
            tableModel.removeRow(0);
        }
        for (String key : geoipData.keySet()) {
            String friendlyKey = Character.toUpperCase(key.charAt(0)) + key.substring(1).replace("_", " ");
            tableModel.addRow(new String[]{friendlyKey, geoipData.get(key)});
        }

        GeoPosition position = new GeoPosition(Double.valueOf(geoipData.get("latitude")), Double.valueOf(geoipData.get("longitude")));

        if (addMarker) {
            StringBuilder sb = new StringBuilder();  
            if(showMetaData) {            
                sb.append("City:    ").append(geoipData.get("city")).append("\n");
                sb.append("Region:  ").append(geoipData.get("region_name")).append("\n");
                sb.append("Country: ").append(geoipData.get("country_name")).append("\n");
            }
            
            AddWaypoint(new WaypointExtension(sb.toString(), position));
        }

        jxMap.setCenterPosition(position);
    }

    /*
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();

        for (int i = 0; i < countryList.size(); i++) {
            listCountries.add(countryList.get(i).getName());
        }

        txtIpAddress.setText(HTTPUtility.GetIp());        
        
        jxMap.getMainMap().addMouseMotionListener(new java.awt.event.MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                GeoPosition location = jxMap.getMainMap().convertPointToGeoPosition(jxMap.getMousePosition());
                lblStatus.setText("Location: { " + location.getLatitude() + " , " + location.getLongitude() + " }");
            }
        });
        jxMap.getMainMap().addMouseListener(new java.awt.event.MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                //if right mouse button is clicked
                if (e.getButton() == 3) {
                    GeoPosition location = jxMap.getMainMap().convertPointToGeoPosition(jxMap.getMousePosition());
                    AddWaypoint(new WaypointExtension("test", location));
                    jTabbedPane1.setSelectedIndex(2);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        //Add the waypoint on startup
        AddWaypointByIP(txtIpAddress.getText().trim(), true, true);
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jxMap = new org.jdesktop.swingx.JXMapKit();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnSearchIP = new java.awt.Button();
        txtIpAddress = new java.awt.TextField();
        lblIpAddress = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGeoIP = new javax.swing.JTable() {
            public boolean isCellEditable(int rowIndex, int vColIndex) {
                return false;
            }
        };
        chkPlaceMarker = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        listWaypoints = new java.awt.List();
        btnRemoveWaypoints = new java.awt.Button();
        panelTab1 = new javax.swing.JPanel();
        listCountries = new java.awt.List();
        chkCountryPlaceMarker = new javax.swing.JCheckBox();
        panelStatusBar = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jxMap.setDefaultProvider(org.jdesktop.swingx.JXMapKit.DefaultProviders.OpenStreetMaps);
        getContentPane().add(jxMap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 480));

        btnSearchIP.setLabel("Lookup");
        btnSearchIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchIPActionPerformed(evt);
            }
        });

        lblIpAddress.setText("IP Address or Hostname:");

        tableGeoIP.setAutoCreateRowSorter(true);
        tableGeoIP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableGeoIP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableGeoIP.getTableHeader().setResizingAllowed(false);
        tableGeoIP.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableGeoIP);

        chkPlaceMarker.setText("Place Marker");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtIpAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chkPlaceMarker, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtIpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearchIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPlaceMarker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSearchIP.getAccessibleContext().setAccessibleName("btnSearchIP");

        jTabbedPane1.addTab("IP Lookup", jPanel1);

        btnRemoveWaypoints.setLabel("Remove Waypoint");
        btnRemoveWaypoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveWaypointsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRemoveWaypoints, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(listWaypoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(listWaypoints, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoveWaypoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Waypoints", jPanel2);

        listCountries.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        listCountries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listCountriesActionPerformed(evt);
            }
        });

        chkCountryPlaceMarker.setText("Place Marker");

        javax.swing.GroupLayout panelTab1Layout = new javax.swing.GroupLayout(panelTab1);
        panelTab1.setLayout(panelTab1Layout);
        panelTab1Layout.setHorizontalGroup(
            panelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTab1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkCountryPlaceMarker, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listCountries, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelTab1Layout.setVerticalGroup(
            panelTab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTab1Layout.createSequentialGroup()
                .addComponent(chkCountryPlaceMarker)
                .addGap(1, 1, 1)
                .addComponent(listCountries, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Countries", panelTab1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 200, 480));

        panelStatusBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblStatus.setText("Location: ");

        javax.swing.GroupLayout panelStatusBarLayout = new javax.swing.GroupLayout(panelStatusBar);
        panelStatusBar.setLayout(panelStatusBarLayout);
        panelStatusBarLayout.setHorizontalGroup(
            panelStatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusBarLayout.createSequentialGroup()
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 635, Short.MAX_VALUE))
        );
        panelStatusBarLayout.setVerticalGroup(
            panelStatusBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusBarLayout.createSequentialGroup()
                .addComponent(lblStatus)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblStatus.getAccessibleContext().setAccessibleName("lblStatus");

        getContentPane().add(panelStatusBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 980, -1));

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        AboutWindow ab = new AboutWindow();
        ab.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void listCountriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listCountriesActionPerformed
        Country c = countryList.get(listCountries.getSelectedIndex());        
        if(chkCountryPlaceMarker.isSelected()) {
             AddWaypoint(new WaypointExtension(c.getName(), c.getLocation()));
        }
        jxMap.setCenterPosition(c.getLocation());
    }//GEN-LAST:event_listCountriesActionPerformed

    private void btnSearchIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchIPActionPerformed
        if (txtIpAddress.getText().trim().length() <= 0) {
            return;
        }        
        AddWaypointByIP(txtIpAddress.getText().trim(), chkPlaceMarker.isSelected(), true);
    }//GEN-LAST:event_btnSearchIPActionPerformed

    private void btnRemoveWaypointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveWaypointsActionPerformed
        if (listWaypoints.getSelectedIndex() >= 0) {
            for (Iterator<Waypoint> it = waypoints.iterator(); it.hasNext();) {
                Waypoint wp = it.next();
                if (listWaypoints.getSelectedItem().split(" ")[0].equals(Double.toString(wp.getPosition().getLatitude()))
                        && listWaypoints.getSelectedItem().split(" ")[1].equals(Double.toString(wp.getPosition().getLongitude()))) {
                    it.remove();
                }
            }
            listWaypoints.remove(listWaypoints.getSelectedIndex());

            //repaint the waypoints
            WaypointPainter painter = new WaypointPainter();
            painter.setWaypoints(waypoints);
            painter.setRenderer(new CustomWaypointRenderer());
            jxMap.getMainMap().setOverlayPainter(painter);
        }
    }//GEN-LAST:event_btnRemoveWaypointsActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        JFileChooser fc = new JFileChooser();
        int retVal = fc.showOpenDialog(menuBar);
        if (retVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            if (file.exists()) {
                WaypointData wd = null;
                try {
                    // opening a flow Input since the file "personne.serial"
                    FileInputStream fis = new FileInputStream(file);
                    // creation a "Flow object " with the flow file
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    try {
                        //clear the waypoints
                        waypoints.clear();
                        // deserialize
                        while ((wd = (WaypointData) ois.readObject()) != null) {
                            waypoints.add(new WaypointExtension(wd.getText(), new GeoPosition(wd.getLatitude(), wd.getLongitude())));
                        }

                    } catch (EOFException eof) {//after reading the file
                        //clear the waypoints list
                        listWaypoints.removeAll();
                        //re-add the waypoinds
                        for (Iterator<Waypoint> it = waypoints.iterator(); it.hasNext();) {
                            Waypoint w = it.next();
                            listWaypoints.add(w.getPosition().getLatitude() + " " + w.getPosition().getLongitude());
                        }
                        //repaint the waypoints
                        WaypointPainter painter = new WaypointPainter();
                        painter.setWaypoints(waypoints);
                        painter.setRenderer(new CustomWaypointRenderer());
                        jxMap.getMainMap().setOverlayPainter(painter);
                        
                    } finally {
                        // close the streams
                        try {
                            ois.close();
                        } finally {
                            fis.close();
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        //create the filechooser
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Save");
        fc.setApproveButtonText("Save");
        
        //get the selected file
        int retVal = fc.showOpenDialog(menuBar);
        if (retVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            try {
                //create the file steam
                FileOutputStream fis = new FileOutputStream(file);
                // create the object stream
                ObjectOutputStream ois = new ObjectOutputStream(fis);
                try {
                    //write each object in waypoints
                    for (Waypoint w : waypoints) {
                        ois.writeObject(new WaypointData(((WaypointExtension) w).getText(), w.getPosition().getLatitude(), w.getPosition().getLongitude()));
                    }
                    //empty the buffer
                    ois.flush();

                } finally {
                    //close the streams
                    try {
                        ois.close();
                    } finally {
                        fis.close();
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else {
            //TODO: code exception
        }
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        File file = new File(System.getProperty("user.dir") + "\\waypoints");
            try {
                //create the file steam
                FileOutputStream fis = new FileOutputStream(file);
                // create the object stream
                ObjectOutputStream ois = new ObjectOutputStream(fis);
                try {
                    //write each object in waypoints
                    for (Waypoint w : waypoints) {
                        ois.writeObject(new WaypointData(((WaypointExtension) w).getText(), w.getPosition().getLatitude(), w.getPosition().getLongitude()));
                    }
                    //empty the buffer
                    ois.flush();

                } finally {
                    //close the streams
                    try {
                        ois.close();
                    } finally {
                        fis.close();
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_saveMenuItemActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private java.awt.Button btnRemoveWaypoints;
    private java.awt.Button btnSearchIP;
    private javax.swing.JCheckBox chkCountryPlaceMarker;
    private javax.swing.JCheckBox chkPlaceMarker;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private org.jdesktop.swingx.JXMapKit jxMap;
    private java.awt.Label lblIpAddress;
    private javax.swing.JLabel lblStatus;
    private java.awt.List listCountries;
    private java.awt.List listWaypoints;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPanel panelStatusBar;
    private javax.swing.JPanel panelTab1;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTable tableGeoIP;
    private java.awt.TextField txtIpAddress;
    // End of variables declaration//GEN-END:variables
    private Set<Waypoint> waypoints = new HashSet<Waypoint>();
    ArrayList<Country> countryList = Country.AllCountries();
}
