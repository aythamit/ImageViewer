/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Image;
import Persistencia.FileImageLoader;
import Vista.MainFrame;
import java.io.File;

/**
 *
 * @author Usuario
 */
public class ImageViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\Public\\Pictures\\Sample Pictures";
        FileImageLoader listImages = new FileImageLoader(new File(path));
        Image image = listImages.load();
        
        MainFrame mainFrame = new MainFrame();
        
        mainFrame.getImageDisplay().show(image);
    }
    
}
