package src.Static_Non_Static.Packages.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWT {

    public static void main(String[] args)
    {
        // Declaring a Frame and Label
        Frame frame = new Frame("Ragini");
        Label label = new Label("Hi AWT!");

        // Aligning the label to CENTER
        label.setAlignment(Label.CENTER);

        //creating buttons
        Button btn= new Button("Click Here");
        btn.setBounds(80,100,64,30);
        frame.add(btn);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);

        // Adding Label and Setting the Size of the Frame
        frame.add(label);
        frame.setSize(300, 300);

        // Making the Frame visible
        frame.setVisible(true);

        // Using WindowListener for closing the window
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}
