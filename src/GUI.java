import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame frame;
    JPanel MainPanel;
    JPanel InstPanel;

    Buttonpanel ButtonPanel;
    JPanel TextPanel;
    JMenuBar menuBar;


    public void setUp() {

        frame = new JFrame();

        // Set up frame object
        frame.setSize(400,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create component objects
        MainPanel = new JPanel();
        ButtonPanel = new Buttonpanel();
        InstPanel = new JPanel();
        TextPanel = new JPanel();
        menuBar = new JMenuBar();

        ButtonPanel.setLayout(new GridBagLayout());
        ButtonPanel.setUp();
        MainPanel.setLayout(new GridLayout());

    }




}
