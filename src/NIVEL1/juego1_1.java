
package NIVEL1;
import Objetos.materiales;
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
public class juego1_1 extends JFrame{
    private static final String Nombre = "Corre que te alcanzan";
    persona persona2 = new persona();
    private Objetos.persona enemigo;
    private Objetos.persona enemigo1;
    private Objetos.persona enemigo2;
    private Objetos.persona enemigo3;
    private Objetos.persona enemigo4;
    private Objetos.persona enemigo5;


    private int alto = 100;
    public juego1_1(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        add(new dibujar());
        setTitle(Nombre);
        setSize(1030, 570);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        hilo.start();
        hilo_segundario.start(); 
        tercero.start();
        cuarto.start();
        quinto.start();
        sexto.start();
    
    }
    
    Thread hilo = new Thread() {
        
        @Override
        public void run() {
            try {
                hilo.sleep(1000);
                while (true) {        
                     for(int i = 0; i < 35; i ++){
                         enemigo.movAuto("abajo", enemigo.getY(), enemigo.getX()); 
                         hilo.sleep(25);
                         if(enemigo.getX() == persona1.getX() && enemigo.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                     }
                     
                     for(int j = 0; j < 35; j ++){
                         enemigo.movAuto("arriba", enemigo.getY(), enemigo.getX()); 
                         hilo.sleep(25);
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
                         hilo.sleep(15);
                         if(enemigo1.getX() == persona1.getX() && enemigo1.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                     }
                     
                     for(int j = 0; j < 35; j ++){
                         enemigo1.movAuto("arriba", enemigo1.getY(), enemigo1.getX()); 
                         hilo.sleep(15);
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
                         hilo.sleep(61);
                         if(enemigo2.getX() == persona1.getX() && enemigo2.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                     }
                     
                     for(int j = 0; j < 35; j ++){
                         enemigo2.movAuto("arriba", enemigo2.getY(), enemigo2.getX()); 
                         hilo.sleep(61);
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
    
    Thread cuarto = new Thread() {
        
        @Override
        public void run() {
            try {
                hilo.sleep(1000);
                while (true) {        
                     for(int i = 0; i < 35; i ++){
                         enemigo4.movAuto("abajo", enemigo4.getY(), enemigo4.getX()); 
                         hilo.sleep(20);
                         if(enemigo4.getX() == persona1.getX() && enemigo4.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                     }
                     
                     for(int j = 0; j < 35; j ++){
                         enemigo4.movAuto("arriba", enemigo4.getY(), enemigo4.getX()); 
                         hilo.sleep(20);
                         if(enemigo4.getX() == persona1.getX() && enemigo4.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                      }
                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    };
    
    Thread quinto = new Thread() {
        
        @Override
        public void run() {
            try {
                hilo.sleep(1000);
                while (true) {        
                     for(int i = 0; i < 35; i ++){
                         enemigo5.movAuto("abajo", enemigo5.getY(), enemigo5.getX()); 
                         hilo.sleep(80);
                         if(enemigo5.getX() == persona1.getX() && enemigo5.getY() == persona1.getY())
                         {
                             JOptionPane.showMessageDialog(rootPane, "Pierdes");
                         }
                     }
                     
                     for(int j = 0; j < 35; j ++){
                         enemigo5.movAuto("arriba", enemigo2.getY(), enemigo2.getX()); 
                         hilo.sleep(80);
                         if(enemigo5.getX() == persona1.getX() && enemigo5.getY() == persona1.getY())
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
    
    Thread sexto = new Thread() {
        @Override
        public void run() {
            try {
                hilo.sleep(1000);
                while (true) {        
                     for(int i = 0; i < 35; i ++){
                         hilo.sleep(50);
                         enemigo3.movAuto("abajo", enemigo3.getY(), enemigo3.getX());
                         if(enemigo3.getX() == persona1.getX() && persona1.getY() == enemigo3.getY())
                         {
                             System.out.println("Sip");
                         }
                         else
                         {
                             
                         }
                     }
                     
                     for(int j = 0; j < 35; j ++){
                         hilo.sleep(50);
                         enemigo3.movAuto("arriba", enemigo3.getY(), enemigo3.getX()); 
                         if(enemigo3.getX() == persona1.getX() && enemigo3.getY() == persona1.getY())
                         {
                             System.out.println("Sip");
                         }
                         else
                         {
                             
                         }
                      }
                     hilo.sleep(20);
                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    };
    
    public class persona {
    private String persona = "/imagenes/persona1.png";
    private String enemigoo = "/imagenes/persona1.png";
    private String jardin = "/imagenes/jardin11.png";
    private String aguaa = "/imagenes/agua.gif";
    private String arbusto = "/imagenes/arbusto2.png";
   
    private materiales materiales;
    int pos1;
    int pos2;
    private int dx = 0;
    private int dy = 0;
    private int x;
    private int y;
    private Image imagen;
    private Image imagen2;
    private Image imagen3;
    private Image imagen4;
    private Image enemi;
   
    private int a;
    public persona(){
        a = 0;
        x = 0;
        y = 100;
        ImageIcon imag = new ImageIcon(this.getClass().getResource(persona));
        imagen = imag.getImage();
        ImageIcon jar = new ImageIcon(this.getClass().getResource(jardin));
        imagen2 = jar.getImage();
        ImageIcon agua = new ImageIcon(this.getClass().getResource(aguaa));
        imagen3 = agua.getImage();
        ImageIcon arbustoo = new ImageIcon(this.getClass().getResource(arbusto));
        imagen4 = arbustoo.getImage();
        
        ImageIcon enemigo = new ImageIcon(this.getClass().getResource(enemigoo));
        enemi = enemigo.getImage();
        
        
    }
    
    
    
     
    
    public Image mostrarimagen(){
        return imagen2;
    }

    public void setY(int y) {
       this.y = y;
     }
    
    public Image mostraragua(){
        return imagen3;
    }
    public Image mostrararbusto(){
        return imagen4;
    }
    
    public Image enemigo(){
        return enemi;
    }
    
    public void moverY(){
        y += dy;
    }
    public void moverX(){
        x += dx;
    }
    
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

        public void setDx(int dx) {
            this.dx = dx;
        }

        public void setDy(int dy) {
            this.dy = dy;
        }
    

    public Image getImagen() {
        return imagen;
    }
    
    public void setImage(String imagen) {
        ImageIcon imag = new ImageIcon(this.getClass().getResource(imagen));
        this.imagen = imag.getImage();
    } 
    
    public void keyPressed(KeyEvent e, int value,int value2){
        int key = e.getKeyCode();
       
        if(key == KeyEvent.VK_UP){
            if(value > 90){
               
                dy= -10;
                a++;
                if (a % 2 == 0) {
                    setImage("/imagenes/persona_arriba_" + (a % 2) + ".png");
                    repaint();
                } else {
                    setImage("/imagenes/persona_arriba_" + (a % 2) + ".png");
                }
            }
            else {
                
                dy= 0;
                a++;
                if (a % 2 == 0) {
                    setImage("/imagenes/persona_arriba_" + (a % 2) + ".png");
                    repaint();
                } else {
                    setImage("/imagenes/persona_arriba_" + (a % 2) + ".png");
                }
            }
        }
        if(key == KeyEvent.VK_DOWN){
            if(value <= 435){
                dy= 10;
                a++;
                if (a % 2 == 0) {
                    setImage("/imagenes/persona_abajo_" + (a % 2) + ".png");
                } 
                else {
                    setImage("/imagenes/persona_abajo_" + (a % 2) + ".png");
                }
            }
            else{
                dy= 0;
                a++;
                if (a % 2 == 0) {
                    setImage("/imagenes/persona_abajo_" + (a % 2) + ".png");
                } 
                else {
                    setImage("/imagenes/persona_abajo_" + (a % 2) + ".png");
                }
            }
            
        }
        if(key == KeyEvent.VK_LEFT){
            if(value2 > -10){
                dx= -10;
                a++;
                if (a % 2 == 0) {
                    setImage("/imagenes/persona_izquierda_" + (a % 2) + ".png");
                }
                else {
                    setImage("/imagenes/persona_izquierda_" + (a % 2) + ".png");
                }
            }
            else{
                dx= 0;
                a++;
                if (a % 2 == 0) {
                    setImage("/imagenes/persona_izquierda_" + (a % 2) + ".png");
                }
                else {
                    setImage("/imagenes/persona_izquierda_" + (a % 2) + ".png");
                }
            }
            
        }
        if(key == KeyEvent.VK_RIGHT){
            
            if(value2 < 1010){
                dx= 10;
                a++;
                if (a % 2 == 0) {
                    setImage("/imagenes/persona_derecha_" + (a % 2) + ".png");
                } 
                else {
                    setImage("/imagenes/persona_derecha_" + (a % 2) + ".png");
                }
            }
            
            else{
                dx= 0;
                a++;
                if (a % 2 == 0) {
                    setImage("/imagenes/persona_derecha_" + (a % 2) + ".png");
                } 
                else {
                    setImage("/imagenes/persona_derecha_" + (a % 2) + ".png");
                }
            }
        }
        if(key == KeyEvent.VK_ESCAPE){
             System.exit(0);
         }
        moverX();
        moverY();
    
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
     
        if(key == KeyEvent.VK_UP){
            dy= 0;
           // setImage("/imagenes/persona1.png");
            
        }
        if(key == KeyEvent.VK_DOWN){
            dy= 0;
           // setImage("/imagenes/persona1.png");
          
        }
        if(key == KeyEvent.VK_LEFT){
            dx= 0;
            //setImage("/imagenes/persona1.png");
            
        }
        if(key == KeyEvent.VK_RIGHT){
            dx= 0;
            //setImage("/imagenes/persona1.png");
            
        }
    
    }
    
}
    private persona persona1;
public class dibujar extends JPanel implements ActionListener {
    
    private Timer timer;

    public dibujar(){
       
        setBackground(Color.white);
        setFocusable(true);
        addKeyListener(new teclado());
        
        persona1 = new persona();
        enemigo3 = new Objetos.persona("", 50, 95);
        enemigo4 = new Objetos.persona("", 100, 95);
        enemigo5 = new Objetos.persona("", 250, 95);
        enemigo = new Objetos.persona("", 500, 95);
        enemigo1 = new Objetos.persona("", 700, 95);
        enemigo2 = new Objetos.persona("", 900, 95);
        timer = new Timer(20, this);
        timer.start();
    }
    
    public void paint(Graphics grafica){
        int suma =0;
        int suma2 = 788;
        juego1_2 juegoo;
        super.paint(grafica);
        Graphics2D gra1 = (Graphics2D) grafica;
        gra1.drawImage(persona1.mostrarimagen(),0,0,getWidth(),getHeight(),this);
        
        gra1.drawImage(enemigo.getImagen(),enemigo.getX(),enemigo.getY(),null); 
        gra1.drawImage(enemigo1.getImagen(),enemigo1.getX(),enemigo1.getY(),null); 
        gra1.drawImage(enemigo2.getImagen(),enemigo2.getX(),enemigo2.getY(),null); 
        gra1.drawImage(enemigo3.getImagen(),enemigo3.getX(),enemigo3.getY(),null); 
        gra1.drawImage(enemigo4.getImagen(),enemigo4.getX(),enemigo4.getY(),null); 
        gra1.drawImage(enemigo5.getImagen(),enemigo5.getX(),enemigo5.getY(),null); 
        
        
        Graphics2D gra = (Graphics2D) grafica;
        
        while(suma < 1050){
            gra.drawImage(persona1.mostraragua(),suma,475,75,100,this);
            suma=suma+75;
            
        }  
        while(suma2 < 1050){
            gra.drawImage(persona1.mostraragua(),suma2,90,25,25,this);
            suma2= suma2+25;
        } 
        Graphics2D gra2 = (Graphics2D) grafica;    
        gra2.drawImage(persona1.getImagen(),persona1.getX(),persona1.getY(),null); 
        
        Graphics2D agu = (Graphics2D) grafica;
        agu.drawImage(persona1.mostrararbusto(),0,445,180,35,this);
        agu.drawImage(persona1.mostrararbusto(),150,445,180,35,this);
        agu.drawImage(persona1.mostrararbusto(),730,445,180,35,this);
        agu.drawImage(persona1.mostrararbusto(),875,445,180,35,this);   
        agu.drawImage(persona1.mostrararbusto(),803,68,155,25,this);   
        agu.drawImage(persona1.mostrararbusto(),930,68,155,25,this);  
        
        if(persona1.getX() >= 1010){
            juegoo = new juego1_2();
            dispose();
            
        }
        System.out.println("x: "+persona1.getX());
        System.out.println("y: "+persona1.getY());
        
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
