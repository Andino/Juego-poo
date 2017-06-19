
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
public class juego3_2 extends JFrame{
    juego3_3 juegoo;
    private static final String Nombre = "Corre que te alcanzan";

   

    private int alto = 100;
    public juego3_2(){
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
    private String jardin = "/imagenes/jardin32.jpg";
    private String lava = "/imagenes/lava.gif";
    private String pasamano = "/imagenes/pasamano.png";
    private String arbolrosa= "/imagenes/arbolrosa.png";
    private String utileria = "/imagenes/puentecon.png";
    
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
        x = 10;
        y = 400;
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
            if(value2 > 920 && value < 240){
                dy=0; 
                if(value > 240){
                 dy=10;
                }  
            }
           
            
        }
        if(key == KeyEvent.VK_DOWN){
            if(value < 470){
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
            if(value2 > 350 && value2 < 600 && value > 380){
                dy=0; 
                if(value < 380){
                 dy=-10;
                }  
            }
            if(value2 > 570 && value2 < 850 && value > 340){
                dy=0; 
                if(value < 340){
                 dy=-10;
                }  
            }
            if(value2 > 70 && value2 < 360 && value > 150){
                dy=0; 
                if(value < 150){
                 dy=-10;
                }  
            }
            if(value2 > 810 && value2 < 860 && value > 150){
                dy=0; 
                if(value < 150){
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
            if(value2 > 200 && value2 < 370 && value > 160){
                dx=0; 
                if(value2 > 370){
                 dx=10;
                }  
            }
            if(value2 > 830 && value2 < 870 && value > 160){
                dx=0; 
                if(value2 > 870){
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
            if(value2 > 60 && value2 < 100 && value > 160){
                dx=0; 
                if(value2 < 60){
                 dx=-10;
                }  
            }
            if(value2 > 800 && value2 < 825 && value > 160){
                dx=0; 
                if(value2 < 800){
                 dx=-10;
                }  
            }
            if(value2 > 910 && value2 < 990 && value > 80 && value < 230){
                dx=0; 
                if(value2 < 910){
                 dx=-10;
                }  
            }
            if(value2 > 560 && value2 < 850 && value > 350){
                dx=0; 
                if(value2 < 570){
                 dx=-10;
                }  
            }
            if(getX() >= 1000){
                juegoo =new juego3_3();
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
        int ma =0;

        super.paint(grafica);
        Graphics2D gra1 = (Graphics2D) grafica;
        gra1.drawImage(persona1.mostrarimagen(),0,0,getWidth(),getHeight(),this);
        Graphics2D gra = (Graphics2D) grafica;
        while(ma < 750){
            gra.drawImage(persona1.mostrarlava(),103+ma,441,50,50,this);
            gra.drawImage(persona1.mostrarlava(),103+ma,391,50,50,this);
            gra.drawImage(persona1.mostrarlava(),103+ma,341,50,50,this);
            gra.drawImage(persona1.mostrarlava(),103+ma,291,50,50,this);
            gra.drawImage(persona1.mostrarlava(),103+ma,241,50,50,this);
            gra.drawImage(persona1.mostrarlava(),103+ma,466,50,50,this);
            ma=ma+50;
        }
        while(su < 1020){
            gra.drawImage(persona1.mostrarlava(),0+su,516,50,60,this);
            su=su+50;
        }
        
        Graphics2D a = (Graphics2D) grafica;
        a.drawImage(persona1.mostrarutileria(),78,-18,895,700,this);
        
        Graphics2D gra2 = (Graphics2D) grafica;    
        gra2.drawImage(persona1.getImagen(),persona1.getX(),persona1.getY(),null); 
        
        Graphics2D abcd = (Graphics2D) grafica;
        abcd.drawImage(persona1.mostrarpasamano(),90,180,580,200,this);
        Graphics2D ab = (Graphics2D) grafica;
        ab.drawImage(persona1.mostrararbolrosa(),328,160,75,300,this);
        ab.drawImage(persona1.mostrararbolrosa(),810,130,90,300,this);
        Graphics2D abc = (Graphics2D) grafica;
        abc.drawImage(persona1.mostrarpasamano(),340,410,580,200,this);
        abc.drawImage(persona1.mostrarpasamano(),598,372,580,200,this);
       
        
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
