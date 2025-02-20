/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Localizacao;
import Model.Registros;
import java.awt.Component;
import java.awt.geom.Point2D;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.Waypoint;
import org.jxmapviewer.viewer.WaypointPainter;

/**
 *
 * @author Ericp
 */
public class frmAgente extends javax.swing.JFrame {
Registros reg = new Registros();
public double latitude;
public double longitude;

    public frmAgente(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void SalvarCoords(){
        System.out.println(getLatitude());
    }
    /**
     * Creates new form frmAgente
     */
    public frmAgente() {
        initComponents();
      
         mapa1.init();
         GeoPosition centro = new GeoPosition(-24.49609687511922, -47.846299351792965); // Coordenadas de São Paulo
        mapa1.setAddressLocation(centro);
        mapa1.setZoom(4);
           List<Localizacao> listaLocalizacoes = reg.carregarLocalizacoes();

         
        // Cria waypoints a partir das localizações
        Set<Waypoint> waypoints = new HashSet<>();
        for (Localizacao loc : listaLocalizacoes) {
            GeoPosition posicao = new GeoPosition(loc.getLatitude(), loc.getLongitude());
            waypoints.add(new DefaultWaypoint(posicao));
        }
           
           
        WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<>();
        waypointPainter.setWaypoints(waypoints);
        mapa1.setOverlayPainter(waypointPainter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLat = new javax.swing.JTextField();
        lblLon = new javax.swing.JTextField();
        mapa1 = new Model.Mapa();
        btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        lblLat.setText("jTextField1");
        lblLat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLatActionPerformed(evt);
            }
        });

        lblLon.setText("jTextField1");
        lblLon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mapa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapa1MouseClicked(evt);
            }
        });

        btn.setText("+");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton1.setText("Logo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("O");
        jButton3.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jButton3HierarchyChanged(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mapa1Layout = new javax.swing.GroupLayout(mapa1);
        mapa1.setLayout(mapa1Layout);
        mapa1Layout.setHorizontalGroup(
            mapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapa1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(mapa1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(34, 34, 34))
        );
        mapa1Layout.setVerticalGroup(
            mapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mapa1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 319, Short.MAX_VALUE)
                .addGroup(mapa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mapa1Layout.createSequentialGroup()
                        .addComponent(btn)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mapa1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mapa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mapa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
        frmcadRegistros frmCad = new frmcadRegistros();
  frmCad.setVisible(true);
            frmCad.lblLat.setText(""+getLatitude());
            frmCad.lblLon.setText(""+getLongitude());
List<Localizacao> listaLocalizacoes = reg.carregarLocalizacoes();

         
        // Cria waypoints a partir das localizações
        Set<Waypoint> waypoints = new HashSet<>();
        for (Localizacao loc : listaLocalizacoes) {
            GeoPosition posicao = new GeoPosition(loc.getLatitude(), loc.getLongitude());
            waypoints.add(new DefaultWaypoint(posicao));
        }
           
           
        WaypointPainter<Waypoint> waypointPainter = new WaypointPainter<>();
        waypointPainter.setWaypoints(waypoints);
        mapa1.setOverlayPainter(waypointPainter);
    }//GEN-LAST:event_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new frmPopup().setVisible(true);
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mapa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapa1MouseClicked
        // TODO add your handling code here:
        Point2D pontoPixel = evt.getPoint();

   
       //recebe o valor dos pixels. teste de click
        GeoPosition geoPos = mapa1.getTileFactory().pixelToGeo(pontoPixel, mapa1.getZoom());
             // Converte o ponto em pixels para uma coordenada geográfica
         GeoPosition geoPosition = mapa1.convertPointToGeoPosition(pontoPixel);

        // Exibe a latitude e a longitude no console ou use conforme necessário
        System.out.println("Lat: "+ geoPosition.getLatitude());
        System.out.println("Latitude: " + geoPos.getLatitude() + ", Longitude: " + geoPos.getLongitude());
BigDecimal lat = new BigDecimal(geoPosition.getLatitude()).setScale(7, RoundingMode.HALF_UP);
BigDecimal lon = new BigDecimal(geoPosition.getLongitude()).setScale(7, RoundingMode.HALF_UP);
setLatitude(lat.doubleValue());
setLongitude(lon.doubleValue());
lblLat.setText(""+ getLatitude());
lblLon.setText(""+ getLongitude());

    }//GEN-LAST:event_mapa1MouseClicked

    private void lblLatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLatActionPerformed

    private void lblLonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLonActionPerformed

    private void jButton3HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jButton3HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3HierarchyChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        GeoPosition centro = new GeoPosition(-24.49609687511922, -47.846299351792965);
        mapa1.setAddressLocation(centro);
        mapa1.setZoom(4);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAgente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAgente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAgente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAgente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAgente().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField lblLat;
    private javax.swing.JTextField lblLon;
    private Model.Mapa mapa1;
    // End of variables declaration//GEN-END:variables
}
