
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
public class juego3_4 extends JFrame{
    private static final String Nombre = "Corre que te alcanzan";

    private int alto = 100;
    public juego3_4(){
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
    private String jardin = "/imagenes/nivel3.jpg";
    private String lava = "/imagenes/lava.gif";
    private String pasamano = "/imagenes/pasamano.png";
    private String arbolrosa= "/imagenes/puenteangostoentrada.png";
    private String utileria = "/imagenes/imagen123.png";
    private String arbol = "/imagenes/arbo.png";
    private String arbo = "/imagenes/arbusto2_1.png";
    private String arb = "/imagenes/arbolrosa.png";
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
    private Image imagen7;
    private Image imagen8;
    private Image imagen9;
    private int a;
    public persona(){
        a = 0;
        x = 10;
        y = 240;
        ImageIcon imag = new ImageIcon(this.getClass().getResource(persona));
        imagen = imag.getImage();
        ImageIcon jar = new ImageIcon(this.getClass().getResource(jardin));
        imagen2 = jar.getImage();
        ImageIcon lavaa = new ImageIcon(this.getClass().getResource(lava));
        imagen3 = lavaa.getImage();
        ImageIcon arbustoo = new ImageIcon(this.getClass().getResource(utileria));
        imagen4 = arbustoo.getImage();
        ImageIcon pasamanoo = new ImageIcon(this.getClass().getResource(pasamano));
        imagen5 = pasamanoo.getImage();
        ImageIcon arbool = new ImageIcon(this.getClass().getResource(arbolrosa));
        imagen6 = arbool.getImage();
        ImageIcon arboool = new ImageIcon(this.getClass().getResource(arbol));
        imagen7 = arboool.getImage();
        ImageIcon arbooll = new ImageIcon(this.getClass().getResource(arbo));
        imagen8 = arbooll.getImage();
        ImageIcon ar = new ImageIcon(this.getClass().getResource(arb));
        imagen9 = ar.getImage();
        
    }
    
    public Image mostrarimagen(){
        return imagen2;
    }
    public Image mostrargen(){
        return imagen8;
    }
    public Image mostrararb(){
        return imagen9;
    }
    
    public Image mostrararbol(){
        return imagen7;
    }
    public void setY(int y) {
       this.y = y;
     }
    
    public Image mostrarlava(){
        return imagen3;
    }
   
    public Image mostrarpasamano(){
        return imagen5;
    }
    public Image mostrararbolrosa(){
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
            if(value > 55){
               
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
            if(value2 > 50 && value2 < 200 && value > 90 && value < 220){
                dy=0; 
                if(value > 220){
                 dy=10;
                }  
            }
            if(value2 > 120 && value2 < 310 && value < 320 && value > 300){
                dy=0; 
                if(value > 340){
                 dy=10;
                }  
            }
            if(value2 > 320 && value2 < 470 && value < 400 && value > 380){
                dy=0; 
                if(value > 400){
                 dy=10;
                }  
            }
            if(value2 > 410 && value2 < 670 && value > 300 && value < 320){
                dy=0; 
                if(value > 320){
                 dy=10;
                }  
            }
            if(value2 > 650 && value2 < 690 && value > 300 && value < 410){
                dy=0; 
                if(value > 410){
                 dy=10;
                }  
            }
            if(value2 > 400 && value2 < 930 && value > 150 && value < 210){
                dy=0; 
                if(value > 200){
                 dy=10;
                }  
            }
        }
        if(key == KeyEvent.VK_DOWN){
            if(value < 440){
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
            if(value2 > 50 && value2 < 200 && value > 80 && value < 150){
                dy=0; 
                if(value < 80){
                 dy=-10;
                }  
            }
            if(value2 > 50 && value2 < 260 && value > 340){
                dy=0; 
                if(value < 350){
                 dy=-10;
                }  
            }
            if(value2 > 120 && value2 < 310 && value > 240 && value < 270){
                dy=0; 
                if(value < 240){
                 dy=-10;
                }  
            }
            if(value2 > 320 && value2 < 470 && value < 380 && value > 340){
                dy=0; 
                if(value < 340){
                 dy=-10;
                }  
            }
            if(value2 > 510 && value2 < 600 && value > 340){
                dy=0; 
                if(value < 340){
                 dy=-10;
                }  
            }
            if(value2 > 400 && value > 240 && value < 280){
                dy=0; 
                if(value < 240){
                 dy=-10;
                }  
            }
            if(value2 > 680 && value2 < 740 && value > 240 && value < 280){
                dy=10;
            }
            if(value2 > 920 && value2 < 990 && value > 240 && value < 280){
                dy=10;
            }
            if(value2 > 400 && value2 < 930 && value > 100 && value < 220){
                dy=0; 
                if(value > 200){
                 dy=10;
                }  
            }
            if(value2 > 720 && value > 400){
                dy=0; 
                if(value < 400){
                 dy=-10;
                }  
            }
            if(value2 < 65 && value > 240){
                dy=0; 
                if(value < 240){
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
            if(value2 > 100 && value2 < 210 && value > 90 && value < 210){
                dx=0; 
                if(value2 > 210){
                 dx=10;
                }  
            }        
            if(value2 > 50 && value2 < 80 && value > 90){
                dx=0; 
                if(value2 > 80){
                 dx=-10;
                }  
            }
            if(value2 > 100 && value2 < 270 && value > 350){
               dx=0; 
               if(value2 > 270){
                dx=10;
               }  
            }
            if(value2 > 300 && value2 < 360 && value > 30 && value < 390){
                dx=0; 
                if(value2 > 360){
                 dx=-10;
                }  
            }
            if(value2 > 530 && value2 < 610 && value > 350){
               dx=0; 
               if(value2 > 610){
                dx=10;
               }  
            }
            if(value2 > 450 && value2 < 480 && value > 350 && value < 400){
                dx=0;
                if(value2 > 480){
                    dx=10;
                }
            }
            if(value2 > 660 && value2 < 700 && value > 250 && value < 400){
                dx=0;
                if(value2 > 700){
                    dx=10;
                }
            }
            if(value2 > 900 && value2 < 940 && value > 250){
                dx=0;
                if(value2 > 940){
                    dx=10;
                }
            }
            if(value2 > 700 && value2 < 940 && value > 110 && value < 200){
                dx=0; 
                if(value2 > 940){
                 dx=10;
                }  
            }
            
        }
        if(key == KeyEvent.VK_RIGHT){
            
            if(value2 < 980){
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
            if(value2 > 40 && value2 < 60 && value > 90){
                dx=0; 
                if(value2 < 40){
                 dx=-10;
                }  
            }
            if(value2 > 290 && value2 < 320 && value > 30 && value < 390){
                dx=0; 
                if(value2 < 290){
                 dx=-10;
                }  
            }
            if(value2 > 110 && value2 < 310 && value > 250 && value < 310){
                dx=0; 
                if(value < 120){
                 dx=-10;
                }  
            }
            if(value2 > 500 && value2 < 520 && value > 350){
               dx=0; 
               if(value2 < 500){
                dx=-10;
               }  
            }
            if(value2 > 640 && value2 < 660 && value > 300 && value < 400){
                dx=0;
                if(value2 < 640){
                    dx=-10;
                }
            }
            if(value2 > 720 && value2 < 740 && value > 250){
                dx=0;
                if(value2 < 710){
                    dx=-10;
                }
            }
            if(value2 > 970 && value > 250 && value < 350){
                dx=0;
                if(value2 < 970){
                    dx=-10;
                }
            }
            if(value2 > 390 && value2 < 450 && value > 250 && value < 310){
                dx=0;
                if(value2 < 400){
                    dx=-10;
                }
            }
            if(value2 > 970 && value > 360){
                dx=10;  
            }
            if(value2 > 390 && value2 < 640 && value > 110 && value < 200){
                dx=0; 
                if(value2 < 390){
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
        int su = 0;
        int sum=0;
        int suma=0;
        super.paint(grafica);
        Graphics2D gra1 = (Graphics2D) grafica;
        gra1.drawImage(persona1.mostrarimagen(),0,0,getWidth(),getHeight(),this);
        Graphics2D gra = (Graphics2D) grafica;
        
        while(su < 1010){
            gra.drawImage(persona1.mostrarlava(),0+su,99,50,50,this);
            gra.drawImage(persona1.mostrarlava(),0+su,149,50,50,this);
            gra.drawImage(persona1.mostrarlava(),0+su,199,50,50,this);
            gra.drawImage(persona1.mostrarlava(),0+su,249,50,50,this);
            gra.drawImage(persona1.mostrarlava(),0+su,299,50,50,this);
            gra.drawImage(persona1.mostrarlava(),0+su,349,50,50,this);
            gra.drawImage(persona1.mostrarlava(),0+su,399,50,50,this);
            gra.drawImage(persona1.mostrarlava(),0+su,449,50,50,this);
            gra.drawImage(persona1.mostrarlava(),0+su,499,50,50,this);
            gra.drawImage(persona1.mostrarlava(),0+su,549,50,50,this);
            su=su+50;
            sum=sum+35;
            
        }
        Graphics2D ab = (Graphics2D) grafica;
        ab.drawImage(persona1.mostrararbolrosa(),-28,160,125,500,this);
        ab.drawImage(persona1.mostrararbolrosa(),950,245,125,500,this);
        
        Graphics2D a = (Graphics2D) grafica;
        a.drawImage(persona1.mostrarutileria(),125,99,750,300,this);
        a.drawImage(persona1.mostrarutileria(),125,420,750,150,this);
        a.drawImage(persona1.mostrararbol(),115,25,725,105,this);
        a.drawImage(persona1.mostrargen(),55,295,775,150,this);
        a.drawImage(persona1.mostrararb(),820,110,90,270,this);
        a.drawImage(persona1.mostrararb(),325,170,60,200,this);
        
        Graphics2D gra2 = (Graphics2D) grafica;    
        gra2.drawImage(persona1.getImagen(),persona1.getX(),persona1.getY(),null); 

        
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
