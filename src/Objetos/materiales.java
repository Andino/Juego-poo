/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Zander
 */
public class materiales {
    
    private String jardin = "/imagenes/jardin1.png";
    private String aguaa = "/imagenes/agua.gif";
    private String arbusto = "/imagenes/arbusto2.png";
    
    private Image imagen2;
    private Image imagen3;
    private Image imagen4;
    private Image imgEnemigo;
    
    public materiales()
    {
        ImageIcon jar = new ImageIcon(this.getClass().getResource(jardin));
        imagen2 = jar.getImage();
        ImageIcon agua = new ImageIcon(this.getClass().getResource(aguaa));
        imagen3 = agua.getImage();
        ImageIcon arbustoo = new ImageIcon(this.getClass().getResource(arbusto));
        imagen4 = arbustoo.getImage();
    }
    
    public Image mostrarimagen(){ return imagen2; }
    
    public Image mostraragua(){ return imagen3; }
   
    public Image mostrararbusto(){ return imagen4; }
    
    public Image mostrarenemigo(){ return imgEnemigo; }
}
