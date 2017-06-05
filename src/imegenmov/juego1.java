
package imegenmov;

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


public class juego1 extends JFrame {
   
    
    private static final String Nombre = "Corre que te alcanzan";
    private static boolean cosa = true;
    juego2 juego;
    
    public juego1(){
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
    private String jardin = "/imagenes/jardin2.png";
    //jardin2.png
    //desierto1.jpg
    
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image imagen;
    private Image imagen2;
    
    public persona(){
        x = 35;
        y = 400;
        ImageIcon imag = new ImageIcon(this.getClass().getResource(persona));
        imagen = imag.getImage();
        ImageIcon jar = new ImageIcon(this.getClass().getResource(jardin));
        imagen2 = jar.getImage();
        
       
        
    }
    public Image mostrarimagen(){
        return imagen2;
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

    public Image getImagen() {
        return imagen;
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
     
        if(key == KeyEvent.VK_UP){
            dy= -1;
        }
        if(key == KeyEvent.VK_DOWN){
            dy= 1;
        }
        if(key == KeyEvent.VK_LEFT){
            dx= -1;
        }
        if(key == KeyEvent.VK_RIGHT){
            dx= 1;
        }
    
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
     
        if(key == KeyEvent.VK_UP){
            dy= 0;
        }
        if(key == KeyEvent.VK_DOWN){
            dy= 0;
        }
        if(key == KeyEvent.VK_LEFT){
            dx= 0;
        }
        if(key == KeyEvent.VK_RIGHT){
            dx= 0;
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
        //int z = persona1.getX();
        int w = persona1.getY();
        super.paint(grafica);
        Graphics2D gra1 = (Graphics2D) grafica;
        gra1.drawImage(persona1.mostrarimagen(),0,0,getWidth(),getHeight(),this);
        Graphics2D gra2 = (Graphics2D) grafica;
        if(persona1.getY() >= 90){  
            gra2.drawImage(persona1.getImagen(),persona1.getX(),persona1.getY(),null);
            
        }
        if(persona1.getY() == 90){  
             juego = new juego2(); 
             dispose();
            
        }
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
