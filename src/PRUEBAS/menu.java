
package PRUEBAS;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        Jugar = new javax.swing.JButton();
        instrucciones = new javax.swing.JButton();
        puntaje = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(204, 0, 0));
        salir.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 200, 50));

        Jugar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Jugar.setText("Jugar");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });
        getContentPane().add(Jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 200, 50));

        instrucciones.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        instrucciones.setText("Instrucciones");
        instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 200, 50));

        puntaje.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        puntaje.setText("Puntajes");
        puntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntajeActionPerformed(evt);
            }
        });
        getContentPane().add(puntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 200, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed
           nombre juego = new nombre();
           dispose();
    }//GEN-LAST:event_JugarActionPerformed

    private void instruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instruccionesActionPerformed
    
    }//GEN-LAST:event_instruccionesActionPerformed

    private void puntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntajeActionPerformed
        
    }//GEN-LAST:event_puntajeActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jugar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton instrucciones;
    private javax.swing.JButton puntaje;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
