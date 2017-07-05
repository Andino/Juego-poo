package NIVEL1;

import Objetos.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class juego1 extends JFrame {
   
    private int alto = 100;
    public juego1()
    {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        add(new dibujar());
        setSize(1030, 570);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        //hilo.start();
    }
    
    private persona persona1;
    private enemigo1 enemigo;
    private persona enemigo1;
    private persona enemigo2;
    private materiales materiales;
    int pos1;
    int pos2;
    
    Thread hilo = new Thread() {
        
        @Override
        public void run() {
            try {
                hilo.sleep(1000);
                while (true) {        
                     for(int i = 0; i < 35; i ++){
                         enemigo.movAuto("abajo", enemigo.getY(), enemigo.getX()); 
                         hilo.sleep(40);
                         if(enemigo.getX() == persona1.getX() && enemigo.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                     }
                     
                     for(int j = 0; j < 35; j ++){
                         enemigo.movAuto("arriba", enemigo.getY(), enemigo.getX()); 
                         hilo.sleep(40);
                         if(enemigo.getX() == persona1.getX() && enemigo.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                      }
                     hilo.sleep(20);
                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    };
    
    Thread hilo_segundario = new Thread() {
        
        @Override
        public void run() {
            try {
                hilo.sleep(1000);
                while (true) {        
                     for(int i = 0; i < 35; i ++){
                         enemigo1.movAuto("abajo", enemigo1.getY(), enemigo1.getX()); 
                         hilo.sleep(20);
                         if(enemigo1.getX() == persona1.getX() && enemigo1.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                     }
                     
                     for(int j = 0; j < 35; j ++){
                         enemigo1.movAuto("arriba", enemigo1.getY(), enemigo1.getX()); 
                         hilo.sleep(20);
                         if(enemigo1.getX() == persona1.getX() && enemigo1.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                      }
                     hilo.sleep(20);
                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    };
    
    Thread tercero = new Thread() {
        @Override
        public void run() {
            try {
                hilo.sleep(1000);
                while (true) {        
                     for(int i = 0; i < 35; i ++){
                         enemigo2.movAuto("abajo", enemigo2.getY(), enemigo2.getX()); 
                         hilo.sleep(10);
                         if(enemigo2.getX() == persona1.getX() && enemigo2.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                     }
                     
                     for(int j = 0; j < 35; j ++){
                         enemigo2.movAuto("arriba", enemigo2.getY(), enemigo2.getX()); 
                         hilo.sleep(10);
                         if(enemigo2.getX() == persona1.getX() && enemigo2.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                      }
                     hilo.sleep(20);
                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    }; 
    
    public class dibujar extends JPanel implements ActionListener {
        private Timer timer;

        public dibujar()
        {       
            setBackground(Color.white);
            setFocusable(true);
            addKeyListener(new teclado());

            persona1 = new persona("");
            enemigo = new enemigo1("", 500, 95);
            enemigo1 = new persona("", 700, 95);
            enemigo2 = new persona("", 900, 150);
            
            materiales = new materiales();
            timer = new Timer(20, this);
            timer.start();
        }

        public void paint(Graphics grafica)
        {
            juego1_1  juegoo;
            int suma =0;
            int suma2 = 575;
            super.paint(grafica);
            Graphics2D gra1 = (Graphics2D) grafica;
            gra1.drawImage(materiales.mostrarimagen(),0,0,getWidth(),getHeight(),this);

            //gra1.drawImage(materiales.mostrarimagen(),0,0,getWidth(),getHeight(),this);

            Graphics2D gra = (Graphics2D) grafica;

            while(suma < 1050)
            {
                gra.drawImage(materiales.mostraragua(),suma,475,75,100,this);
                suma=suma+75;            
            }

            Graphics2D gra2 = (Graphics2D) grafica;    
            gra2.drawImage(persona1.getImagen(),persona1.getX(),persona1.getY(),null); 
            
            gra2.drawImage(enemigo.getImagen(),enemigo.getX(),enemigo.getY(),null); 
            gra2.drawImage(enemigo1.getImagen(),enemigo1.getX(),enemigo1.getY(),null); 
            gra2.drawImage(enemigo2.getImagen(),enemigo2.getX(),enemigo2.getY(),null);          
            
            Graphics2D agu = (Graphics2D) grafica;
            agu.drawImage(materiales.mostrararbusto(),730,445,180,35,this);
            agu.drawImage(materiales.mostrararbusto(),875,445,180,35,this);   
            if(persona1.getX() >= 995)
            {
                juegoo = new juego1_1();
                dispose();

            }
        }


        public void actionPerformed(ActionEvent e) {
              repaint();
        }

        public final class teclado extends KeyAdapter{

            public void keyPressed(KeyEvent e) {
                persona1.keyPressed(e, persona1.getY(),persona1.getX());
            }

            public void keyReleased(KeyEvent e) {
                persona1.keyReleased(e);
            }

        }
    } 
}