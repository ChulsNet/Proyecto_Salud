package Util;

import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Miguel
 */
public class Metodos {

    public Icon ponerIcono(String path, int ancho, int alto) {
        ImageIcon imagen = null;
        URL url = this.getClass().getResource(path);
        imagen = new ImageIcon(url);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return icono;
    }
    
    public Icon ponerIcono(String path) {
        ImageIcon imagen = null;
        URL url = this.getClass().getResource(path);
        imagen = new ImageIcon(url);
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(32, 32, Image.SCALE_DEFAULT));
        return icono;
    }
}
