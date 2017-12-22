package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
    
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    ToolBar tool;
    private ImageDisplay imageDisplay;

    public ImageDisplay getImageDisplay() {
        return imageDisplay;
    }
    public MainFrame(){
        inicializar();
        tool = new ToolBar();
        JPanel prueba = new JPanel();

        prueba.setBackground(Color.red);
        this.getContentPane().add(imageDisplay(),BorderLayout.CENTER); 
        nextImage();
        prevImage();
        this.getContentPane().add(tool,BorderLayout.SOUTH); 

        setVisible(true);
    }

    private void inicializar() {
        setTitle("Image Viewer");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
    
    private JPanel imageDisplay(){
        SwingImageDisplay imageDisplay = new SwingImageDisplay();
        this.imageDisplay = imageDisplay;
        return imageDisplay;
    }

    private void prevImage() {
        tool.getPrev().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                imageDisplay.show(imageDisplay.current().prev());
            }
        });
    }

    private void nextImage() {
               tool.getNext().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                imageDisplay.show(imageDisplay.current().next());
            }
        });}
}
