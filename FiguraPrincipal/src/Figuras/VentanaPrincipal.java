
package Figuras;
import java.awt.*;
import javax.swing.*;


public class VentanaPrincipal extends javax.swing.JFrame {
    private Container contenedor;
    
    
    public VentanaPrincipal() {
        initComponents();
        setTitle("Figuras");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cilindro = new javax.swing.JButton();
        esfera = new javax.swing.JButton();
        piramide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cilindro.setText("Cilindro");
        cilindro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cilindroActionPerformed(evt);
            }
        });

        esfera.setText("Esfera");
        esfera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esferaActionPerformed(evt);
            }
        });

        piramide.setText("Pirámide");
        piramide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piramideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cilindro)
                .addGap(40, 40, 40)
                .addComponent(esfera)
                .addGap(38, 38, 38)
                .addComponent(piramide)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cilindro)
                    .addComponent(esfera)
                    .addComponent(piramide))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void inicio() {
        contenedor = getContentPane(); 
        contenedor.setLayout(null);
        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
    }
    
    private void cilindroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cilindroActionPerformed
        VentanaCilindro cilindro = new VentanaCilindro();
        cilindro.setVisible(true);
        
    }//GEN-LAST:event_cilindroActionPerformed

    private void esferaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esferaActionPerformed
        VentanaEsfera esfera = new VentanaEsfera();
        esfera.setVisible(true);
    }//GEN-LAST:event_esferaActionPerformed

    private void piramideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piramideActionPerformed
        VentanaPiramide piramide = new VentanaPiramide();
        piramide.setVisible(true);
    }//GEN-LAST:event_piramideActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cilindro;
    private javax.swing.JButton esfera;
    private javax.swing.JButton piramide;
    // End of variables declaration//GEN-END:variables
}
