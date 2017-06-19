
package NIVEL3;

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
    juego3_1 juegoo;
    private static final String Nombre = "Corre que te alcanzan";
    
   

    private int alto = 100;
    public juego3(){
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
    private String jardin = "/imagenes/jardin3.jpg";
    private String lava = "/imagenes/lava.gif";
    private String arbol4 = "/imagenes/arbol4.png";
    private String arbol5= "/imagenes/arbol5.png";
    private String utileria = "/imagenes/arbolnivel3.png";
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
        x = 30;
        y = 90;
        ImageIcon imag = new ImageIcon(this.getClass().getResource(persona));
        imagen = imag.getImage();
        ImageIcon jar = new ImageIcon(this.getClass().getResource(jardin));
        imagen2 = jar.getImage();
        ImageIcon lavaa = new ImageIcon(this.getClass().getResource(lava));
        imagen3 = lavaa.getImage();
        ImageIcon arbustoo = new ImageIcon(this.getClass().getResource(utileria));
        imagen4 = arbustoo.getImage();
        ImageIcon arbool4 = new ImageIcon(this.getClass().getResource(arbol4));
        imagen5 = arbool4.getImage();
        ImageIcon arbool5 = new ImageIcon(this.getClass().getResource(arbol5));
        imagen6 = arbool5.getImage();
     
    }
    
    public Image mostrarimagen(){
        return imagen2;
    }

    public void setY(int y) {
       this.y = y;
     }
    
    public Image mostrarlava(){
        return imagen3;
    }
   
    public Image mostrararbol4(){
        return imagen5;
    }
    public Image mostrararbol5(){
        return imagen6;
    }
   
    public Image mostrarutileria(){
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
            if(value2 > 200 && value2 < 350 && value < 310){
                dy=0; 
                if(value > 300){
                 dy=10;
                }  
            }
            
            
        }
        if(key == KeyEvent.VK_DOWN){
            if(value <= 475){
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
            if(value2 > 570 && value2 < 790 && value >450){
                dy=10;
                if(value > 520){
                    dy =0;
                }
            }
            if(value2 > 760 && value2 < 840 && value > 460){
                dy=0; 
                if(value < 460){
                 dy=-10;
                }  
            }
            
            if(value2 > 820 && value2 < 875 && value > 400){
                dy=0; 
                if(value < 380){
                 dy=-10;
                }  
            }
            if(value2 > 860 && value2 < 1010 && value > 350){
                dy=0; 
                if(value < 350){
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
            if(value2 > 272 && value2 < 360 && value < 300){
                dx=0; 
                if(value2 > 360){
                 dx=10;
                }  
            }
            if(value2 > 0 && value2 < 590 && value >480){
                dx=0;
                if(value2 > 590){
                    dx =10;
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
            if(value2 > 190 && value2 < 270 && value < 300){
                dx=0; 
                if(value2 < 190){
                 dx=-10;
                }  
            }
            if(value2 > 750 && value2 < 815 && value > 470){
                dx=0; 
                if(value2 < 750){
                 dx=-10;
                }  
            }
            if(value2 > 810 && value2 < 855 && value > 410){
                dx=0; 
                if(value2 < 810){
                 dx=-10;
                }  
            }
            if(value2 > 850 && value2 < 920 && value > 360){
                dx=0; 
                if(value2 < 850){
                 dx=-10;
                }  
            }
            if(getX() >=1000){
                juegoo = new juego3_1();
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
        int su = 0;

        super.paint(grafica);
        Graphics2D gra1 = (Graphics2D) grafica;
        gra1.drawImage(persona1.mostrarimagen(),0,0,getWidth(),getHeight(),this);
        Graphics2D gra = (Graphics2D) grafica;
        while(su < 250){
            gra.drawImage(persona1.mostrarlava(),805+su,511,50,70,this);
            gra.drawImage(persona1.mostrarlava(),855+su,461,50,50,this);
            gra.drawImage(persona1.mostrarlava(),905+su,411,50,50,this);
            su=su+50;
        }


        Graphics2D gra2 = (Graphics2D) grafica;    
        gra2.drawImage(persona1.getImagen(),persona1.getX(),persona1.getY(),null); 
        Graphics2D a = (Graphics2D) grafica;
        a.drawImage(persona1.mostrarutileria(),0,435,600,120,this);
        Graphics2D ab = (Graphics2D) grafica;
        ab.drawImage(persona1.mostrararbol5(),200,180,130,120,this);
        ab.drawImage(persona1.mostrararbol5(),275,120,110,100,this);
        
        Graphics2D abc = (Graphics2D) grafica;
        abc.drawImage(persona1.mostrararbol4(),270,180,130,120,this);
        
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
