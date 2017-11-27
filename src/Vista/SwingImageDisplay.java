/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class SwingImageDisplay extends JPanel{
    
    Image currentImage;
    public SwingImageDisplay(){
        
    }
    
    BufferedImage imageOf(Image imagen){
        return null;
    }
    
    @Override
    public void paint(Graphics g){
        if(currentImage == null)
            return;
        g.drawImage(imageOf(currentImage),0,0,null);
    }
    
}
