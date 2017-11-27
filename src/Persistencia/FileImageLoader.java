package Persistencia;

import Modelo.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileImageLoader implements Image, ImageLoader{
    
    File[] files;
    
    public FileImageLoader(){}
    public FileImageLoader(File path){
        if(path.isDirectory())
            files = path.listFiles(imageType());
        
        for (File file : files) {
            System.out.println("file: " + file.getName());
        }
    }
    
    public Image imageAt(){
        
        
        return null;
    }
    
    public FileFilter imageType() {
            return new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                return pathname.getName().endsWith(".jpg");
                }
            };
 }

    @Override
    public String name() {
        return files[0].getName();
    }

    @Override
    public InputStream stream() {
        return null;
    }

    @Override
    public Image next() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Image prev() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Image load() {
       return imageAt();
    }
    
  
}
