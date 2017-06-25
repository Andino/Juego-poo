
package NIVEL1;

import NIVEL2.juego2_2;
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
public class juego1_3 extends JFrame{
    juego2_2 juegoo;
    private static final String Nombre = "Corre que te alcanzan";
    persona persona2 = new persona();
   

    private int alto = 100;
    public juego1_3(){
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        add(new dibujar());
        setTitle(Nombre);
        setSize(1030, 570);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
      
    
    }

 
    
    
    public class persona {
    private String persona = "/imagenes/persona1.png";
    private String jardin = "/imagenes/jardin13.png";
    private String aguaa = "/imagenes/agua.gif";
    private String arbusto = "/imagenes/arbusto2.png";
    private String utileria = "/imagenes/utileria.png";
    private int dx = 0;
    private int dy = 0;
    private int x;
    private int y;
    private Image imagen;
    private Image imagen2;
    private Image imagen3;
    private Image imagen4;
    private Image imagen5;
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
        ImageIcon uti = new ImageIcon(this.getClass().getResource(utileria));
        imagen5 = uti.getImage();
        
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
    public Image mostrarutileria(){
        return imagen5;
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
            if(value > 100 ){
               
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
            if(value2 > 790 && value2 < 885 && value < 175){
                dy=0; 
                if(value > 175){
                 dy=-10;
                } 
            }
            if(value2 > 870 && value2 < 950 && value < 101){
                dy=-10; 
                if(getY() <= 61){
                    juegoo = new juego2_2();
                    dispose();
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
            if(value2 > 795 && value2 < 900 && value < 165){
                dx=0;
                if(value2 > 890){
                    dx=10;
                }
            }
            
        }
        if(key == KeyEvent.VK_RIGHT){
            
            if(value2 < 925){
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
            if(value2 > 780 && value2 < 870 && value < 165){
                dx=0; 
                if(value2 < 780){
                 dx=-10;
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
public class dibujar extends JPanel implements ActionListener {
    private persona persona1;
    private Timer timer;

    public dibujar(){
       
        setBackground(Color.white);
        setFocusable(true);
        addKeyListener(new teclado());
        
        persona1 = new persona();
        timer = new Timer(20, this);
        timer.start();
    }
    
    public void paint(Graphics grafica){
        int suma =0;
        int suma2 = 91;
        
        super.paint(grafica);
        Graphics2D gra1 = (Graphics2D) grafica;
        gra1.drawImage(persona1.mostrarimagen(),0,0,getWidth(),getHeight(),this);
        
        Graphics2D gra = (Graphics2D) grafica;
        
        while(suma < 1050){
            gra.drawImage(persona1.mostraragua(),suma,475,75,100,this);
            suma=suma+75;
            
        }  
        while(suma2 < 465){
            gra.drawImage(persona1.mostraragua(),960,suma2,85,50,this);
            suma2= suma2+25;
        }
        gra.drawImage(persona1.mostraragua(),820,91,100,100,this);
        gra.drawImage(persona1.mostraragua(),920,91,100,100,this);
       
        Graphics2D grauti = (Graphics2D) grafica;    
        grauti.drawImage(persona1.mostrarutileria(),900,91,65,25,this); 
        grauti.drawImage(persona1.mostrarutileria(),900,112,65,25,this); 
        grauti.drawImage(persona1.mostrarutileria(),900,133,65,25,this); 
        grauti.drawImage(persona1.mostrarutileria(),900,154,65,25,this);
        grauti.drawImage(persona1.mostrarutileria(),900,175,65,25,this); 
        
        Graphics2D gra2 = (Graphics2D) grafica;    
        gra2.drawImage(persona1.getImagen(),persona1.getX(),persona1.getY(),null); 
        Graphics2D agu = (Graphics2D) grafica;
        agu.drawImage(persona1.mostrararbusto(),0,445,180,35,this);
        agu.drawImage(persona1.mostrararbusto(),150,445,180,35,this);
       
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
