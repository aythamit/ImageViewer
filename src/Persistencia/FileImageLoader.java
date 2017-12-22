package Persistencia;

import Modelo.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileImageLoader implements ImageLoader{
    
    File[] files;
    
    public FileImageLoader(){}
    public FileImageLoader(File path){
        if(path.isDirectory())
            files = path.listFiles(imageType());
    }
    
    public Image imageAt(final int i){
        return new Image(){

            @Override
            public String name() {
                return files[i].getName();
            }

            @Override
            public InputStream stream() {
                try {
                    return new BufferedInputStream(new FileInputStream(files[i]));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FileImageLoader.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
            }

            @Override
            public Image next() {
                return i == files.length - 1 ? imageAt(0) : imageAt(i + 1);
            }

            @Override
            public Image prev() {
                    return i == 0 ? imageAt(files.length - 1) : imageAt(i - 1);
            }
        };
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
    public Image load() {
       return imageAt(0);
    }
    
  
}
