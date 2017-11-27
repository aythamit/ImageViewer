package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
    
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    ToolBar tool;
    public MainFrame(){
        inicializar();
        tool = new ToolBar();
        JPanel prueba = new JPanel();
        prueba.setBackground(Color.red);
        this.getContentPane().add(prueba,BorderLayout.CENTER); 
        this.getContentPane().add(tool,BorderLayout.SOUTH); 
        setVisible(true);
    }

    private void inicializar() {
        setTitle("Image Viewer");
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
