import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class WelcomeScreen extends JFrame{

    public WelcomeScreen() {
        super("DASH!");
        this.setPreferredSize(new Dimension(700,400));

        JPanel panel = new JPanel(new FlowLayout());
        panel.setBackground(Color.BLUE);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel dash = (new JLabel("DASH!",SwingConstants.CENTER));
        dash.setFont(new Font("Courier",Font.BOLD,75));
        panel.add(dash);
        panel.setVisible(true);

        JButton btn = (new JButton("PLAY"));
        //btn.setBounds(10,10,10,10);
        btn.setPreferredSize(new Dimension(100,50));
        

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                panel.removeAll();
                panel.repaint();                
                //call playScreen class here
                Play play = new PLay(panel);
            }
        });
        panel.add(btn,BorderLayout.SOUTH);


        this.pack();
        this.add(panel);
        this.setVisible(true);
        this.setResizable(false);



    }

    public static void main(final String[] args) {
        new WelcomeScreen();
    }

}