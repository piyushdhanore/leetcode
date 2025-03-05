package swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Labels {
    public static void main(String[] args) {

        //JLabel = a GUI display area for a string of text, an image or both

        Border border = BorderFactory.createLineBorder(Color.gray,3);

        ImageIcon image = new ImageIcon("src/swing/Michael.png");
        JLabel label = new JLabel(); //creates a label
        label.setText("This is going to be fun"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set image left, right or center of image icon
        label.setVerticalTextPosition(JLabel.TOP); //set image top, bottom or center of image icon
        label.setForeground(Color.green); //set font color
        label.setFont(new Font("Bell MT",Font.BOLD,40)); //set font style
        label.setIconTextGap(-11); //set the gap between text and the image
        label.setBackground(Color.black); //sets background color
        label.setOpaque(true); //display background color
        label.setBorder(border); //set border of label (not image+text)
        label.setVerticalAlignment(JLabel.TOP); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
//        label.setBounds(100,100,300,300); //set(fixes) x,y position within frames as well as dimensions
        // for the above to work, frame.setLayout must be enabled
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(900,900);
//        frame.setLayout(null );
        frame.add(label);
        frame.setVisible(true);
        //you must use all of your labels before pack
        frame.pack();


    }
}
