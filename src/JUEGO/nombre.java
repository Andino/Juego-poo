
package JUEGO;
import NIVEL1.juego1;

public class nombre extends javax.swing.JFrame{
    public nombre() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

        ACEPTAR = new javax.swing.JButton();
        cajanombre = new javax.swing.JTextField();
        nombreper = new javax.swing.JLabel();
        jugar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        icono = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ACEPTAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ACEPTAR.setText("Aceptar");
        ACEPTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACEPTARActionPerformed(evt);
            }
        });
        getContentPane().add(ACEPTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 110, 30));
        getContentPane().add(cajanombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 190, 30));

        nombreper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombreper.setForeground(new java.awt.Color(255, 255, 255));
        nombreper.setText("Ingrese nombre de usuario:  ");
        getContentPane().add(nombreper, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 30));

        jugar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jugar.setText("Jugar");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });
        getContentPane().add(jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 110, 30));

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 110, 30));

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anigif.gif"))); // NOI18N
        getContentPane().add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nombre1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }                      

    private void ACEPTARActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
    }                                       
    
    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {                                      
        new juego1().setVisible(true);
        dispose();
    }   
    
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {                                         
       new menu().setVisible(true);
       dispose();
    }                                        

                      
    private javax.swing.JButton ACEPTAR;
    private javax.swing.JTextField cajanombre;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JButton jugar;
    private javax.swing.JLabel nombreper;
}
