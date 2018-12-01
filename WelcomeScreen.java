import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class WelcomeScreen extends JFrame{

    public WelcomeScreen() {
        super("hello");
        this.setPreferredSize(new Dimension(700,400));

        JPanel panel = new JPanel(new GridLayout(4,4,4,4));

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel dash = (new JLabel("DASH!",SwingConstants.CENTER));
        dash.setFont(new Font("Courier",Font.BOLD,75));
        panel.add(dash);
        panel.setVisible(true);

        JButton btn = (new JButton("PLAY"));
        btn.setPreferredSize(new Dimension(2,4));
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panel.removeAll();
                panel.repaint();                
                //call playScreen class here
            }
        });
        panel.add(btn);


        this.pack();
        this.add(panel);
        this.setVisible(true);



    }

    public static void main(final String[] args) {
        new WelcomeScreen();
    }

}