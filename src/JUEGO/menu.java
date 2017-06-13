
package JUEGO;

public class menu extends javax.swing.JFrame{
    
    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
                       
    private void initComponents() {

        salir = new javax.swing.JButton();
        Jugar = new javax.swing.JButton();
        instrucciones = new javax.swing.JButton();
        puntaje = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(204, 0, 0));
        salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("X");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        Jugar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Jugar.setText("Jugar");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });
        getContentPane().add(Jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 50));

        instrucciones.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        instrucciones.setText("Instrucciones");
        instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 50));

        puntaje.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        puntaje.setText("Puntajes");
        puntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntajeActionPerformed(evt);
            }
        });
        getContentPane().add(puntaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, 50));

        nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre.setText("Nombre: ");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, -1, -1));

        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 180, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>                        

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {                                      
       System.exit(0);
    }                                     

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               juego1 juego1 = new juego1();
            }
        });
      dispose();
    }                                     

    private void instruccionesActionPerformed(java.awt.event.ActionEvent evt) {                                              
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new instrucciones().setVisible(true);
            }
        });
    }                                             

    private void puntajeActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
    }                                       

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {                                        
        usuario.getText();
    }                                       


                            
    private javax.swing.JButton Jugar;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton instrucciones;
    private javax.swing.JLabel nombre;
    private javax.swing.JButton puntaje;
    private javax.swing.JButton salir;
    private javax.swing.JTextField usuario;
    
}