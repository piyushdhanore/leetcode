package swing;


import javax.swing.*;
import java.awt.*;

public class settingUpJFrame {
    public static void main(String[] args) {

        //JFrame = a GUI window to add components to
        JFrame frame = new JFrame(); //creates a frame
        frame.setSize(420,420); //sets the x-dimension and y-dimension of the frame
        frame.setTitle("My First Frame"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setResizable(false); //prevent frame from being resize
        frame.getContentPane().setBackground(Color.LIGHT_GRAY); //change color of background


        ImageIcon image = new ImageIcon("src/swing/Rolling.png"); //creates an image icon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.setVisible(true); //make frame visible

    }
}
