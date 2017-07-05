/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.applet.AudioClip;

/**
 *
 * @author Méndez
 */
public class Nivel2_Fondo extends Thread
{
    public Nivel2_Fondo(String msg)
    {
        super(msg);
    }
    
    public void run()
    {
        AudioClip Sonido;
        Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/Level2.wav"));
        Sonido.loop();
    }
    
}
