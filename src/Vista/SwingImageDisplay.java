/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class SwingImageDisplay extends JPanel implements ImageDisplay{
    
    Image currentImage;
    
    BufferedImage imageOf(Image imagen){
        try{
        return ImageIO.read(imagen.stream());
         }catch(IOException e){
             e.printStackTrace();
             return null;
         }
    }
    
    @Override
    public void paint(Graphics g){
        if(currentImage == null)
            return;
        g.drawImage(imageOf(currentImage),0,0,null);
    }

    @Override
    public Image current() {
        return currentImage;
    }

    @Override
    public void show(Image image) {
        this.currentImage = image;
        this.repaint();
    }
    
}
