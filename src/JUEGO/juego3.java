
package JUEGO;

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
import javax.swing.JPanel;
import javax.swing.Timer;

public class juego3 extends JFrame{
    private static final String Nombre = "Corre que te alcanzan";
    private static boolean cosa = true;
    juego2 juego;
    private int alto = 100;
    public juego3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new dibujar());
        setTitle(Nombre);
        setSize(1030, 570);
        setVisible(cosa);
        setLocationRelativeTo(null);
        setResizable(false);
        
    
    }
    public class persona {
    private String persona = "/imagenes/persona1.png";
    private String jardin = "/imagenes/FINAL.jpg";
    private String lava = "/imagenes/hR9768t.gif";
    //jardin2.png
    //desierto1.jpg
    //FINAL.jpg
    private int dx = 0;
    private int dy = 0;
    private int x;
    private int y;
    private Image imagen;
    private Image imagen2;
    private Image imagen3;
    private int a;
    public persona(){
        a = 0;
        x = 35;
        y = 95;
        ImageIcon imag = new ImageIcon(this.getClass().getResource(persona));
        imagen = imag.getImage();
        ImageIcon jar = new ImageIcon(this.getClass().getResource(jardin));
        imagen2 = jar.getImage();
        ImageIcon lavaa = new ImageIcon(this.getClass().getResource(lava));
        imagen3 = lavaa.getImage();
       
        
    }
    public Image mostrarimagen(){
        return imagen2;
    }
    public Image mostrarlava(){
        return imagen3;
    }
    public void mover(){
        x += dx;
        y += dy;
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
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
     
        if(key == KeyEvent.VK_UP){
            dy= -1;
            a++;
            if (a % 2 == 0) {
                setImage("/imagenes/persona_arriba_" + (a % 2) + ".png");
            } else {
                setImage("/imagenes/persona_arriba_" + (a % 2) + ".png");
            }
        }
        if(key == KeyEvent.VK_DOWN){
            dy= 1;
            a++;
            if (a % 2 == 0) {
                setImage("/imagenes/persona_abajo_" + (a % 2) + ".png");
            } else {
                setImage("/imagenes/persona_abajo_" + (a % 2) + ".png");
            }
        }
        if(key == KeyEvent.VK_LEFT){
            dx= -1;
            a++;
            if (a % 2 == 0) {
                setImage("/imagenes/persona_izquierda_" + (a % 2) + ".png");
            } else {
                setImage("/imagenes/persona_izquierda_" + (a % 2) + ".png");
            }
        }
        if(key == KeyEvent.VK_RIGHT){
            dx= 1;
            a++;
            if (a % 2 == 0) {
                setImage("/imagenes/persona_derecha_" + (a % 2) + ".png");
            } else {
                setImage("/imagenes/persona_derecha_" + (a % 2) + ".png");
            }
        }
    
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
     
        if(key == KeyEvent.VK_UP){
            dy= 0;
            setImage("/imagenes/persona1.png");
            
        }
        if(key == KeyEvent.VK_DOWN){
            dy= 0;
            setImage("/imagenes/persona1.png");
          
        }
        if(key == KeyEvent.VK_LEFT){
            dx= 0;
            setImage("/imagenes/persona1.png");
            
        }
        if(key == KeyEvent.VK_RIGHT){
            dx= 0;
            setImage("/imagenes/persona1.png");
            
        }
    
    }
    
}
public class dibujar extends JPanel implements ActionListener {
    private persona persona1;
    private Timer timer;
    
    
    public dibujar(){
        
        setBackground(Color.white);
        setFocusable(true);
        addKeyListener(new teclado());
        
        persona1 = new persona();
        timer = new Timer(0, this);
        timer.start();
    }
    
    public void paint(Graphics grafica){
   
        super.paint(grafica);
        Graphics2D gra1 = (Graphics2D) grafica;
        gra1.drawImage(persona1.mostrarimagen(),0,0,getWidth(),getHeight(),this);
        Graphics2D gra3 = (Graphics2D) grafica;
        gra3.drawImage(persona1.mostrarlava(),974,280,50,50,this);
        Graphics2D gra2 = (Graphics2D) grafica;
        gra2.drawImage(persona1.getImagen(),persona1.getX(),persona1.getY(),null);
        
        //}
        /*if(persona1.getY() == 90){  
             juego = new juego2(); 
             dispose();            
        }*/
    }
    
    
    public void actionPerformed(ActionEvent e) {
        persona1.mover();
        repaint();
    }
    
    public final class teclado extends KeyAdapter{

        public void keyPressed(KeyEvent e) {
            persona1.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) {
            persona1.keyReleased(e);
        }
 
     }
    
}
    
}
