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
public class Principal_GuardarNombre extends Thread
{
    public Principal_GuardarNombre(String msg)
    {
        super(msg);
    }
    
    public void run()
    {
        AudioClip Sonido;
        Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/Yasou1.wav"));
        Sonido.play();
    }    
}
