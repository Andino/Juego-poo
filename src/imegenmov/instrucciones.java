
package imegenmov;

public class instrucciones extends javax.swing.JFrame{
    public instrucciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        menu = new javax.swing.JButton();
        texto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        dra1 = new javax.swing.JLabel();
        dra2 = new javax.swing.JLabel();
        dra3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        poke2 = new javax.swing.JLabel();
        poke3 = new javax.swing.JLabel();
        arbol = new javax.swing.JLabel();
        instrucciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(0, 102, 204));
        menu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setText("MENU");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new menu().setVisible(true);
                dispose();
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        texto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/instrucc.png"))); // NOI18N
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("solamente puede hacer uso de las teclas\ncursoras para desplazarse por el terreno\nde juego, para validar a los primeros lugares\nse hará por medio de tiempo, se llevara un\nCronometro que se detendrá hasta que termine\nel ultimo nivel.\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 370, 70));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("No puede desplazarse en areas \ndonde se encuentran arboles.");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 270, 60));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Para poder abrir la puerta que\nconduce al siguiente nivel se\ndebe hacer lo siguiente: \n\n1)colocarse sobre la la pokeball\nnaranja lo cual abrirá  parte \nde la puerta.\n\n2)luego colocarse sobre la pokeball\nroja para abrir completamente\nla puerta.\n\nnota: Recuerde que si no respeta\nel orden  para presionar las\npokeballs la puerta no se abrira\n");
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 270, 80));

        dra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dra1.png"))); // NOI18N
        getContentPane().add(dra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        dra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dra2.png"))); // NOI18N
        getContentPane().add(dra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        dra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dra3.png"))); // NOI18N
        getContentPane().add(dra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Tenga mucho cuidado al estar en \ncada uno de los niveles, los\nreyes de cada nivel son muy malos\ne intentaran matarte asi que \nalejate de ellos.");
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 270, 100));

        poke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llave2.png"))); // NOI18N
        getContentPane().add(poke2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        poke3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llave1.png"))); // NOI18N
        getContentPane().add(poke3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        arbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/arbol11.png"))); // NOI18N
        getContentPane().add(arbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        instrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/instruc.jpg"))); // NOI18N
        instrucciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 598));

        pack();
    }                        

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {                                     
       System.exit(0);
    }                                    

                       
    private javax.swing.JLabel arbol;
    private javax.swing.JLabel dra1;
    private javax.swing.JLabel dra2;
    private javax.swing.JLabel dra3;
    private javax.swing.JLabel instrucciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JButton menu;
    private javax.swing.JLabel poke2;
    private javax.swing.JLabel poke3;
    private javax.swing.JLabel texto;
}
