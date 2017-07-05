/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.applet.AudioClip;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Zander
 */
public class persona {
    
    private String defecto = "/imagenes/pprincipal/persona_abajo_0.gif";
    
  
    private int dx = 0;
    private int dy = 0;
    private int x;
    private int y;
    private Image imagen;
    private double velX = 0;
    private double velY = 0;
    
   
    private int a;
    private int b;
    public persona(String url){
        a = 0;
        x = 10;
        y = 400;
        if(url == "")
        {
            ImageIcon imag = new ImageIcon(this.getClass().getResource(defecto));
            imagen = imag.getImage();
        }else{
            ImageIcon imag = new ImageIcon(this.getClass().getResource(url));
            imagen = imag.getImage();
        }
    }
    
    public persona(String url,int x, int y){
        a = 0;
        this.x = x;
        this.y = y;
        if(url == "")
        {
            ImageIcon imag = new ImageIcon(this.getClass().getResource(defecto));
            imagen = imag.getImage();
        }else{
            ImageIcon imag = new ImageIcon(this.getClass().getResource(url));
            imagen = imag.getImage();
        }
    }
    
    public void moverY(){ y += dy; }
    
    public void moverX(){ x += dx; }
    
    public int getX() { return x; }

    public int getY() { return y; }

    public void setDx(int dx) { this.dx = dx; }

    public void setDy(int dy) { this.dy = dy; }
 
    public Image getImagen() { return imagen; }
    
    public void setImage(String imagen) 
    {
        ImageIcon imag = new ImageIcon(this.getClass().getResource(imagen));
        this.imagen = imag.getImage();
    } 
    
