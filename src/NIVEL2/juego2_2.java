
package NIVEL2;

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
public class juego2_2 extends JFrame{
    juego2_3 juegoo;
    private static final String Nombre = "Corre que te alcanzan";
    
    private int alto = 100;
    public juego2_2(){
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
    private String jardin = "/imagenes/juego2_2.jpg";
    private String pasamano = "/imagenes/pasamano.png";
    private String agua = "/imagenes/agua.gif";
    private int dx = 0;
    private int dy = 0;
    private int x;
    private int y;
    private Image imagen;
    private Image imagen2;
    private Image imagen3;
    private Image imagen4;
    private Image imagen5;
    private Image imagen6;
   
    private int a;
    public persona(){
        a = 0;
        x = 0;
        y = 490;
        ImageIcon imag = new ImageIcon(this.getClass().getResource(persona));
        imagen = imag.getImage();
        ImageIcon jar = new ImageIcon(this.getClass().getResource(jardin));
        imagen2 = jar.getImage();
        ImageIcon pasamanoo = new ImageIcon(this.getClass().getResource(pasamano));
        imagen3 = pasamanoo.getImage();
        ImageIcon arbustoo = new ImageIcon(this.getClass().getResource(agua));
        imagen4 = arbustoo.getImage();
        /*ImageIcon arbool4 = new ImageIcon(this.getClass().getResource(arbol4));
        imagen5 = arbool4.getImage();
        ImageIcon arbool5 = new ImageIcon(this.getClass().getResource(arbol5));
        imagen6 = arbool5.getImage();*/
     
    }
    
    public Image mostrarimagen(){
        return imagen2;
    }

    public void setY(int y) {
       this.y = y;
     }
    
    public Image mostrarpasamano(){
        return imagen3;
    }
   
    public Image mostrararbol4(){
        return imagen5;
    }
    public Image mostrararbol5(){
        return imagen6;
    }
   
    public Image mostraragua(){
        return imagen4;
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
                dy= -10;
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
            if(value2 < 430 && value > 350 && value < 380){
                dy=0;
                if(value > 380){
                    dy=10;
                }
            }
            
            
        }
        if(key == KeyEvent.VK_DOWN){
            if(value <= 500){
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
            if(value2 < 430 && value > 280 && value < 300){
                dy=0;
                if(value <280){
                    dy=-10;
                }
            }
            if(value2 > 600 && value > 280 && value < 300){
                dy=0;
                if(value <280){
                    dy=-10;
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
            if(value2 < 440 && value > 290 && value < 370){
                dx=0;
                if(value2 > 440){
                    dx=10;
                }
            }  
        }
        if(key == KeyEvent.VK_RIGHT){
            
            if(value2 < 1000){
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
            if(value2 > 590 && value > 290){
                dx=0;
                if(value2 < 590){
                    dx=-10;
                }
            }
            if(value2 > 990){
                juegoo = new juego2_3();
                dispose();
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
        int su =0;
        super.paint(grafica);
         
        
        Graphics2D gra1 = (Graphics2D) grafica;
        gra1.drawImage(persona1.mostrarimagen(),0,0,getWidth(),getHeight(),this);
        
        
        Graphics2D gra2 = (Graphics2D) grafica;
        gra2.drawImage(persona1.mostrarpasamano(),-18,375,600,195,this);
        gra2.drawImage(persona1.mostrarpasamano(),170,375,600,195,this);  
        while(su < 500){
             gra2.drawImage(persona1.mostraragua(),630+su,395,50,50,this);
             gra2.drawImage(persona1.mostraragua(),630+su,445,50,50,this);
             gra2.drawImage(persona1.mostraragua(),630+su,495,50,50,this);
             gra2.drawImage(persona1.mostraragua(),630+su,545,50,50,this);
             su=su+50;
        }
        
        
        
        gra2.drawImage(persona1.getImagen(),persona1.getX(),persona1.getY(),null); 
        gra2.drawImage(persona1.mostrarpasamano(),-10,525,600,195,this);
        gra2.drawImage(persona1.mostrarpasamano(),250,525,600,195,this);
        gra2.drawImage(persona1.mostrarpasamano(),-18,315,600,195,this);
        gra2.drawImage(persona1.mostrarpasamano(),170,315,600,195,this);
        gra2.drawImage(persona1.mostrarpasamano(),618,315,600,195,this);
        gra2.drawImage(persona1.mostrarpasamano(),870,315,600,195,this);
        
        
        
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
