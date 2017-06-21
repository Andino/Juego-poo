package JUEGO;
import java.applet.AudioClip;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


/**
 *
 * @author UCA
 */
public class frm_principal extends javax.swing.JFrame {

    public frm_principal()
    {
        initComponents();
        Thread Musica = new clases.Principal_Fondo("Musica");
        Musica.start();
        Musica.setPriority(10);
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_salir = new javax.swing.JButton();
        btn_registros = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        btn_instrucciones = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jp_formulario = new org.edisoncor.gui.panel.PanelRectTranslucido();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_nombre = new org.edisoncor.gui.textField.TextFieldRoundIcon();
        jp_instrucciones = new org.edisoncor.gui.panel.PanelTranslucido();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        btn_cerrarInstrucciones = new org.edisoncor.gui.button.ButtonTextDown();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1360, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/1.1.png"))); // NOI18N
        btn_salir.setToolTipText("");
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salir.setMargin(new java.awt.Insets(50, 20, 20, 20));
        btn_salir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/1.2.png"))); // NOI18N
        btn_salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/1.png"))); // NOI18N
        btn_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salirMouseEntered(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir);
        btn_salir.setBounds(400, 480, 110, 100);

        btn_registros.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        btn_registros.setForeground(new java.awt.Color(255, 255, 255));
        btn_registros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/4.1.png"))); // NOI18N
        btn_registros.setBorder(null);
        btn_registros.setBorderPainted(false);
        btn_registros.setContentAreaFilled(false);
        btn_registros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_registros.setMargin(new java.awt.Insets(50, 20, 20, 20));
        btn_registros.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/4.2.png"))); // NOI18N
        btn_registros.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/4.png"))); // NOI18N
        btn_registros.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/4.2.png"))); // NOI18N
        btn_registros.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_registrosMouseEntered(evt);
            }
        });
        btn_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registros);
        btn_registros.setBounds(160, 480, 100, 100);

        btn_aceptar.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        btn_aceptar.setForeground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/3.1.png"))); // NOI18N
        btn_aceptar.setToolTipText("Ingrese el nombre para desbloquear este boton");
        btn_aceptar.setBorder(null);
        btn_aceptar.setContentAreaFilled(false);
        btn_aceptar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/3.4.png"))); // NOI18N
        btn_aceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_aceptar.setMargin(new java.awt.Insets(50, 20, 20, 20));
        btn_aceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/3.2.png"))); // NOI18N
        btn_aceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/3.png"))); // NOI18N
        btn_aceptar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/3.2.png"))); // NOI18N
        btn_aceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_aceptarMouseEntered(evt);
            }
        });
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aceptar);
        btn_aceptar.setBounds(40, 480, 100, 100);

        btn_instrucciones.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        btn_instrucciones.setForeground(new java.awt.Color(255, 255, 255));
        btn_instrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/2.1.png"))); // NOI18N
        btn_instrucciones.setBorder(null);
        btn_instrucciones.setBorderPainted(false);
        btn_instrucciones.setContentAreaFilled(false);
        btn_instrucciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_instrucciones.setMargin(new java.awt.Insets(50, 20, 20, 20));
        btn_instrucciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/2.2.png"))); // NOI18N
        btn_instrucciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/2.png"))); // NOI18N
        btn_instrucciones.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/2.2.png"))); // NOI18N
        btn_instrucciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_instrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_instruccionesMouseEntered(evt);
            }
        });
        btn_instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_instruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btn_instrucciones);
        btn_instrucciones.setBounds(280, 480, 110, 100);

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/5.1.png"))); // NOI18N
        btn_guardar.setBorder(null);
        btn_guardar.setBorderPainted(false);
        btn_guardar.setContentAreaFilled(false);
        btn_guardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/5.2.png"))); // NOI18N
        btn_guardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/5.png"))); // NOI18N
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guardarMouseEntered(evt);
            }
        });
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar);
        btn_guardar.setBounds(420, 250, 33, 33);

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pixel Road: Chapter 1");

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome");

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Instrucciones");

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salir");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Records");

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jugar!");

        txt_nombre.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N

        javax.swing.GroupLayout jp_formularioLayout = new javax.swing.GroupLayout(jp_formulario);
        jp_formulario.setLayout(jp_formularioLayout);
        jp_formularioLayout.setHorizontalGroup(
            jp_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_formularioLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jp_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_formularioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_formularioLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_formularioLayout.createSequentialGroup()
                            .addGroup(jp_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jp_formularioLayout.createSequentialGroup()
                                    .addGroup(jp_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_formularioLayout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(325, 325, 325))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_formularioLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(31, 31, 31)
                                            .addComponent(jLabel5)
                                            .addGap(53, 53, 53)))
                                    .addComponent(jLabel4)))
                            .addGap(55, 55, 55)))))
        );
        jp_formularioLayout.setVerticalGroup(
            jp_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_formularioLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(68, 68, 68)
                .addGroup(jp_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addGroup(jp_formularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(47, 47, 47))
        );

        getContentPane().add(jp_formulario);
        jp_formulario.setBounds(10, 40, 520, 620);

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Instrucciones Generales");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/NPC1.png"))); // NOI18N

        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(10);
        jTextArea1.setText("Veo que estás algo impaciente, ¿no? \nBueno, por el momento no puedo \ndarte muchos detalles de lo que te \nespera, dado que la gran mayoría lo\naprenderas sobre la marcha... Y estoy\nmuy seguro de que nuestros caminos\nse volverán a cruzar.  \n\nPara no arruinarte la sorpresa, y no\ndejarte ir con las manos vacías... Te \ndaré un pequeño tip: muévete con \nlos cursores para poder caminar a lo\nlargo del mapa.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/1.gif"))); // NOI18N

        btn_cerrarInstrucciones.setBackground(new java.awt.Color(204, 204, 204));
        btn_cerrarInstrucciones.setText("Cerrar");
        btn_cerrarInstrucciones.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        btn_cerrarInstrucciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cerrarInstruccionesMouseEntered(evt);
            }
        });
        btn_cerrarInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarInstruccionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_instruccionesLayout = new javax.swing.GroupLayout(jp_instrucciones);
        jp_instrucciones.setLayout(jp_instruccionesLayout);
        jp_instruccionesLayout.setHorizontalGroup(
            jp_instruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_instruccionesLayout.createSequentialGroup()
                .addGroup(jp_instruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_instruccionesLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jp_instruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_instruccionesLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))))
                    .addGroup(jp_instruccionesLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jp_instruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(btn_cerrarInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jp_instruccionesLayout.setVerticalGroup(
            jp_instruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_instruccionesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_instruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(btn_cerrarInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jp_instrucciones);
        jp_instrucciones.setBounds(820, 80, 420, 500);

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Principal/fondo_principal.png"))); // NOI18N
        getContentPane().add(lbl_fondo);
        lbl_fondo.setBounds(0, 0, 1360, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Thread Musica = new clases.Principal_Fondo("Musica");
        Musica.start();
        Musica.setPriority(10);
        
        btn_aceptar.setEnabled(false);
        jp_instrucciones.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
            Thread Salir = new clases.Principal_Salir("Salir");
            Salir.start();
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea salir del juego?", "Confirmar decisión", JOptionPane.ERROR_MESSAGE, JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) 
            {
               System.exit(0);
            }
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_instruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_instruccionesActionPerformed
        Thread Boton = new clases.Principal_Instrucciones("Boton");
        Boton.start();
        jp_instrucciones.setVisible(true);
    }//GEN-LAST:event_btn_instruccionesActionPerformed

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        Thread Boton = new clases.Principal_MouseOverButton("Boton");
        Boton.start();
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_registrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrosMouseEntered
        Thread Boton = new clases.Principal_MouseOverButton("Boton");
        Boton.start();
    }//GEN-LAST:event_btn_registrosMouseEntered

    private void btn_instruccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_instruccionesMouseEntered
        Thread Boton = new clases.Principal_MouseOverButton("Boton");
        Boton.start();
    }//GEN-LAST:event_btn_instruccionesMouseEntered

    private void btn_aceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aceptarMouseEntered
        Thread Boton = new clases.Principal_MouseOverButton("Boton");
        Boton.start();
    }//GEN-LAST:event_btn_aceptarMouseEntered

    private void btn_registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrosActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if(txt_nombre.getText().isEmpty())
        {
            Thread Boton = new clases.Principal_EmptyTxt("Boton");
            Boton.start();
            JOptionPane.showMessageDialog(null, "¡Debe ingresar un nombre antes de guardar!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Thread Boton = new clases.Principal_GuardarNombre("Boton");
            Boton.start();
            btn_aceptar.setEnabled(true); 
        }
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cerrarInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarInstruccionesActionPerformed
        jp_instrucciones.setVisible(false);
    }//GEN-LAST:event_btn_cerrarInstruccionesActionPerformed

    private void btn_cerrarInstruccionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarInstruccionesMouseEntered
        Thread Boton = new clases.Principal_MouseOverButton("Boton");
        Boton.start();
    }//GEN-LAST:event_btn_cerrarInstruccionesMouseEntered

    private void btn_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseEntered
       Thread Boton = new clases.Principal_MouseOverButton("Boton");
       Boton.start();
    }//GEN-LAST:event_btn_guardarMouseEntered

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
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private org.edisoncor.gui.button.ButtonTextDown btn_cerrarInstrucciones;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_instrucciones;
    private javax.swing.JButton btn_registros;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private org.edisoncor.gui.panel.PanelRectTranslucido jp_formulario;
    private org.edisoncor.gui.panel.PanelTranslucido jp_instrucciones;
    private javax.swing.JLabel lbl_fondo;
    private org.edisoncor.gui.textField.TextFieldRoundIcon txt_nombre;
    // End of variables declaration//GEN-END:variables
}
