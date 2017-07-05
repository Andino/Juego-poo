/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Méndez
 */
public class enemigo1 
{
    private String defecto = "/imagenes/Characters/img/mdown1.gif";
    
  
    private int dx = 0;
    private int dy = 0;
    private int x;
    private int y;
    private Image imagen;
    private double velX = 0;
    private double velY = 0;
    
   
    private int a;
    private int b;
    public enemigo1(String url){
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
    
    public enemigo1(String url,int x, int y){
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
                    setImage("/imagenes/Characters/img/sprite_monster_down" + (a % 4) + ".png");
                }
                else
                {
                    setImage("/imagenes/Characters/imágenes/sprite_monster_down" + (a % 4) + ".png");
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
