
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
import JUEGO.menu;
import java.applet.AudioClip;
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
    private String arbolrosa= "/imagenes/entrada.png";
    private String utileria = "/imagenes/imagen123.png";
    private String arbol = "/imagenes/arbo.png";
    private String arbo = "/imagenes/arbusto2_1.png";
    private String arb = "/imagenes/arbolrosa.png";
    private String tabla = "/imagenes/utileria.png";
    private String salida = "/imagenes/salida.png";
    private String puente = "/imagenes/puenteangostoosin.png";
    private String cerrada = "/imagenes/puerta2.png";
    private String medio= "/imagenes/puerta3.png";
    private String abierta = "/imagenes/puerta.png";
    private String fin = "/imagenes/salida_1.png";
    private String llave = "/imagenes/llave.png";
    private String BossDefault = "/imagenes/Characters/boss/img/boss_abajo_1.gif";
    private int dx = 0;
    private int dy = 0;
    private int x;
    private int y;
    
    private Objetos.persona persona1;
    int pos1;
    int pos2;
    
    private Image imagen;
    private Image imagen2;
    private Image imagen3;
    private Image imagen4;
    private Image imagen5;
    private Image imagen6;
    private Image imagen7;
    private Image imagen8;
    private Image imagen9;
    private Image imagen10;
    private Image imagen11;
    private Image imagen12;
    private Image imagen13;
    private Image imagen14;
    private Image imagen15;
    private Image imagen16;
    private Image imagen17;
    private Image imagen18;
    private int a;
    public persona(){
        a = 0;
        x = 0;
        y = 420;
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
        ImageIcon ta = new ImageIcon(this.getClass().getResource(tabla));
        imagen10 = ta.getImage();
        ImageIcon sal = new ImageIcon(this.getClass().getResource(salida));
        imagen11 = sal.getImage();
        ImageIcon puenteangosto = new ImageIcon(this.getClass().getResource(puente));
        imagen12 = puenteangosto.getImage();
        ImageIcon puertacerrada = new ImageIcon(this.getClass().getResource(cerrada));
        imagen13 = puertacerrada.getImage();
        ImageIcon puertamedio = new ImageIcon(this.getClass().getResource(medio));
        imagen14 = puertamedio.getImage();
        ImageIcon puertaabierta = new ImageIcon(this.getClass().getResource(abierta));
        imagen15 = puertaabierta.getImage();
        ImageIcon finn = new ImageIcon(this.getClass().getResource(fin));
        imagen16 = finn.getImage();
        ImageIcon llavee = new ImageIcon(this.getClass().getResource(llave));
        imagen17 = llavee.getImage();
        ImageIcon boss_standing = new ImageIcon(this.getClass().getResource(BossDefault));
        imagen18 = llavee.getImage();
    }
    
    public Image mostrarimagen(){
        return imagen2;
    }
    public Image mostrarBoss()
    {
        return imagen18;
    }
    public Image mostrarllave(){
        return imagen17;
    }
     public Image mostrarfin(){
        return imagen16;
    }
    public Image mostrarpc(){
        return imagen13;
    }
    public Image mostrarpm(){
        return imagen14;
    }
    public Image mostrarpa(){
        return imagen15;
    }
    public Image mostrarpuente(){
        return imagen12;
    }
    public Image mostrarsalida(){
        return imagen11;
    }
    public Image mostrartabla(){
        return imagen10;
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
            if(value > 105){
               
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
            if(value2 > 100 && value2 < 750 && value > 350 && value < 410){
                dy=0;
                if(value > 410){
                    dy=10;
                }
            }
            if(value2 > 860 && value2 < 950 && value < 490){
                dy=0;
                if(value > 490){
                    dy=10;
                }
            }
            if(value2 > -20 && value2 < 120 && value < 250){
                dy=0;
                if(value > 250){
                    dy=10;
                }
            }
            if(value2 > 340 && value2 < 860 && value > 485 && value < 500){
                    dy=0;
                    if(value > 500){
                        dy=10;
                    }
            }
            if(value2 > 930 && value2 < 1010 && value < 110){
                dy=-10;
            }
            
            //aqui es para ver si el jugador atraviesa la puerta final
            if(value2 > 950 && value < 80){
                AudioClip Sonido;
                Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/Congratulations.wav"));
                Sonido.loop();
            }
            
        }
        if(key == KeyEvent.VK_DOWN){
            if(value < 510){
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
            if(value2 > 110 && value2 < 750 && value > 300 && value < 325){
                dy=0;
                if(value < 300){
                    dy=-10;
                }
            }
            if(value2 > 40 && value2 < 120 && value > 260){
                dy=0;
                if(value < 260){
                    dy=-10;
                }
            }
            if(value2 < 60 && value > 420){
                dy=0;
                if(value < 420){
                    dy=-10;
                }
            }
            if(value2 > 720 && value2 < 750 && value > 160 && value < 400){
                    dy=0;
                    if(value < 160){
                        dy=-10;
                    }
            } 
            if(value2 > 340 && value2 < 860 && value > 450 && value < 465){
                    dy=0;
                    if(value < 450){
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
            if(value2 > 100 && value2 < 130 && value > 90 && value <240){
                dx=0;
                if(value2 > 130){
                    dx=10;
                }
            }
            if(value2 > 100 && value2 < 130 && value > 270){
                dx=0;
                if(value2 > 130){
                    dx=10;
                }
            }
            if(value2 > 870 && value2 < 960 && value > 90 && value < 470){
                dx=0;
                if(value2 > 960){
                    dx=10;
                }
            }
      
                if(value2 > 940 && value2 < 960 && value > 460){
                    dx=0;
                    if(value2 > 960){
                        dx=10;
                    }
                }
            if(value2 > 730 && value2 < 760 && value > 170 && value < 400){
                    dx=0;
                    if(value2 > 760){
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
            if(value2 > 30 && value2 < 60 && value >270){
                dx=0; 
                if(value2 < 30){
                 dx=-10;
                }  
            }
            if(value2 > 820 && value2 < 860 && value > 90 && value < 470){
                dx=0;
                if(value2 < 820){
                    dx=-10;
                }
            } 
            if(value2 > 710 && value2 < 740 && value > 170 && value < 400){
                    dx=0;
                    if(value2 < 720){
                        dx=-10;
                    }
            }
            if(value2 > 330 && value2 < 860 && value > 460 && value < 490){
                    dx=0;
                    if(value2 < 340){
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
        
            
        }
        Graphics2D ab = (Graphics2D) grafica;
        ab.drawImage(persona1.mostrararbolrosa(),-25,170,200,500,this);
        ab.drawImage(persona1.mostrarsalida(),890,0,240,700,this);
        if(persona1.getX() > 830 && persona1.getX() < 950 && persona1.getY() > 475){
           ab.drawImage(persona1.mostrarpuente(),840,439,160,245,this);              
        }
        
        ab.drawImage(persona1.mostrarpc(),927,18,125,100,this);
        if(persona1.getX() > 830 && persona1.getY() > 140){
           ab.drawImage(persona1.mostrarpm(),932,15,120,97,this);           
        }
        
        if(persona1.getX() > 870 && persona1.getY() < 150){
           ab.drawImage(persona1.mostrarpa(),926,14,127,103,this);           
        }     
        ab.drawImage(persona1.mostrarfin(),926,5,127,27,this); 
        
        Graphics2D a = (Graphics2D) grafica;
        a.drawImage(persona1.mostrarutileria(),125,99,750,300,this);
        a.drawImage(persona1.mostrarutileria(),125,420,750,150,this);
        ab.drawImage(persona1.mostrarllave(),845,500,25,25,this);
        ab.drawImage(persona1.mostrarllave(),975,155,25,25,this);
        
        a.drawImage(persona1.mostrararbol(),115,25,725,105,this);
        a.drawImage(persona1.mostrartabla(),760,340,105,38,this);
        a.drawImage(persona1.mostrartabla(),760,370,105,38,this);
        a.drawImage(persona1.mostrartabla(),760,400,105,38,this);
        a.drawImage(persona1.mostrargen(),55,300,775,145,this);
        
        Graphics2D gra2 = (Graphics2D) grafica;    
        gra2.drawImage(persona1.getImagen(),persona1.getX(),persona1.getY(),null); 
        
        a.drawImage(persona1.mostrararb(),820,110,90,270,this);
        a.drawImage(persona1.mostrararb(),725,170,60,200,this);
        a.drawImage(persona1.mostrararb(),110,410,40,150,this);
        a.drawImage(persona1.mostrararb(),105,100,45,170,this);
        a.drawImage(persona1.mostrarpasamano(),115,530,600,170,this);
        a.drawImage(persona1.mostrarpasamano(),360,530,600,170,this);
        a.drawImage(persona1.mostrarpasamano(),605,530,600,170,this);
        a.drawImage(persona1.mostrarpasamano(),115,330,600,170,this);
        a.drawImage(persona1.mostrarpasamano(),360,330,600,170,this);
        a.drawImage(persona1.mostrarpasamano(),490,330,600,170,this);
        a.drawImage(persona1.mostrarpasamano(),360,478,600,185,this);
        a.drawImage(persona1.mostrarpasamano(),605,478,600,185,this);
        
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
