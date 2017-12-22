package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ToolBar extends JPanel{
    
    private JButton prev;
    private JButton next;
    private JLabel label;

    public ToolBar(){
        prev = new JButton("<");
        next = new JButton(">");
        label = new JLabel("Image");
        
        add(label);
        add(prev);
        add(next);
    }
        public JButton getPrev() {
        return prev;
    }

    public JButton getNext() {
        return next;
    }

    public JLabel getLabel() {
        return label;
    }
}
