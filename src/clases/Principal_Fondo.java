package clases;

import java.applet.AudioClip;

/**
 *
 * @author Méndez
 */
public class Principal_Fondo extends Thread
{
    public Principal_Fondo(String msg)
    {
        super(msg);
    }
    
    public void run()
    {
        AudioClip Sonido;
        Sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/Main_1.wav"));
        Sonido.loop();
    }
}
  