    public void keyPressed(KeyEvent e, int value,int value2)
    {
        int key = e.getKeyCode();
       
        if(key == KeyEvent.VK_UP)
        {
            if(value > 90)
            {
                dy= -5;
                a++;
                if (a % 4 == 1) 
                {
                    setImage("/imagenes/persona_arriba_" + (a % 4) + ".gif");
                    AudioClip Sonido;
                    Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/footprint_grass.wav"));
                    Sonido.play();
                } 
                else if(a % 4 == 2)
                {
                    setImage("/imagenes/persona_arriba_" + (a % 4) + ".gif");
                    
                }
                else if(a % 4 == 3)
                {
                    setImage("/imagenes/persona_arriba_" + (a % 4) + ".gif");
                    
                    
                }
                else if(a % 4 == 0)
                {
                    setImage("/imagenes/persona_arriba_" + (a % 4) + ".gif");
                    a=0;
                }
            }
            else 
            {                
                dy= 0;
                a++;
                if (a % 4 == 1) 
                {
                    setImage("/imagenes/pprincipal/persona_arriba_" + (a % 4) + ".gif");
                    AudioClip Sonido;
                    Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/footprint_grass.wav"));
                    Sonido.play();
                } 
                else if(a % 4 == 2)
                {
                    setImage("/imagenes/pprincipal/persona_arriba_" + (a % 4) + ".gif");
                }
                else if(a % 4 == 3)
                {
                    setImage("/imagenes/pprincipal/persona_arriba_" + (a % 4) + ".gif");
                    Thread foot = new clases.Persona_pasoGrama("foot");
                }
                else if(a % 4 == 0)
                {
                    setImage("/imagenes/pprincipal/persona_arriba_" + (a % 4) + ".gif");
                    a=0;
                }
            }
        }
        if(key == KeyEvent.VK_DOWN)
        {
            if(value <= 435)
            {
               dy= 5;
                a++;
                if (a % 4 == 1) 
                {
                    setImage("/imagenes/pprincipal/persona_abajo_" + (a % 4) + ".gif");
                } 
                else if(a % 4 == 2)
                {
                    setImage("/imagenes/pprincipal/persona_abajo_" + (a % 4) + ".gif");
                }
                else if(a % 4 == 3)
                {
                    setImage("/imagenes/pprincipal/persona_abajo_" + (a % 4) + ".gif");
                    Thread foot = new clases.Persona_pasoGrama("foot");
                }
                else if(a % 4 == 0)
                {
                    setImage("/imagenes/pprincipal/persona_abajo_" + (a % 4) + ".gif");
                    a=0;
                }
            }
            else
            {
                dy= 0;
                a++;
                if (a % 4 == 1) 
                {
                    setImage("/imagenes/pprincipal/persona_abajo_" + (a % 4) + ".gif");
                } 
                else if(a % 4 == 2)
                {
                    setImage("/imagenes/pprincipal/persona_abajo_" + (a % 4) + ".gif");
                }
                else if(a % 4 == 3)
                {
                    setImage("/imagenes/pprincipal/persona_abajo_" + (a % 4) + ".gif");
                }
                else if(a % 4 == 0)
                {
                    setImage("/imagenes/pprincipal/persona_abajo_" + (a % 4) + ".gif");
                    a=0;
                }
            }
            
        }
        if(key == KeyEvent.VK_LEFT){
            if(value2 > 10){
                dx= -5;
                a++;
                if (a % 4 == 1) 
                {
                    setImage("/imagenes/pprincipal/persona_izquierda_" + (a % 4) + ".gif");
                } 
                else if(a % 4 == 2)
                {
                    setImage("/imagenes/pprincipal/persona_izquierda_" + (a % 4) + ".gif");
                }
                else if(a % 4 == 3)
                {
                    setImage("/imagenes/pprincipal/persona_izquierda_" + (a % 4) + ".gif");
                }
                else if(a % 4 == 0)
                {
                    setImage("/imagenes/pprincipal/persona_izquierda_" + (a % 4) + ".gif");
                    a=0;
                }
            }
            else{
                dx= 0;
                a++;
                if (a % 4 == 1) 
                {
                    setImage("/imagenes/pprincipal/persona_izquierda_" + (a % 4) + ".gif");
                } 
                else if(a % 4 == 2)
                {
                    setImage("/imagenes/pprincipal/persona_izquierda_" + (a % 4) + ".gif");
                }
                else if(a % 4 == 3)
                {
                    setImage("/imagenes/pprincipal/persona_izquierda_" + (a % 4) + ".gif");
                }
                else if(a % 4 == 0)
                {
                    setImage("/imagenes/pprincipal/persona_izquierda_" + (a % 4) + ".gif");
                    a=0;
                }
            }
            
        }
        if(key == KeyEvent.VK_RIGHT){
            
            if(value2 < 995){
                dx= 5;
                a++;
                if (a % 4 == 1) 
                {
                    setImage("/imagenes/pprincipal/persona_derecha_" + (a % 4) + ".gif");
                } 
                else if(a % 4 == 2)
                {
                    setImage("/imagenes/pprincipal/persona_derecha_" + (a % 4) + ".gif");
                }
                else if(a % 4 == 3)
                {
                    setImage("/imagenes/pprincipal/persona_derecha_" + (a % 4) + ".gif");

                }
                else if(a % 4 == 0)
                {
                    setImage("/imagenes/pprincipal/persona_derecha_" + (a % 4) + ".gif");
                    a=0;
                }
            }
            
            else{
                dx= 0;
                a++;
                if (a % 4 == 1) 
                {
                    setImage("/imagenes/pprincipal/persona_derecha_" + (a % 4) + ".gif");
                } 
                else if(a % 4 == 2)
                {
                    setImage("/imagenes/pprincipal/persona_derecha_" + (a % 4) + ".gif");
                }
                else if(a % 4 == 3)
                {
                    setImage("/imagenes/pprincipal/persona_derecha_" + (a % 4) + ".gif");
                    
                }
                else if(a % 4 == 0)
                {
                    setImage("/imagenes/pprincipal/persona_derecha_" + (a % 4) + ".gif");
                    a=0;
                }
            }
        }
        
         if(key == KeyEvent.VK_P)
         {
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
    public void movAuto(String direccion, int value,int value2)
    {
        if("arriba".equals(direccion))
        {
            if(value > 90)
            {
                dy= -10;
                a++;
                if (a % 2 == 0)
                {
                    setImage("/imagenes/persona_arriba_" + (a % 2) + ".png");
                }
                else
                {
                    setImage("/imagenes/persona_arriba_" + (a % 2) + ".png");
                }
            }
            else
            {
                dy= 0;
                a++;
                if (a % 2 == 0)
                {
                    setImage("/imagenes/persona_arriba_" + (a % 2) + ".png");
                    //repaint();
                }
                else
                {
                    setImage("/imagenes/persona_arriba_" + (a % 2) + ".png");
                }
            }
        }
        if("abajo".equals(direccion))
        {
            if(value <= 435)
            {
                dy= 10;
                a++;
                if (a % 2 == 0)
                {
                    setImage("/imagenes/persona_abajo_" + (a % 2) + ".png");
                }
                else
                {
                    setImage("/imagenes/persona_abajo_" + (a % 2) + ".png");
                }
            }
            else
            {
                dy= 0;
                a++;
                if (a % 2 == 0)
                {
                    setImage("/imagenes/persona_abajo_" + (a % 2) + ".png");
                }
                else
                {
                    setImage("/imagenes/persona_abajo_" + (a % 2) + ".png");
                }
            }

        }
        if("izquierda".equals(direccion)){
            if(value2 > 10){
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
        if("derecha".equals(direccion)){

            if(value2 < 995){
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
        moverX();
        moverY();
    }
}
